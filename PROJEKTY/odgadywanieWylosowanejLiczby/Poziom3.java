package PROJEKTY.odgadywanieWylosowanejLiczby;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Poziom3 {
    private Scanner scanner;
    private int userNumber;
    private int computerNumber;
    private int lives;
    private int count;
    private LosowanieLiczby losowanieLiczby;

    Poziom3(int kon, int live) {
        this.scanner = new Scanner(System.in);
        this.losowanieLiczby = new LosowanieLiczby();
        this.lives = live;
        this.count = 0;
        this.computerNumber = losowanieLiczby.losowanieLiczby(kon);
    }

    void poziom3() {

        System.out.println("Zgadnij liczbe z przedzialu [0;100].");
        System.out.println("Masz " + lives + " proby; powodzenia :)\n");

        try {
            do {

                System.out.println("Zostalo zyc " + lives);
                System.out.print("Podaj liczbe: ");

                userNumber = getNumber();

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
        } catch (InputMismatchException e) {
            System.out.println("Tylko liczba calkowita!\n");
        } finally {
            System.out.println("Koniec poziomu 3!");
        }

    }

    private int getNumber() {
        return scanner.nextInt();
    }
}
