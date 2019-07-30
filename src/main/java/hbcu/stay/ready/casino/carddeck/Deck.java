package hbcu.stay.ready.casino.carddeck;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck(){
       cards = new ArrayList<>();
       buildDeck();
    }

    private void buildDeck(){
        for(SuitEnum suit:SuitEnum.values()){
            ArrayList<Card> suitCards = buildCardsBySuitValue(suit);
            cards.addAll(suitCards);
        }
    }

    private ArrayList<Card> buildCardsBySuitValue(SuitEnum suitEnum){
        ArrayList<Card> cards = new ArrayList<>();
        for (CardValueEnum cardValueEnum: CardValueEnum.values()){
            Card card = new Card(cardValueEnum, suitEnum);
            cards.add(card);
        }
        return cards;
    }

    public ArrayList<Card> getCards(){
        return cards;
    }

    public void shuffleCards(){
        Collections.shuffle(cards);
    }

    public Card peekAtTopCard(){
        return cards.get(0);
    }

    public Card takeTopCard(){
        return cards.remove(0);
    }
}
