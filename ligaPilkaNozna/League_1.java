package ligaPilkaNozna;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League_1 {
    private final Team kamien = new Team("Kamien", 0, 0, 0, 15);
    private final Team elektro = new Team("Elektro", 0, 0, 0, 7);
    private final Team roslina = new Team("Roslina", 0, 0, 0, 3);
    private final Team walka = new Team("Walka", 0, 0, 0, 10);
    private final Team ziemia = new Team("Ziemia", 0, 0, 0, 12);
    private final Team ogien = new Team("Ogien", 0, 0, 0, 5);
    private final Team spinery = new Team("Spinery", 0, 0, 0, 13);
    private final Team karty = new Team("Karty", 0, 0, 0, 17);

    private final List<Team> teamsOne = new ArrayList<>();
    private File file;
    private PrintWriter printWriter;

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
}
