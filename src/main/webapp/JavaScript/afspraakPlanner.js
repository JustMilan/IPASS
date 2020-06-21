document.querySelector("#afspraakSubmit").addEventListener('click', submitAanvraag);

function submitAanvraag(event) {
    let formData = new FormData(document.querySelector("#afspraakInplanForm"));
    let encData = new URLSearchParams(formData.entries());

    fetch("/restservices/afspraakaanvragen", {method: 'POST', body: encData})
        .then(function (response) {
            if (response.ok) {
                console.log(response);
                return response.json();
            } else throw "Aanvraag is verkeerd gegaan";
        })
        .then(() => window.alert("afspraak aanvraag verzonden"))
        .catch(error => alert(error));
}
