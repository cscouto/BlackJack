package blackjack2;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author Tiago & Ryne
 */
public class Deck {
    private LinkedList<Card> cards = new LinkedList();
    int index=-1;
    public Deck() {
        for(int i=0; i<4; i++){
            for(int j=1; j<13; j++){
                cards.add(new Card(i,j));
            }
        }
    }

    public LinkedList getCards() {
        return cards;
    }
    public void removeCard(int n){
        cards.remove(n);
    }
    public Card dealCard(){
        index++;
        return cards.get(index);
    }
    public void shuffleCards(){
        Collections.shuffle(cards);
        index=-1;
    }
}
