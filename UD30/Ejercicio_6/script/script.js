var number = prompt("Introduzca el numero de su dni");
var letter = prompt("Introduzca la letra de su dni");

if(num < 0 || num > 99999999) {
    alert("Numero no válido!");
} else {
    var letters = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'];

    var calculator = letters[num % 23];

    if(calculator != letter) {
        alert("Letra incorrecta!");
    } else {
        alert("Todo correcto!");
    }
}