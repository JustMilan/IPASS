document.querySelector("#loginButton").addEventListener('click', login);

function login(event) {
    let formData = new FormData(document.querySelector("#inloggenForm"));
    let encData = new URLSearchParams(formData.entries());

    fetch("/restservices/authentication", {method: 'POST', body: encData})
        .then(function (response) {
            if (response.ok) {
                console.log(response);
                return response.json();
            } else throw "Wrong email/password";
        })
        .then(myJson => window.sessionStorage.setItem("myJWT", myJson.JWT))
        .then(() => window.alert("ingelogd"))
        .then(() => window.location.replace("/HTML/kappersPagina.html"))
        .catch(error => alert(error));
}
