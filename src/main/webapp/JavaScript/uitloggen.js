document.querySelector("#uitloggen").addEventListener('click', function () {

    window.sessionStorage.clear();
    window.location.replace("/index.html");
    window.alert("uitgelogd");
});

function loginCheck() {
    fetch("/restservices/loggedin",
        {method: 'GET', headers: {'Authorization': 'Bearer ' + window.sessionStorage.getItem('myJWT')}})
        .then(function (response) {
            if (!response.ok) {
                alert("niet ingelogd");
                window.location.href = "/index.html";
            }
        })
}