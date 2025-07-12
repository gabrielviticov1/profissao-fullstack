const matrizGastos = [
 ["Alimentação", 0],
 ["Transporte", 0], 
 ["Lazer", 0]
 ["Outros", 0]
 ["Total", 0]
]

const obterElemento = (id) => document.getElementById(id)
const obterValorInformado = () => obterElemento('valor')
const obterCategoriaInformado = () => obterElemento('categoria').value
const obterCategoria = (matriz, nomeCategoria) => matrizGastos.find((item) => item[0] === nomeCategoria) 
const valorNegativo = (valor) => valor < 0;
const somarValores = (total, valor) => total + valor;

function adicionarGastos() {

}