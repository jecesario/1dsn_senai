// Script do Exercício 1
function soma() {
    var soma = 1 + 2 + 3;
    console.log("Resultado da soma: " + soma);
}

soma();

// Script do Exercício 2
function apagar() {
    document.write("imagem apagada");
}

// Script do Exercício 3
function areaCirculo() {
    var raio = 10;
    var resultado = 3.14 * (raio ** 2);
    window.alert("Área do circulo: " + resultado);
}

areaCirculo();

// Script do Exercício 4
function somar() {
    var n1 = parseInt(document.getElementById("n1").innerText);
    var n2 = parseInt(document.getElementById("n2").innerText);
    var conta = n1 + n2;
    var resultado = document.getElementById("resultado");
    resultado.innerHTML = conta;
}
function subtrair() {
    var n1 = parseInt(document.getElementById("n1").innerText);
    var n2 = parseInt(document.getElementById("n2").innerText);
    var conta = n1 - n2;
    var resultado = document.getElementById("resultado");
    resultado.innerHTML = conta;
}
function dividir() {
    var n1 = parseInt(document.getElementById("n1").innerText);
    var n2 = parseInt(document.getElementById("n2").innerText);
    var conta = n1 / n2;
    var resultado = document.getElementById("resultado");
    resultado.innerHTML = conta;
}
function multiplicar() {
    var n1 = parseInt(document.getElementById("n1").innerText);
    var n2 = parseInt(document.getElementById("n2").innerText);
    var conta = n1 * n2;
    var resultado = document.getElementById("resultado");
    resultado.innerHTML = conta;
}