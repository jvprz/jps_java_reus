// Variables to be used
var number1 = 0, number2 = 0, operator;

//Print in input label
function print() {
    document.getElementById("input").value = number1;
}

// Press btn numbers
var firstNumber = true;

function pressNumber(number) {
    if(firstNumber || (number1 == 0 && number1 !== '0.')) {
        number1 = number.toString();
        firstNumber = false;
    } else {
        number1 += number.toString();
    }
    print();
}

// Press point btn
var decimalsBtnPressed = false;

function pressDecimals() {
    if(!decimalsBtnPressed) {
        number1 += ".";
        decimalsBtnPressed = true;
        print();
    }
}

// Clear calculator C btn
function pressC() {
    number1 = 0, number2 = 0;
    print();
}

// Operation btn
operatorFirstTimePressed = true;

function pressOperator(value) {
    if(value == 6) {
        operator = value;
        number2 = number1;
        pressEquals();
    } else {
        if(operatorFirstTimePressed) {
            number2 = number1;
            number1 = 0;
            operator = value;
            decimalsBtnPressed = false;
            print();
            operatorFirstTimePressed = false;
        } else {
            pressEquals();
            number2 = number1;
            number1 = 0;
            operator = value;
            decimalsBtnPressed = false;
            operatorFirstTimePressed = false;
        } 
    } 
}

// Equals btn
function pressEquals() {
    switch(operator) {
        case 1:
            number1 = parseFloat(number2) + parseFloat(number1);
        break;
        case 2:
            number1 = parseFloat(number2) - parseFloat(number1);
        break;
        case 3:
            number1 = parseFloat(number2) * parseFloat(number1);
        break;
        case 4:
            number1 = parseFloat(number2) / parseFloat(number1);
        break;
        case 5:
            number1 = Math.pow(parseFloat(number2), parseFloat(number1));
        break;
        case 6:
            number1 = Math.sqrt(parseFloat(number2));
        break;
        case 7:
            number1 = parseFloat(number1) % parseFloat(number2);
        break;
    }
    print();
    decimalsBtnPressed = false;
    operatorFirstTimePressed = true;
}