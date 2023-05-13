window.onload = function() {
    document.getElementById("comprove_date").onclick = function() {
        const pattern = /^([0-2][0-9]|(3)[0-1])(\/)(((0)[0-9])|((1)[0-2]))(\/)\d{4}$/;
        var date = document.getElementById("date").value; 
        if (pattern.test(date)) {
            alert("valid");
        } else {
            alert("no valid");
        }
    
    } 
    document.getElementById("comprove_email").onclick = function(){ 
        const pattern = /^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/;
        var email = document.getElementById("email").value;
        if (pattern.test(email)) {
            alert("valid");
        } else {
            alert("no valid");
        }
    }

    document.getElementById("comprove_name").onclick = function(){
        const pattern = /^[A-z]+\s[A-z]+$/;
        var name = document.getElementById("name").value;
        if (pattern.test(name)) {
            var name_split = name.split(" ").reverse().join();
            alert(name_split);
        } else {
            alert("no valid");
        }
    } 
    document.getElementById("comprove_html").onclick = function(){
        string = document.getElementById("html").value;
        alert(string.replace( /<[^>]+>/g, ''));
    }

}