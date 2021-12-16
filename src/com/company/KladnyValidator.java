package com.company;

public class KladnyValidator implements Validator {
    private final int hodnota;

    public KladnyValidator(int hodnota) {
        this.hodnota = hodnota;
    }

    @Override
    public boolean jeValidni() {
        return hodnota > 0;
    }

    @Override
    public void vypisChybu() {
        System.out.println("Zadaná hodnota (" + hodnota + ") není kladná!");
    }
}
