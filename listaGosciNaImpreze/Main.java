package listaGosciNaImpreze;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Party party = new Party();

        boolean shouldContinue = true;
        while (shouldContinue) {

            System.out.println("Wybierz opcję: ");
            System.out.println("1. Wyświetl gości: ");
            System.out.println("2. Dodaj gościa: ");
            System.out.println("3. Wyświetl potrawy: ");
            System.out.println("4. Znajdź po numerze telefonu: ");
            System.out.println("5. Wyjście: ");

            switch (scanner.nextInt()) {

                case 1 -> party.displayGuests();
                case 2 -> party.addGuest();
                case 3 -> party.displayMeals();
                case 4 -> party.displayGuestByPhoneNumber();
                case 5 -> shouldContinue = false;

            }

        }

        System.out.println("Koniec programu!");

    }

}
