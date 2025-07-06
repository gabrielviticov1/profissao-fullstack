let firstName = ""
let lastName = ""
let email = ""
let password = ""
let confirmPassword = ""

function isNullOrEmpty(value) {
 return value === null || value === undefined || value.trim() === ''
}

function createNewAccount() {
 firstName = document.getElementById("firstName").value
 lastName = document.getElementById("lastName").value
 email = document.getElementById("email").value
 password = document.getElementById("password").value
 confirmPassword = document.getElementById("confirmPassword").value
 if (isNullOrEmpty(firstName) === false) {
  if (isNullOrEmpty(lastName) === false) {
   if (isNullOrEmpty(email) === false) {
    if (isNullOrEmpty(password) === false) {
     if (isNullOrEmpty(confirmPassword) === false) {
      console.log("Todos os campos foram preenchidos corretamente")
      if (password.toLowerCase() === confirmPassword.toLowerCase()) {
       console.log("e todas as senha foram conferidas")
       document.getElementById("txtFirstName").textContent = "Nome: " + firstName
       document.getElementById("txtLastName").textContent = "Sobrenome: " + lastName
       document.getElementById("txtEmail").textContent = "Email: " + email
       document.getElementById("txtPassword").textContent = "Senha: " + password
       document.getElementById("txtConfirmPassword").textContent = "A senha está confirmada? " + "Sim"
       
      } else {
       alert("as senha não foram conferidas")
      }
     }
    }
   }
  }
 }
}