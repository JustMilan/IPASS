document.querySelector("#uitloggen").addEventListener('click', function () {
    window.sessionStorage.clear();
    window.location.replace("/index.html");
    window.alert("uitgelogd");
});