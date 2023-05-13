var values = [true, 5, false, "hola", "adios", 2];

var string, number, boolean, message = "";

for(var value of values) {
    if(typeof(value) === "string") {
        if(string == null) {
            string = value;
        } else {
            if(string.length > value.length) {
                message += string + " > " + value + "\n";
            } else if(string.length < value.length) {
                message += string + " < " + value + "\n";
            } else {
                message += string + " = " + value + "\n";
            }
        }
    } else if(typeof(value) === "boolean") {
        if(boolean == null) {
            boolean = value;
        } else {
            if(boolean != value) {
                message += boolean + " " + value + "\n";
            } else {
                message += boolean + " " + value + "\n";
            }
        }
    } else if(typeof(value) === "number") {
        if(number == null) {
            number = value;
        } else {
            message += (number + value) + "\n";
            message += (number - value) + "\n";
            message += (number * value) + "\n";
            message += (number / value) + "\n";
            message += (number % value) + "\n";
        }
    }
}

alert(message);