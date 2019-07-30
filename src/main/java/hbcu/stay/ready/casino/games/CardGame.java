package hbcu.stay.ready.casino.games;

import hbcu.stay.ready.casino.Player;
import hbcu.stay.ready.casino.utilities.Console;

public abstract class CardGame implements Game {

    private Player dealer;
    private Player player1;

    protected Console console;

    public CardGame(Console console , Player player1){
        this.console = console;
        this.player1 = player1;
        dealer = new Player("Dealer");

    }
}
