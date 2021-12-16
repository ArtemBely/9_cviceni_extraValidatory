package com.company;

public class RokValidator implements Validator {

    private final int hodnota;

    public RokValidator(int hodnota) {
        this.hodnota = hodnota;
    }

    @Override
    public boolean jeValidni() {

        return (hodnota > 1900) && (hodnota < 2021);
    }

    @Override
    public void vypisChybu() {
        System.out.println("Rok (" + hodnota + ") neni validni!");
    }
}
