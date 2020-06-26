function krijgAlleAanvragen(event) {

    loginCheck();

    fetch("/restservices/afspraakaanvragen", {method: 'GET', headers: {'Authorization': 'Bearer ' + window.sessionStorage.getItem('myJWT')}})
        .then(function (response) {
            if (response.ok) {
                return response.json();
            }
        })
        .then(data => filterRelevanteInfo(data))
        .catch(console.error)
}

function filterRelevanteInfo(jsonData) {
    let afsprakenArray = [];

    for (let i = 0; i < Object.keys(jsonData).length; i++) {
        let afspraakArray = [];
        let datumtijdformat = "";
        afspraakArray.push(jsonData[i].voornaam);
        afspraakArray.push(jsonData[i].achternaam);
        datumtijdformat += jsonData[i].datumTijd.year.toString();
        datumtijdformat += "-";
        datumtijdformat += jsonData[i].datumTijd.monthValue.toString();
        datumtijdformat += "-";
        datumtijdformat += jsonData[i].datumTijd.dayOfMonth.toString();
        datumtijdformat += " ";
        datumtijdformat += jsonData[i].datumTijd.hour.toString();
        datumtijdformat += ":";
        datumtijdformat += jsonData[i].datumTijd.minute.toString();
        afspraakArray.push(datumtijdformat);
        afspraakArray.push(jsonData[i].email);
        afspraakArray.push(jsonData[i].afspraakVoor);
        afspraakArray.push(jsonData[i].afspraakType);
        afspraakArray.push(jsonData[i].uuid);
        afsprakenArray.push(afspraakArray);
    }
    const table = document.getElementById("afsprakenTabelBody");
    for (let i = 0; i < afsprakenArray.length; i++) {
        let row = table.insertRow();
        row.id = i;
        let voornaamCel = row.insertCell(0);
        let achternaamCel = row.insertCell(1);
        let emailCel = row.insertCell(2);
        let datumTijdCel = row.insertCell(3);
        let afspraakVoorCel = row.insertCell(4);
        let afspraakTypeCel = row.insertCell(5);
        let afspraakAccepteerCel = row.insertCell(6);
        let afspraakWeigerCel = row.insertCell(7);

        voornaamCel.innerHTML = afsprakenArray[i][0];
        voornaamCel.id = "voornaamCel" + i;

        achternaamCel.innerHTML = afsprakenArray[i][1];
        achternaamCel.id = "achternaamCel" + i;

        emailCel.innerHTML = afsprakenArray[i][2];
        emailCel.id = "emailCel" + i;

        datumTijdCel.innerHTML = afsprakenArray[i][3];
        datumTijdCel.id = "datumTijdCel" + i;

        afspraakVoorCel.innerHTML = afsprakenArray[i][4];
        afspraakVoorCel.id = "afspraakVoorCel" + i;

        afspraakTypeCel.innerHTML = afsprakenArray[i][5];
        afspraakTypeCel.id = "afspraakTypeCel" + i;

        let accepteerButton = document.createElement('input');
        accepteerButton.type = "button";
        accepteerButton.className = "accepteerButton";
        accepteerButton.value = "accepteer";
        accepteerButton.id = jsonData[i].uuid;
        accepteerButton.addEventListener("click", () => accepteer(accepteerButton.id))

        afspraakAccepteerCel.appendChild(accepteerButton);

        let weigerButton = document.createElement('input');
        weigerButton.type = "button";
        weigerButton.className = "accepteerButton";
        weigerButton.value = "weiger";
        weigerButton.id = jsonData[i].uuid;
        weigerButton.addEventListener("click", () => weiger(accepteerButton.id))

        afspraakWeigerCel.appendChild(weigerButton);
    }
}

function accepteer(buttonId) {
    fetch("/restservices/afspraakaanvragen/accepteren/" + buttonId, {method: 'PUT', headers: {'Authorization': 'Bearer ' + window.sessionStorage.getItem('myJWT')}})
        .then(function (response) {
            if (response.ok) {
                window.alert("afspraak geaccepteerd");
                window.location.reload(true);
                return response;
            } else throw "Updaten is fout gegaan";
        })
        .catch(error => alert(error));
}


function weiger(buttonId) {
    fetch("/restservices/afspraakaanvragen/weigeren/" + buttonId, {method: 'PUT', headers: {'Authorization': 'Bearer ' + window.sessionStorage.getItem('myJWT')}})
        .then(function (response) {
            if (response.ok) {
                window.alert("afspraak geweigerd");
                window.location.reload(true);
                return response;
            } else throw "Updaten is fout gegaan";
        })
        .catch(error => alert(error));
}

function loginCheck() {
    fetch("/restservices/loggedin",{method: 'GET', headers: {'Authorization': 'Bearer ' + window.sessionStorage.getItem('myJWT')}})
        .then(function (response) {
            if (!response.ok) {
                alert("niet ingelogd");
                window.location.href = "/index.html";
            }
        })
}