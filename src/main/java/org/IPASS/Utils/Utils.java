package org.IPASS.Utils;

import java.time.LocalDateTime;
import java.util.regex.Pattern;

public class Utils {
    public static boolean checkMail(String mail) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (mail == null)
            return false;
        return pat.matcher(mail).matches();
    }

    public static boolean checkDatumTijd (LocalDateTime datumTijd) {
        return !datumTijd.isBefore(LocalDateTime.now().plusDays(1));
    }

    public static boolean checkNaam (String naam) {
        return !naam.isEmpty();
    }

    public static boolean checkOnderwerpValid(String onderwerp) {
        return !(onderwerp.equals(""));
    }

    public static boolean checkBericht (String bericht) {
        return !bericht.isEmpty();
    }
}
