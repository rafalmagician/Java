package ligaPilkaNozna;

import java.util.ArrayList;
import java.util.List;

public class League_2 {
    private List<Team> teamsTwo = new ArrayList<>(10);

    public void addTeamsTwoLeague() {
        teamsTwo.add(new Team("Psycho", 0, 0, 0, 0));
        teamsTwo.add(new Team("Lod", 0, 0, 0, 0));
        teamsTwo.add(new Team("Smok", 0, 0, 0, 0));
        teamsTwo.add(new Team("Normalka I", 0, 0, 0, 0));
        teamsTwo.add(new Team("Duch", 0, 0, 0, 0));
        teamsTwo.add(new Team("Klocki", 0, 0, 0, 0));
        teamsTwo.add(new Team("Trucizna I", 0, 0, 0, 0));
        teamsTwo.add(new Team("Woda", 0, 0, 0, 0));
        teamsTwo.add(new Team("Trucizna II", 0, 0, 0, 0));
        teamsTwo.add(new Team("Normalka II", 0, 0, 0, 0));
    }

    public void displayTeamTwoInformation() {
        int i = 1;
        System.out.println("#  DRUZYNA     M   B   P");
        for (Team team : teamsTwo) {
            System.out.print(i + "  ");
            if (team.getTeamName().length() == 11) {
                System.out.println(team.getTeamName() + " " + team.getGame() + "  " + team.getGainGoal() + ":" + team.getLoseGoal() + "  " + team.getPkt());
            } else if (team.getTeamName().length() == 10) {
                System.out.println(team.getTeamName() + "  " + team.getGame() + "  " + team.getGainGoal() + ":" + team.getLoseGoal() + "  " + team.getPkt());
            } else if (team.getTeamName().length() == 6) {
                System.out.println(team.getTeamName() + "      " + team.getGame() + "  " + team.getGainGoal() + ":" + team.getLoseGoal() + "  " + team.getPkt());
            } else if (team.getTeamName().length() == 4) {
                System.out.println(team.getTeamName() + "        " + team.getGame() + "  " + team.getGainGoal() + ":" + team.getLoseGoal() + "  " + team.getPkt());
            } else if (team.getTeamName().length() == 3) {
                System.out.println(team.getTeamName() + "         " + team.getGame() + "  " + team.getGainGoal() + ":" + team.getLoseGoal() + "  " + team.getPkt());
            }
            i++;
        }
        System.out.println();
    }
}
