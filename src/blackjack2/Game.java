package blackjack2;

import java.util.LinkedList;

/**
 *
 * @author Tiago & Ryne
 */
public class Game {
    private LinkedList<Player> players = new LinkedList();
    private Dealer dealer;
    private int contDeck, contPlayers;
    private Deck deck = new Deck();
    
    public Game(){
        players.add(new Player("Player 1"));
        dealer = new Dealer();
        contPlayers = 1;
    }
    public Dealer getDealer() {
        return dealer;
    }
    
    public void addPlayer(String name){
        players.add(new Player(name));
        contPlayers++;
    }
    public LinkedList getPlayers(){
        return players;
    }
    public Deck getDeck(){
        return deck;
    }

    public int getContPlayers() {
        return contPlayers;
    }
    public void calcWin(Player p, Dealer d){
        if(p.getHand().getHandValue()>21){
            int i = 0;
            while((i<p.getHand().getContAce())&&
                    (p.getHand().getHandValue()>21)){
                p.getHand().setHandValue(-10);
                i++;
            }
           
        }
        if(p.getHand().getHandValue()>d.getHand().getHandValue()){
            p.setCredit(p.getBetValue());
        }else{
            if(p.getHand().getHandValue()>d.getHand().getHandValue()){
                p.setCredit(-(p.getBetValue()));
            }
        }
    }
    public Player getPlayerNo(int index){
        return players.get(index);
    }
}
