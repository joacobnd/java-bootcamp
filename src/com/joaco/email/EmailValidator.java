package com.joaco.email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    public static boolean emailValidator(String email) {
//        Pattern pattern = Pattern.compile("@");
//        Matcher matcher = pattern.matcher(email);
//        System.out.println(matcher.find());
//        return matcher.find();

        boolean isValid = false;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                isValid = true;
            }
        }
        System.out.println(isValid);
        return isValid;

    }


}
