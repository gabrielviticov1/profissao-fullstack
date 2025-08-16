/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.IOException;
import java.time.Duration;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author gabrielviticov
 */
public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BOLD = "\u001B[1m";
    public static final String MENU_ESTADO_CIVIL = """ 
Selecione uma opção abaixo referente ao seu estado civil: 

[1] - Solteiro[a]
[2] - Casado[a]
[3] - Divorciado[a]
[4] - Noivo[a]
[5] - União Estável
[6] - Viúvo[a]    

Escolha a opção desejada:  """;

    public static void main(String[] args) throws InterruptedException, IOException {
        /**
         * Dê boas vindas a um usuário no console.
         *
         * Logo depois, peça ao usuário alguns dados: nome completo, cpf,
         * peso, altura e estado civíl.
         *
         * Você terá de receber cada um dos dados e exibi-los de acordo com a
         * descrição do exercício.exercício
         */

        String _nome = "";
        String _cpf = "";
        float _peso = 0.0f;
        float _altura = 0.0f;
        String _estadoCivil = "";
        Scanner _scanner = new Scanner(System.in);
        boolean _isCpfValid = false;
        boolean _isPesoValid = false;
        boolean _isAlturaValid = false;
        boolean _isEstadoCivilValid = false;

        do {
            while (_nome.isBlank()) {
                System.out.print("Informe seu nome completo: ");
                _nome = _scanner.nextLine();
                if (_nome.isBlank()) {
                    System.err.println("Ocorreu um erro. O nome não pode ser vazio. Tente novamente. ");
                    Thread.sleep(Duration.ofMillis(1300));
                }
            }

            while (_isCpfValid == false) {
                System.out.print("Informe seu CPF [só número e sem espaço]: ");
                _cpf = _scanner.nextLine();
                if (_cpf.length() == 11 && _cpf.matches("\\d+")) {
                    System.out.println(ANSI_GREEN + "CPF confirmado com sucesso. " + ANSI_RESET);
                    Thread.sleep(Duration.ofMillis(1300));
                    _isCpfValid = true;
                } else {
                    System.err.println("Ocorreu um erro. O CPF não foi verificado corretamente. Tente novamente. ");
                }

            }

            while (_isPesoValid == false) {
                System.out.print("Informe seu peso [em kg, somente números]: ");
                try {
                    _peso = _scanner.nextFloat();
                    if (_peso > 0f && _peso < 420f) {
                        _isPesoValid = true;
                        System.out.println(ANSI_GREEN + "Peso confirmado. " + ANSI_RESET);
                    }

                } catch (InputMismatchException _exception) {
                    System.err.println("Ocorreu um erro. Você deve informar um valor válido. Tente novamente. " + _exception.getMessage());
                    _scanner.next();
                }

            }

            while (_isAlturaValid == false) {
                System.out.print("Informe sua altura [em metros]: ");
                try {
                    _altura = _scanner.nextFloat();
                    if (_altura > 0.10f && _altura < 2.50f) {
                        _isAlturaValid = true;
                        System.out.println(ANSI_GREEN + "Altura confirmada. " + ANSI_RESET);
                    }
                } catch (InputMismatchException _exception) {
                    System.err.println("Ocorreu um erro. Você deve informar um valor válido. Tente novamente. " + _exception.getMessage());
                    _scanner.next();
                }
            }

            while (_isEstadoCivilValid == false) {
                byte _civilOption = -1;
                System.out.print(MENU_ESTADO_CIVIL);
                try {
                    _civilOption = _scanner.nextByte();
                    if (_civilOption > 0) {
                        _isEstadoCivilValid = true;
                    }
                } catch (InputMismatchException _exception) {
                    System.err.println("Ocorreu um erro. Você deve informar uma opção válida. Tente novamente. " + _exception.getMessage());
                    _scanner.next();
                }

                if (_isEstadoCivilValid == true) {
                    switch (_civilOption) {
                        case 1:
                            _estadoCivil = "Solteiro[a]";
                            break;
                        case 2:
                            _estadoCivil = "Casado[a]";
                            break;
                        case 3:
                            _estadoCivil = "Divorciado[a]";
                            break;
                        case 4:
                            _estadoCivil = "Noivo[a]";
                            break;
                        case 5:
                            _estadoCivil = "União Estável";
                            break;
                        case 6:
                            _estadoCivil = "Viúvo[a]";
                            break;
                        default:
                            _estadoCivil = "Não informado[a]";
                            break;
                    }
                }

            }

            Thread.sleep(Duration.ofMillis(1300));
            System.out.println(ANSI_BLUE + "Você selecionou o estado civil: \"" + _estadoCivil + "\"" + ANSI_RESET);
            break;

        } while (true);
        
        

        Thread.sleep(Duration.ofMillis(1300));
        System.out.println(
            ANSI_BOLD + ANSI_CYAN +
            "--- FICHA DE CADASTRO ---\n" +
            "-------------------------\n" +
            ANSI_RESET +
            String.format("   %sNome: %s%s\n", ANSI_YELLOW, _nome, ANSI_RESET) +
            String.format("   %sCPF: %s%s\n", ANSI_YELLOW, _cpf, ANSI_RESET) +
            String.format("   %sAltura: %.2f m%s\n", ANSI_YELLOW, _altura, ANSI_RESET) +
            String.format("   %sPeso: %.2f kg%s\n", ANSI_YELLOW, _peso, ANSI_RESET) +
            String.format("   %sEstado Civil: %s%s\n", ANSI_YELLOW, _estadoCivil, ANSI_RESET) +
            "\n" +
            ANSI_BOLD + ANSI_GREEN +
            "-------------------------\n" +
            "   CADASTRO FINALIZADO\n" +
            ANSI_RESET
        );
        System.out.println("\n\n");
        Thread.sleep(Duration.ofMillis(1300));
        System.out.println(ANSI_BLUE + "Programado encerrado com sucesso. " + ANSI_RESET);
        Thread.sleep(Duration.ofMillis(1300));
    }

}