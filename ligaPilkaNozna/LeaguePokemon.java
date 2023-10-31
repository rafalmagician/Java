package ligaPilkaNozna;

import java.io.IOException;
import java.util.Scanner;

public class LeaguePokemon {
    private final League_1 league_1 = new League_1();
    private final League_2 league_2 = new League_2();
    private final Scanner scanner = new Scanner(System.in);

    public void addTeamsToLeagues() {
        league_1.addTeamsOneLeague();
        league_2.addTeamsTwoLeague();
    }

    public void displayMenu() throws IOException {
        boolean endApp = true;
        while (endApp) {

            menu();
            switch (scanner.nextInt()) {

                case 0 -> endApp = false;
                case 1 -> league_1.tableInformationLeagueOne();
                //case 2 -> league_2.displayTableTwoInformation();
                case 3 -> league_1.saveToFile();
                case 4 -> league_1.readFromFile();

            }

        }
        System.out.println("Koniec programu!");
    }

    private void menu() {
        System.out.println("Wybierz opcje: ");
        System.out.println("0 -> WYJSCIE");
        System.out.println("1 -> TABELA LIGA 1");
        //System.out.println("2 -> TABELA LIGA 2");
        System.out.println("3 -> ZAPIS DO PLIKU");
        System.out.println("4 -> ODCZYT Z PLIKU");
        System.out.print("-> ");
    }
}
