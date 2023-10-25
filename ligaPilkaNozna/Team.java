package ligaPilkaNozna;

public class Team {
    private final char sign = '#';
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

    public char getSign() {
        return sign;
    }

    @Override
    public String toString() {
        return teamName + " " + game + " " + gainGoal + ":" + loseGoal + " " + pkt;
    }
}
