document.querySelector("#feedbackVerstuur").addEventListener("click", verstuurFeedback)

function verstuurFeedback(event) {
    let formData = new FormData(document.querySelector("#feedbackForm"));
    let encData = new URLSearchParams(formData.entries());

    fetch("/restservices/feedback", {method: 'POST', body: encData})
        .then(function (response) {
            if (response.ok) {
                window.alert("afspraak aanvraag verzonden");
                return response.json();
            } else throw "Feedback versturen is fout gegaan";
        })
        .then(() => window.alert("afspraak aanvraag verzonden"))
        .catch(error => alert(error));
}