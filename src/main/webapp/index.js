const urlSkat = "http://13.74.31.101/api/points";
const urlEgen = "http://localhost:8084/BowlingOpgaveTest/api/scores";

var token = "";
var scores = "";
var total = "";
var result = "";

document.getElementById("btn_token").onclick = fetchGetSkat;
document.getElementById("btn_scores").onclick = fetchGetSkat;
document.getElementById("btn_total").onclick = test;
document.getElementById("btn_result").onclick = test;

function fetchGetSkat() {
    fetch(urlSkat)
        .then(res => res.json())
        .then(data => {
            document.getElementById("test_token").innerHTML = data.token;
            document.getElementById("test_scores").innerHTML = data.points;
            token = data.token;
            scores = data.points;
        });
    
}

function test(){
    console.log(token);
    console.log(scores);
    console.log(total);
    console.log(result);
}


