package hbcu.stay.ready.casino.games;

import hbcu.stay.ready.casino.Player;
import hbcu.stay.ready.casino.utilities.Console;

public class BlackJack extends CardGame {

    public BlackJack(Console console, Player player1){
        super(console, player1);
    }

    @Override
    public void play() {
        console.println("You are playing Black Jack");
    }

    @Override
    public String gameInfo() {
        return "Hello This is Black Jack";
    }
}
