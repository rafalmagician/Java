package ligaPilkaNozna;

import java.util.Scanner;

public class LeaguePokemon {
    private final League_1 league_1 = new League_1();
    private final League_2 league_2 = new League_2();
    private final Scanner scanner = new Scanner(System.in);

    public void addTeamsToLeagues() {
        league_1.addTeamsOneLeague();
        league_2.addTeamsTwoLeague();
    }

    public void displayMenu() {
        boolean endApp = true;
        while (endApp) {

            menu();
            switch (scanner.nextInt()) {

                case 0 -> endApp = false;
                case 1 -> league_1.displayTableOneInformation();
                case 2 -> league_2.displayTableTwoInformation();

            }

        }
        System.out.println("Koniec programu!");
    }

    private void menu() {
        System.out.println("Wybierz opcje: ");
        System.out.println("0 -> WYJSCIE");
        System.out.println("1 -> TABELA LIGA 1");
        System.out.println("2 -> TABELA LIGA 2");
        System.out.println("3 -> SORTOWANIE LIGA 1");
        System.out.print("-> ");
    }
}
