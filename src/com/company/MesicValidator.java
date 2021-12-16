package com.company;

public class MesicValidator implements Validator {
    private final int hodnota;

    public MesicValidator(int hodnota) {
        this.hodnota = hodnota;
    }

    @Override
    public boolean jeValidni() {
        return hodnota >= 1 && hodnota <= 12;
    }

    @Override
    public void vypisChybu() {
        System.out.println("Měsíc není mezi 1 až 12!");
    }
}
