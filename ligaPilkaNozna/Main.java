package ligaPilkaNozna;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean shouldContinue = true;
        while (shouldContinue) {

            System.out.println("Wybierz opcję: ");
            System.out.println("0. Wyjście: ");
            System.out.println("1. Wyświetl tabelę: ");
            System.out.println("2. Dodaj drużynę: ");
            System.out.println("3. Wyświetl drużynę: ");

            switch (scanner.nextInt()) {

                case 0 -> shouldContinue = false;
                case 1 -> System.out.println("Wybrano 1");
                case 2 -> System.out.println("Wybrano 2");
                case 3 -> System.out.println("Wybrano 3");

            }

        }

        System.out.println("Koniec programu!");

    }

}
