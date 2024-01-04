package PROJEKTY;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int computerNumber = random.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);
        int userNumber;

        int lives = 3;

        do {
            System.out.println("Zostalo zyc " + lives);
            System.out.print("Podaj liczbe: ");
            userNumber = scanner.nextInt();

            if (computerNumber == userNumber) {
                System.out.println("Trafiles! Brawo :)");
                break;
            } else {
                if (lives == 0) {
                    System.out.println("Ilosc zyc = " + lives + ", przegrywasz :(");
                    break;
                } else {
                    if (userNumber > computerNumber) {
                        System.out.println("Liczba jest za duza");
                    } else {
                        System.out.println("Liczba jest za mala");
                    }

                    System.out.println("spruboj jeszcze raz!");
                    lives--;
                }
            }

        } while (computerNumber != userNumber);

        System.out.println("Koniec gry!");

    }

}
