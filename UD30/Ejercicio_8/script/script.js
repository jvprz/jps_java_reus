var number = prompt("Introduzca un numero");

alert(pair(number));

function pair(x) {
    if(x % 2 == 0) {
        return "El valor es par";
    } else {
        return "El valor es impar";
    }
}