package blackjack2;

import java.util.LinkedList;

/**
 *
 * @author Tiago & Ryne
 */
public class Hand {

    private LinkedList<Card> handCards = new LinkedList();
    private int handValue=0;
    private int contCards;
    private int contAce=0;

    public Hand(Deck deck) {
    }
    public void addCard(Card card){
        handCards.add(card);
        contCards++;
        if (card.getFaceValue()==1)
            contAce++;
        handValue=handValue+card.getCardValue();
        if (handValue>21 && contAce>0){
            handValue = handValue-10;
            contAce--;
        }
    }

    public LinkedList getHandCards() {
        return handCards;
    }

    public int getHandValue() {
        return handValue;
    }

    public void setHandValue(int handValue) {
        this.handValue += handValue;
    }

    public int getContCards() {
        return contCards;
    }

    public int getContAce() {
        return contAce;
    }
    public Card getCard(int index){
        return handCards.get(index);
    }
    
}
