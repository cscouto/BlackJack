package blackjack2;

/**
 *
 * @author Tiago
 */
public class Person {
    private String name;
    private int credit = 0;
    private Hand hand;
    private int betValue;
    
 public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCredit(int credit) {
        this.credit= credit;
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }

    public int getBetValue() {
        return betValue;
    }

    public void setBetValue(int betValue) {
        this.betValue = betValue;
    }
}