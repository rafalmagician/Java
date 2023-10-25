package ligaPilkaNozna;

public class LeaguePokemon {
    private final League_1 league_1 = new League_1();
    private final League_2 league_2 = new League_2();

    public void addTeamsToLeagues() {
        league_1.addTeamsOneLeague();
        league_2.addTeamsTwoLeague();
    }

    public void displayTableLeagueOne() {
        league_1.displayTeamOneInformation();
    }

    public void displayTableLeagueTwo() {
        league_2.displayTeamTwoInformation();
    }
}
