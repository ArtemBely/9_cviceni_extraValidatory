package com.company;

public class Validatorovna {
    private Validator[] validatory;
    private int pocetValidatoru;

    public Validatorovna(int kapacita) {
        this.validatory = new Validator[kapacita];
        this.pocetValidatoru = 0;
    }

    public void pridejValidator(Validator validator) {
        if (pocetValidatoru < validatory.length) {
            validatory[pocetValidatoru] = validator;
            pocetValidatoru++;
        } else {
            System.err.println("Nelze přidat další validátor!");
        }
    }

    public void validujVse() {
        for (int i = 0; i < pocetValidatoru; i++) {
            if (!validatory[i].jeValidni()) {
                validatory[i].vypisChybu();
            }
        }
    }
}
