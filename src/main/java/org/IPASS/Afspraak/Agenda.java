package org.IPASS.Afspraak;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Agenda {
    private Afspraak afspraak;
    private LocalDateTime datumTijd;
    private ArrayList<String> afsprakenLijst = new ArrayList<>();
    private ArrayList<?> tijdSloten = new ArrayList<>();

    public void nieuweAfspraak(Afspraak afspraak, LocalDateTime datumTijd) {
        String volledigeAfspraak = afspraak.toString() + datumTijd.toString();
        afsprakenLijst.add(volledigeAfspraak);
    }
}
