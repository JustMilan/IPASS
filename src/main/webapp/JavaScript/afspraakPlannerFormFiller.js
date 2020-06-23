document.getElementById('afspraakVoor').addEventListener('change', voegElementenToe);

function voegElementenToe() {

    resetAlleOpties();

    let tweedeDropDown = document.getElementById("afspraakType");

    if (document.getElementById('dames').selected === true) {

        let knippenEnDrogen = document.createElement("option");
        let wassenEnKnippenEnDrogen = document.createElement("option");
        let wassenEnKnippenEnModelFohnen = document.createElement("option");
        let wassenEnWatergolf = document.createElement("option");
        let wassenEnModelfohnen = document.createElement("option");

        knippenEnDrogen.text = "Knippen & Drogen";
        knippenEnDrogen.name = "knippenEnDrogen"; // probeersel
        knippenEnDrogen.value = "knippenEnDrogen";
        knippenEnDrogen.id = "knippenEnDrogen";

        wassenEnKnippenEnDrogen.text = "Wassen & Knippen & Drogen";
        wassenEnKnippenEnDrogen.value = "wassenEnKnippenEnDrogen";
        wassenEnKnippenEnDrogen.id = "wassenEnKnippenEnDrogen";

        wassenEnKnippenEnModelFohnen.text = "Wassen & Knippen & Model föhnen";
        wassenEnKnippenEnModelFohnen.value = "wassenEnKnippenEnModelFohnen";
        wassenEnKnippenEnModelFohnen.id = "wassenEnKnippenEnModelFohnen";

        wassenEnWatergolf.text = "Wassen & Watergolf";
        wassenEnWatergolf.value = "wassenEnWatergolf";
        wassenEnWatergolf.id = "wassenEnWatergolf";

        wassenEnModelfohnen.text = "Wassen & Model föhnen";
        wassenEnModelfohnen.value = "wassenEnModelfohnen";
        wassenEnModelfohnen.id = "wassenEnModelfohnen";


        tweedeDropDown.appendChild(knippenEnDrogen);
        tweedeDropDown.appendChild(wassenEnKnippenEnDrogen);
        tweedeDropDown.appendChild(wassenEnKnippenEnModelFohnen);
        tweedeDropDown.appendChild(wassenEnWatergolf);
        tweedeDropDown.appendChild(wassenEnModelfohnen);

    } else if (document.getElementById('heren').selected === true) {

        let tondeuse = document.createElement("option");
        let knippen = document.createElement("option");
        let ouderen = document.createElement("option");
        let wassen = document.createElement("option");
        let baardKnippen = document.createElement("option");

        tondeuse.text = "Tondeuse";
        tondeuse.value = "tondeuse";
        tondeuse.id = "tondeuse";

        knippen.text = "Knippen";
        knippen.value = "knippen";
        knippen.id = "knippen";

        ouderen.text = "65+";
        ouderen.value = "ouderen";
        ouderen.id = "ouderen";

        wassen.text = "Wassen";
        wassen.value = "wassen";
        wassen.id = "wassen";

        baardKnippen.text = "Baard knippen";
        baardKnippen.value = "baardKnippen";


        tweedeDropDown.appendChild(tondeuse);
        tweedeDropDown.appendChild(knippen);
        tweedeDropDown.appendChild(ouderen);
        tweedeDropDown.appendChild(wassen);
        tweedeDropDown.appendChild(baardKnippen);

    } else if (document.getElementById('kinderen').selected === true) {

        let kinderenTotDrieKnippen = document.createElement("option");
        let kinderenTotTwaalfKnippen = document.createElement("option");

        kinderenTotDrieKnippen.text = "Kinderen tot 3 jaar knippen";
        kinderenTotDrieKnippen.value = "kinderenTotDrieKnippen";
        kinderenTotDrieKnippen.id = "kinderenTotDrieKnippen";

        kinderenTotTwaalfKnippen.text = "Kinderen tot 12 jaar knippen";
        kinderenTotTwaalfKnippen.value = "kinderenTotTwaalfKnippen";
        kinderenTotTwaalfKnippen.id = "kinderenTotTwaalfKnippen";

        tweedeDropDown.appendChild(kinderenTotDrieKnippen);
        tweedeDropDown.appendChild(kinderenTotTwaalfKnippen);


    } else if (document.getElementById('bruidskapsels').selected === true) {

        let proefkapselKortHaar = document.createElement("option");
        let proefkapselLangHaar = document.createElement("option");
        let kapselKortHaarInSalon = document.createElement("option");
        let kapselKortHaarThuis = document.createElement("option");
        let kapselLangHaarInSalon = document.createElement("option");
        let kapselLangHaarThuis = document.createElement("option");

        proefkapselKortHaar.text = "Proefkapsel kort haar";
        proefkapselKortHaar.value = "proefkapselKortHaar";
        proefkapselKortHaar.id = "proefkapselKortHaar";

        proefkapselLangHaar.text = "Proefkapsel lang haar";
        proefkapselLangHaar.value = "proefkapselLangHaar";
        proefkapselLangHaar.id = "proefkapselLangHaar";

        kapselKortHaarInSalon.text = "bruidje kort haar in de salon";
        kapselKortHaarInSalon.value = "kapselKortHaarInSalon";
        kapselKortHaarInSalon.id = "kapselKortHaarInSalon";

        kapselLangHaarInSalon.text = "bruidje lang haar in de salon";
        kapselLangHaarInSalon.value = "kapselLangHaarInSalon";
        kapselLangHaarInSalon.id = "kapselLangHaarInSalon";

        kapselKortHaarThuis.text = "bruidje kort haar thuis";
        kapselKortHaarThuis.value = "kapselKortHaarThuis";
        kapselKortHaarThuis.id = "kapselKortHaarThuis";

        kapselLangHaarThuis.text = "bruidje lang haar thuis";
        kapselLangHaarThuis.value = "kapselLangHaarThuis";
        kapselLangHaarThuis.id = "kapselLangHaarThuis";

        tweedeDropDown.appendChild(proefkapselKortHaar);
        tweedeDropDown.appendChild(proefkapselLangHaar);
        tweedeDropDown.appendChild(kapselKortHaarInSalon);
        tweedeDropDown.appendChild(kapselLangHaarInSalon);
        tweedeDropDown.appendChild(kapselKortHaarThuis);
        tweedeDropDown.appendChild(kapselLangHaarThuis);

    } else if (document.getElementById('permanent').selected === true) {

        let deelpermanent = document.createElement("option");
        let permanent = document.createElement("option");
        let ammoniakvrijeDeelpermanent = document.createElement("option");
        let ammoniakvrijePermanent = document.createElement("option");
        let groveOmvorming = document.createElement("option");

        deelpermanent.text = "Deelpermanent";
        deelpermanent.value = "deelpermanent";
        deelpermanent.id = "deelpermanent";

        permanent.text = "Permanent";
        permanent.value = "permanent";
        permanent.id = "permanent";

        ammoniakvrijeDeelpermanent.text = "Ammoniakvrije deelpermanent";
        ammoniakvrijeDeelpermanent.value = "ammoniakvrijeDeelpermanent";
        ammoniakvrijeDeelpermanent.id = "ammoniakvrijeDeelpermanent";

        ammoniakvrijePermanent.text = "Ammoniakvrije permanent";
        ammoniakvrijePermanent.value = "ammoniakvrijePermanent";
        ammoniakvrijePermanent.id = "ammoniakvrijePermanent";

        groveOmvorming.text = "Grove omvorming";
        groveOmvorming.value = "groveOmvorming";
        groveOmvorming.id = "groveOmvorming";

        tweedeDropDown.appendChild(deelpermanent);
        tweedeDropDown.appendChild(permanent);
        tweedeDropDown.appendChild(ammoniakvrijeDeelpermanent);
        tweedeDropDown.appendChild(ammoniakvrijePermanent);
        tweedeDropDown.appendChild(groveOmvorming);

    } else if (document.getElementById('kleuren').selected === true) {

        let basisKleuring = document.createElement("option");
        let ammoniakvrijeKleuring = document.createElement("option");
        let semiPermanenteKleuring = document.createElement("option");
        let highlightsenLowlights = document.createElement("option");
        let coupeSoleil = document.createElement("option");

        basisKleuring.text = "Basis kleuring";
        basisKleuring.value = "basisKleuring";
        basisKleuring.id = "basisKleuring";

        ammoniakvrijeKleuring.text = "Ammoniakvrije kleurin";
        ammoniakvrijeKleuring.value = "ammoniakvrijeKleuring";
        ammoniakvrijeKleuring.id = "ammoniakvrijeKleuring";

        semiPermanenteKleuring.text = "Semi-permanente kleuring";
        semiPermanenteKleuring.value = "semiPermanenteKleuring";
        semiPermanenteKleuring.id = "semiPermanenteKleuring";

        highlightsenLowlights.text = "Highlights en lowlights";
        highlightsenLowlights.value = "highlightsenLowlights";
        highlightsenLowlights.id = "highlightsenLowlights";

        coupeSoleil.text = "Coupe soleil";
        coupeSoleil.value = "coupeSoleil";
        coupeSoleil.id = "coupeSoleil";

        tweedeDropDown.appendChild(basisKleuring);
        tweedeDropDown.appendChild(ammoniakvrijeKleuring);
        tweedeDropDown.appendChild(semiPermanenteKleuring);
        tweedeDropDown.appendChild(highlightsenLowlights);
        tweedeDropDown.appendChild(coupeSoleil);
    }
}

function resetAlleOpties() {
    document.getElementById('afspraakType').length = 0;
}