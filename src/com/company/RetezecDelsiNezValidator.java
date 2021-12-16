package com.company;

public class RetezecDelsiNezValidator implements Validator {
    private final String kontrolovanyRetezec;
    private final int minimalniDelka;

    public RetezecDelsiNezValidator(String kontrolovanyRetzec, int minimalniDelka) {
        this.kontrolovanyRetezec = kontrolovanyRetzec;
        this.minimalniDelka = minimalniDelka;
    }

    @Override
    public boolean jeValidni() {
        return kontrolovanyRetezec.length() >= minimalniDelka;
    }

    @Override
    public void vypisChybu() {
        System.out.println("Řetězec (" + kontrolovanyRetezec + ") nemá alespoň " + minimalniDelka + " znaků!");
    }
}
