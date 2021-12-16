package com.company;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

   // private final int hodnota;
    private Pattern pattern;
    private Matcher matcher;
    private String email;

    public EmailValidator(String email) {
        this.email = email;
    }


    public boolean jeValidni2(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }

    public void vypisChybu2() {
        System.out.println("Email " + email +  " musi byt spravneho formatu!");
    }

}
