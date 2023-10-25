package ligaPilkaNozna;

public class Main {

    public static void main(String[] args) {

        LeaguePokemon leaguePokemon = new LeaguePokemon();
        leaguePokemon.addTeamsToLeagues();

        leaguePokemon.displayTableLeagueOne();

        System.out.println();

        leaguePokemon.displayTableLeagueTwo();

    }

}
