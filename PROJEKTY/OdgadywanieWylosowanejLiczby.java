package PROJEKTY;

import java.util.Scanner;

public class OdgadywanieWylosowanejLiczby {
    private Scanner scanner;
    private int userNumber;
    private int computerNumber;
    private int lives;
    private int count;
    private LosowanieLiczby losowanieLiczby;

    OdgadywanieWylosowanejLiczby() {
        this.scanner = new Scanner(System.in);
        this.losowanieLiczby = new LosowanieLiczby();
        this.lives = 3;
        this.count = 0;
        this.computerNumber = losowanieLiczby.losowanieLiczby();
    }

    void odgadywanieWylosowanejLiczby() {

        System.out.println("Zgadnij liczbe z przedzialu [0;10].");
        System.out.println("Masz " + lives + " proby; powodzenia :)\n");

        do {

            System.out.println("Zostalo zyc " + lives);
            System.out.print("Podaj liczbe: ");
            userNumber = scanner.nextInt();
            lives--;
            count++;

            if (computerNumber == userNumber) {
                System.out.println("Trafiles za " + count + " razem! Brawo :)\n");
                break;
            } else {
                if (lives == 0) {
                    System.out.println("Ilosc zyc = " + lives + ", przegrywasz :(\n");
                    break;
                } else {
                    if (userNumber > computerNumber) {
                        System.out.print("Liczba jest za duza. Spruboj jeszcze raz!\n");
                    } else {
                        System.out.print("Liczba jest za mala. Spruboj jeszcze raz!\n");
                    }
                }
                System.out.println();
            }

        } while (computerNumber != userNumber);

        System.out.println("Koniec gry!");

    }
}
