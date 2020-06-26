function krijgAlleGeaccepteerdeAanvragen(event) {

    loginCheck();

    fetch("/restservices/afspraakaanvragen/geaccepteerd", {method: 'GET'})
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
    const table = document.getElementById("geaccepteerdeAfsprakenTabelBody");
    for (let i = 0; i < afsprakenArray.length; i++) {
        let row = table.insertRow();
        row.id = i;
        let voornaamCel = row.insertCell(0);
        let achternaamCel = row.insertCell(1);
        let emailCel = row.insertCell(2);
        let datumTijdCel = row.insertCell(3);
        let afspraakVoorCel = row.insertCell(4);
        let afspraakTypeCel = row.insertCell(5);

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
    }
}

function loginCheck() {
    fetch("/restservices/loggedin", {method: 'GET'})
        .then(function (response) {
            if (response.ok) {
                return response.json();
            } else window.location.href ="/index.html";
        })
}