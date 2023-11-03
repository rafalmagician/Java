package ligaPilkaNozna;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class League_1 {
    private final Team kamien = new Team("Kamien", 0, 0, 0, 0);
    private final Team elektro = new Team("Elektro", 0, 0, 0, 0);
    private final Team roslina = new Team("Roslina", 0, 0, 0, 0);
    private final Team walka = new Team("Walka", 0, 0, 0, 0);
    private final Team ziemia = new Team("Ziemia", 0, 0, 0, 0);
    private final Team ogien = new Team("Ogien", 0, 0, 0, 0);
    private final Team spinery = new Team("Spinery", 0, 0, 0, 0);
    private final Team karty = new Team("Karty", 0, 0, 0, 0);

    private final List<Team> teamsOne = new ArrayList<>();
    private File file;
    private PrintWriter printWriter;
    private Scanner scaner = new Scanner(System.in);

    public void addTeamsOneLeague() {
        teamsOne.add(kamien);
        teamsOne.add(elektro);
        teamsOne.add(roslina);
        teamsOne.add(walka);
        teamsOne.add(ziemia);
        teamsOne.add(ogien);
        teamsOne.add(spinery);
        teamsOne.add(karty);
    }

    public void mecz() {
        System.out.println(kamien.getTeamName() + " - " + elektro.getTeamName());
        System.out.println("Wynik");

        kamien.setGame(1);
        elektro.setGame(1);

        System.out.print("Gole Kamien: ");
        int k = Integer.valueOf(scaner.nextLine());
        kamien.setGainGoal(k);
        elektro.setLoseGoal(k);
        System.out.print("Gole Elektro: ");
        int e = Integer.valueOf(scaner.nextLine());
        elektro.setGainGoal(e);
        kamien.setLoseGoal(e);

        if (k > e) {
            kamien.setPkt(3);
            elektro.setPkt(0);
        } else if (k < e) {
            kamien.setPkt(0);
            elektro.setPkt(3);
        } else {
            kamien.setPkt(1);
            elektro.setPkt(1);
        }

        System.out.println(kamien.getTeamName() + " " + kamien.getGainGoal() + ":" + elektro.getGainGoal() + " " + elektro.getTeamName());

        System.out.println();
    }

    public void tableInformationLeagueOne() {
        sortTeamsLeagueOne();

        int i = 1;
        System.out.println("#  DRUZYNA   M   B   P");
        for (Team team : teamsOne) {
            System.out.print(i + "  ");
            if (team.getTeamName().length() == 7) {
                System.out.println(team.getTeamName() + "   " + team.getGame() + "  " + team.getGainGoal() + ":" + team.getLoseGoal() + "  " + team.getPkt());
            } else if (team.getTeamName().length() == 6) {
                System.out.println(team.getTeamName() + "    " + team.getGame() + "  " + team.getGainGoal() + ":" + team.getLoseGoal() + "  " + team.getPkt());
            } else if (team.getTeamName().length() == 5) {
                System.out.println(team.getTeamName() + "     " + team.getGame() + "  " + team.getGainGoal() + ":" + team.getLoseGoal() + "  " + team.getPkt());
            }
            i++;
        }
        System.out.println();
    }

    private void sortTeamsLeagueOne() {
        Collections.sort(teamsOne);
    }

    public void saveToFile() throws IOException {
        file = new File("liga.txt");
        if (!file.exists()) {
            file.createNewFile();
        } else {
            printWriter = new PrintWriter(file);
            printWriter.println(teamsOne.toString());
            printWriter.close();
        }
    }

    public void readFromFile() throws FileNotFoundException {
        file = new File("liga.txt");
        if (file.exists()) {
            Scanner readFile = new Scanner(file);

            while (readFile.hasNext()) {
                System.out.println(readFile.nextLine());
            }

        }
    }
}
