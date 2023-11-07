package SPOJ;

import java.util.Scanner;

public class DwieCyfrySilni {

    public void silnia() {

        Scanner scanner = new Scanner(System.in);

        int ileObiegowPetli = scanner.nextInt();
        for (int j = 0; j < ileObiegowPetli; j++) {

            int liczba = scanner.nextInt();
            if (liczba > 9) {
                System.out.println("0 0");
            }
            if (liczba <= 9){
                int wynik = 1;
                for (int i = 1; i <= liczba; i++) {
                    wynik *= i;
                }

                int jednosci = wynik % 10;
                int dziesiatki = (wynik / 10) % 10;
                System.out.println(dziesiatki + " " + jednosci);
            }

        }

        //System.out.println(wynik);

        //w javie nie ma typu ktory obsluzy wieksze liczby niz: long wiec trzeba skozystac z klasy: BigInteger!
        //kod dziala ale jest bledna odpowiedz...
        //...sprobuje z klasa BigInteger...

        //int liczba = scanner.nextInt()
        //BigInteger silnia = ;

        /*Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        BigInteger mod = new BigInteger("10");

        if (liczba > 9) {
            System.out.println("0 0");
        }
        if (liczba <= 9){
            BigInteger wynik = new BigInteger("1");
            for (int i = 1; i <= liczba; i++) {
                wynik = wynik.multiply(BigInteger.valueOf(i));
            }

            BigInteger jednosci = wynik.remainder(mod);
            BigInteger dziesiatki = (wynik.divide(mod)).remainder(mod);
            System.out.println(dziesiatki + " " + jednosci);
        }*/
    }
}
