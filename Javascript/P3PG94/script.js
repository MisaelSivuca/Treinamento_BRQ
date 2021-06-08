function reset() {
    document.getElementById("idade").value = null
    document.getElementById('mensagem').innerHTML = null
}

// Não estou fazendo chamada a esta funcao
function calcularCategoria2() {
    idade = parseInt(document.getElementById('idade').value)
    if (isNaN(idade)) {
        document.getElementById("mensagem").innerHTML = "Você não digitou um número válido"
    }else if (idade < 10) {
        categoria = "Mirim"
        document.getElementById('mensagem').innerHTML = "Com base na sua idade você irá para a categoria :" + categoria
    }else if(idade >=10 && idade <25){
        categoria = "Juvenil"
        document.getElementById('mensagem').innerHTML = "Com base na sua idade você irá para a categoria :" + categoria
    }else if(idade >=25 && idade <50){
        categoria = "Adulto"
        document.getElementById('mensagem').innerHTML = "Com base na sua idade você irá para a categoria :" + categoria
    }else if(idade >=50){
        categoria = "Senior"
        document.getElementById('mensagem').innerHTML = "Com base na sua idade você irá para a categoria :" + categoria
    }else
    document.getElementById('mensagem').innerHTML = "Você não possui categoria."
}  

function calcularCategoria() {
    idade = parseInt(document.getElementById('idade').value)
    if (isNaN(idade)) {
        document.getElementById("mensagem").innerHTML = "Você não digitou um número válido"
    } else if (idade >= 0 && idade <= 4) {
        categoria = "Baby"
        document.getElementById('mensagem').innerHTML = "Com base na sua idade você irá para a categoria :" + categoria
    } else if (idade >= 5 && idade <= 7) {
        categoria = "Infantil A"
        document.getElementById('mensagem').innerHTML = "Com base na sua idade você irá para a categoria :" + categoria
    } else if (idade >= 8 && idade <= 11) {
        categoria = "Infantil B"
        document.getElementById('mensagem').innerHTML = "Com base na sua idade você irá para a categoria :" + categoria
    } else if (idade >= 12 && idade <= 13) {
        categoria = "Juvenil A"
        document.getElementById('mensagem').innerHTML = "Com base na sua idade você irá para a categoria :" + categoria
    } else if (idade >= 14 && idade <= 17) {
        categoria = "Juven=il B"
        document.getElementById('mensagem').innerHTML = "Com base na sua idade você irá para a categoria :" + categoria
    } else if (idade >= 18 && idade <= 25) {
        categoria = "Adulto"
        document.getElementById('mensagem').innerHTML = "Com base na sua idade você irá para a categoria :" + categoria
    } else if (idade >= 26 && idade <= 35) {
        categoria = "Adulto Master"
        document.getElementById('mensagem').innerHTML = "Com base na sua idade você irá para a categoria :" + categoria
    } else if (idade >= 36 && idade <= 49) {
        categoria = "Adulto Power"
        document.getElementById('mensagem').innerHTML = "Com base na sua idade você irá para a categoria :" + categoria
    }else if (idade >= 50) {
        categoria = "Senior"
        document.getElementById('mensagem').innerHTML = "Com base na sua idade você irá para a categoria :" + categoria
    } else
        document.getElementById('mensagem').innerHTML = "Você não possui categoria."
}  