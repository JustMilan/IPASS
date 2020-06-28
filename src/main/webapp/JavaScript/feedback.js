document.querySelector("#feedbackVerstuur").addEventListener("click", verstuurFeedback)

function verstuurFeedback(event) {
    let formData = new FormData(document.querySelector("#feedbackForm"));
    let encData = new URLSearchParams(formData.entries());

    fetch("/restservices/feedback", {method: 'POST', body: encData})
        .then(function (response) {
            if (response.ok) {
                window.alert("afspraak aanvraag verzonden");
                window.reload(true);
                return response;
            } else throw "Feedback versturen is fout gegaan";
        })
        .catch(error => alert(error));
}