var text = prompt("Introduzca una cadena de texto.");

alert(textoMayMinMix(text));

function textoMayMinMix(x) {
    var booleanMay, booleanMin;

    for (let index = 0; index < x.length; index++) {
        if(x.charAt(index) >= 'A'  && x.charAt(index) <= 'Z') {
            booleanMay = true;
        } else if(x.charAt(index) >= 'a'  && x.charAt(index) <= 'z') {
            booleanMin = true;
        }
    }
    if(booleanMay && booleanMin) {
        return "Mayusculas y Minusculas";
    } else if(booleanMay) {
        return "Mayusculas";
    } else if(booleanMin) {
        return "Minusculas";
    } else {
        return "Sin mayusculas y minusculas";
    }
}