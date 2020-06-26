document.querySelector("#uitloggen").addEventListener('click', function () {

    loginCheck();

    window.sessionStorage.clear();
    window.location.replace("/index.html");
    window.alert("uitgelogd");
});

function loginCheck() {
    fetch("/restservices/loggedin", {method: 'GET'})
        .then(function (response) {
            if (response.ok) {
                return response.json();
            } else window.location.href ="/index.html";
        })
}