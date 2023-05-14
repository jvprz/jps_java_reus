function dateUpdate() {
    var fecha = new Date(Date.now());

    document.getElementById("h").innerText = (fecha.getHours());
    document.getElementById("m").innerText = (fecha.getMinutes());
    document.getElementById("s").innerText = (fecha.getSeconds());

    setTimeout(dateUpdate, 1000);
}

window.onload = function() {
    dateUpdate();
};