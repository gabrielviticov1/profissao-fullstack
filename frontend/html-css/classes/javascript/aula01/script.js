/*
 Crie um programa para um Cinema, onde o usuário possa digitar o título e a duração de um filme em minutos. Exiba o título do filme e converta a duração para horas e minutos
*/






function convert() {
 const nomeFilme = document.getElementById("titulo").value
 const duracaoFilme = document.getElementById("duracao").value
 const horas = Math.floor(duracaoFilme / 60)
 const duracaoEmHoras = duracaoFilme - horas * 60
 document.getElementById("nomeFilme").textContent = "Título do filme: " + `\"${nomeFilme}\"`
 document.getElementById("duracaoFilme").textContent = "Duração em horas: " + horas + " hora(s) e " + duracaoEmHoras + " minutos de duração"
}