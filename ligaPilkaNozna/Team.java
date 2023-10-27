package ligaPilkaNozna;

public class Team implements Comparable<Team> {
    private final String teamName;
    private final int game;
    private final int gainGoal;
    private final int loseGoal;
    private final int pkt;

    public Team(String teamName, int game, int gainGoal, int loseGoal, int pkt) {
        this.teamName = teamName;
        this.game = game;
        this.gainGoal = gainGoal;
        this.loseGoal = loseGoal;
        this.pkt = pkt;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getGame() {
        return game;
    }

    public int getGainGoal() {
        return gainGoal;
    }

    public int getLoseGoal() {
        return loseGoal;
    }

    public int getPkt() {
        return pkt;
    }

    // Sortowanie tabeli wg punktów
    @Override
    public int compareTo(Team o) {
        return o.pkt - this.pkt;
    }

    @Override
    public String toString() {
        return "%s %d %d:%d %d".formatted(teamName, game, gainGoal, loseGoal, pkt) + "\n";
    }
}
