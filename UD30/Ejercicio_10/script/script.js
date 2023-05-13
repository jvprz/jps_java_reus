var text = prompt("Introduzca una cadena de texto.");

alert(textP(text));

function textoP(x)
{
    string_1 = "";
    string_2 = "";

    for (let index = 0; index < x.length; index++) {
        if(x.charAt(index) != ' ') {
            string_1 += x.charAt(index);
        }
    }

    for (let index = str1.length-1; index >= 0; index--) {
        string_2 += string_1.charAt(index);
    }

    if(str1.toLowerCase() === str2.toLowerCase()) {
        return "Palindromo.";
    } else {
        return "No es palindromo.";
    }
}