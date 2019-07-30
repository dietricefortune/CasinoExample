package hbcu.stay.ready.casino.games;

import hbcu.stay.ready.casino.Player;
import hbcu.stay.ready.casino.utilities.Console;

public class GoFish extends CardGame {

    public GoFish(Console console, Player player1){
        super(console,player1);
    }

    @Override
    public void play() {
        console.println("Play Go Fish");
    }

    @Override
    public String gameInfo() {
        return "Go Fishy";
    }
}
