const urlSkat = "http://13.74.31.101/api/points";
const urlEgen = "http://localhost:8084/BowlingOpgaveTest/api/scores";

var token = "";
var scores = "";
var total = "";
var result = "";

document.getElementById("btn_token").onclick = fetchGetSkat;
document.getElementById("btn_scores").onclick = fetchGetSkat;
document.getElementById("btn_total").onclick = fetchGetEgen;
document.getElementById("btn_result").onclick = fetchPostSkat;

function fetchGetSkat() {
    fetch(urlSkat)
        .then(res => res.json())
        .then(data => {
            document.getElementById("txt_token").innerHTML = data.token;
            document.getElementById("txt_scores").innerHTML = data.points;
            token = data.token;
            scores = data.points;
        });
}

function fetchGetEgen() {

    const scoresSkat = JSON.stringify(
            {scores: scores}
        );
    const options = jsonFormatMethod("POST", scoresSkat);
 
    fetch(urlEgen, options)
        .then(res => res.json())
        .then(data => {
            document.getElementById("txt_total").innerHTML = data;
            total = data;
        });
}

function fetchPostSkat() {

    const scoresSkat = JSON.stringify(
            {token: token, points:total}
        );
    const options = jsonFormatMethod("POST", scoresSkat);
 
    fetch(urlSkat, options)
        .then(res => res.json())
        .then(data => {
            document.getElementById("txt_result").innerHTML = data.success;
            result = data.success;
        });
}

function jsonFormatMethod(method, body) {
    var opts = {
      method: method,
      headers: {
        "Content-type": "application/json",
        Accept: "application/json"
      },
      body: body
    };
    return opts;
  }


