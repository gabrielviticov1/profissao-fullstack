function calc() {
    let height = document.getElementById("height").value
    let weight = document.getElementById("weight").value
    let imc = 0
    let category = ""
    imc = weight / (height ** 2)
    document.getElementById("yourImc").textContent = "Seu IMC é de: " + imc.toFixed(2)
    if (imc < 18.5) {
        category = "Magreza"
        document.getElementById("category").textContent = "Você está em estado de: " + category
    }
    else if (imc <= 24.9) {
        category = "Peso normal"
        document.getElementById("category").textContent = "Você está em estado de: " + category
    }
    else if (imc <= 30) {
        category = "Sobrepeso"
        document.getElementById("category").textContent = "Você está em estado de: " + category
    }
    else if (imc > 30) {
        category = "Obesidade"
        document.getElementById("category").textContent = "Você está em estado de: " + category
    }
    else {
        category = "Não calculado"
        document.getElementById("category").textContent = "Você está em estado de: " + category
    }
}