package ligaPilkaNozna;

import java.util.ArrayList;
import java.util.List;

public class League_1 {
    private final List<Team> teamsOne = new ArrayList<>(8);

    public void addTeamsOneLeague() {
        teamsOne.add(new Team("Kamien", 0, 0, 0, 0));
        teamsOne.add(new Team("Elektro", 0, 0, 0, 0));
        teamsOne.add(new Team("Roslina", 0, 0, 0, 0));
        teamsOne.add(new Team("Walka", 0, 0, 0, 0));
        teamsOne.add(new Team("Ziemia", 0, 0, 0, 0));
        teamsOne.add(new Team("Ogien", 0, 0, 0, 0));
        teamsOne.add(new Team("Spinery", 0, 0, 0, 0));
        teamsOne.add(new Team("Karty", 0, 0, 0, 0));
    }

    public void displayTableOneInformation() {
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
}
