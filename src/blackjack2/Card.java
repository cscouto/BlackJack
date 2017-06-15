package blackjack2;

import javax.swing.Icon;

/**
 *
 * @author Tiago & Ryne
 */
public class Card {
    private int faceValue;
    private int suit;
    private int cardValue;

    public Card(int suit, int faceValue) {
        this.faceValue = faceValue;
        this.suit = suit;
        if(faceValue>10){
            this.cardValue = 10;
        }else{
            if(faceValue==1){
                this.cardValue = 11;
            }else{
                this.cardValue = faceValue;
            }
        }
    }
    
    public int getSuit() {
        return suit;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    public int getCardValue() {
        return cardValue;
    }
    public Icon getIcon(){
        Icon icon = new javax.swing.ImageIcon(getClass().getResource("/blackjack2/images/"+ suit+""+faceValue + ".png"));
        return icon;
    } 
}