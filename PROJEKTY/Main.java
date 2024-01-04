package PROJEKTY;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int computerNumber = random.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);
        int userNumber;

        do {
            System.out.print("Podaj liczbe: ");
            userNumber = scanner.nextInt();

            if (computerNumber == userNumber) {
                System.out.println("Trafiles! Brawo :)");
                break;
            } else {
                System.out.println("Niestety, spruboj jeszcze raz!");
            }

        } while (computerNumber != userNumber);

    }

}
