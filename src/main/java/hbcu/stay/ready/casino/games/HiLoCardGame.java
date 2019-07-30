package hbcu.stay.ready.casino.games;

import hbcu.stay.ready.casino.Player;
import hbcu.stay.ready.casino.utilities.Console;

public class HiLoCardGame extends CardGame {

    public HiLoCardGame(Console console, Player player1){
        super(console, player1);
    }

    @Override
    public void play() {
        console.println("Welcome to Hi lo");
    }

    @Override
    public String gameInfo(){
        return "The HiLo Game";
    }
}
