package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner vstup = new Scanner(System.in);

        Validatorovna validatorovna = new Validatorovna(10);

        System.out.print("Zadejte věk: ");
        int vek = vstup.nextInt();
        KladnyValidator klVal = new KladnyValidator(vek);
        if(klVal.jeValidni()) {
            System.out.println("pokracujte");
        }
        else {
            while(vek <= 0) {
                klVal.vypisChybu();
                System.out.print("Zadejte věk znovu: ");
                vek = vstup.nextInt();
            }
        }

        validatorovna.pridejValidator(new KladnyValidator(vek));

        System.out.print("Zadejte měsíc: ");
        int mesicPrint = vstup.nextInt();
        MesicValidator mesicValidator = new MesicValidator(mesicPrint);
        vstup.nextLine();

        if(mesicValidator.jeValidni()) {
            System.out.println("pokracujte");
        }
        else {
            while(mesicPrint < 0 || mesicPrint > 12) {
                mesicValidator.vypisChybu();
                System.out.print("Zadejte mesic znovu: ");
                mesicPrint = vstup.nextInt();
            }
        }

        validatorovna.pridejValidator(new MesicValidator(mesicPrint));

        System.out.print("Zadejte heslo: ");
        String heslo = vstup.nextLine();
        RetezecDelsiNezValidator retezec = new RetezecDelsiNezValidator(heslo, 5);

        if(retezec.jeValidni()) {
            System.out.println("pokracujte");
        }
        else {
            while(heslo.length() <5) {
                retezec.vypisChybu();
                System.out.print("Zadejte heslo znovu: ");
                heslo = vstup.nextLine();
            }
        }

        validatorovna.pridejValidator(new RetezecDelsiNezValidator(heslo, 5));

        System.out.println("Zadejte email: ");
        String email = vstup.nextLine();
        EmailValidator emailValidator = new EmailValidator(email);
        if(emailValidator.jeValidni2(email)) {
            System.out.println("pokracujte");
        }

        else{
            while(!emailValidator.jeValidni2(email)) {
                emailValidator.vypisChybu2();
                System.out.print("Zadejte email znovu: ");
                email = vstup.nextLine();
            }
        }

        System.out.print("Zadejte rok narozeni: ");
        int rok = vstup.nextInt();
        RokValidator rokValidator = new RokValidator(rok);
        if(rokValidator.jeValidni()) {
            System.out.println("pokracujte");
        }

        else{
            while(rok < 1900 || rok > 2021) {
                rokValidator.vypisChybu();
                System.out.print("Zadejte rok znovu: ");
                rok = vstup.nextInt();
            }
        }




        System.out.println("Vek je: " + vek + ", mesic je "  + mesicPrint + ", rok narozeni je:  " + rok + ", heslo je: " +
               heslo +  ", email je: " + email);
        validatorovna.validujVse();

    }
}
