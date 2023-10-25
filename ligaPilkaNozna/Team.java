package ligaPilkaNozna;

public class Team {
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

    public String displayTeamInformation() {
        return teamName + " " + game + " " + gainGoal + ":" + loseGoal + " " + pkt;
    }
}
