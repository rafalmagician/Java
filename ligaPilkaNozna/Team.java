package ligaPilkaNozna;

public class Team implements Comparable<Team> {
    private final String teamName;
    private int game;
    private int gainGoal;
    private int loseGoal;
    private int pkt;

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

    public void setGame(int game) {
        this.game += game;
    }

    public void setGainGoal(int gainGoal) {
        this.gainGoal += gainGoal;
    }

    public void setLoseGoal(int loseGoal) {
        this.loseGoal += loseGoal;
    }

    public void setPkt(int pkt) {
        this.pkt += pkt;
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
