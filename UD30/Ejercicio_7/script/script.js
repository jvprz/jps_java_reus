var number = prompt("Introduce un numero");

var factorial = number;
var message = number + "! = " + number;

for (let index = 1; index < num; index++) {
    factorial *= (number - index);
    message += " x " + (number - index);
}

message += " = " + factorial;

alert(message);