package ligaPilkaNozna;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        LeaguePokemon leaguePokemon = new LeaguePokemon();
        leaguePokemon.addTeamsToLeagues();
        leaguePokemon.displayMenu();

    }

}
