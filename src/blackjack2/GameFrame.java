package blackjack2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;

/**
 *
 * @author Tiago & Ryne
 */
public class GameFrame extends javax.swing.JFrame {

    private Game game;
    private int currentPlayer=0;
    private ArrayList<JLayeredPane> playerHands;
    private ArrayList<JLabel> player1CardLabels;
    private ArrayList<JLabel> player2CardLabels;
    private ArrayList<JLabel> player3CardLabels;
    private ArrayList<JLabel> player4CardLabels;
    private ArrayList<ArrayList<JLabel>> playerHandsLabels;
    private ArrayList<JLabel> dealerCardLabels;
    private ArrayList<JTextField> playerBetBoxes;
    private ArrayList<JLabel> playerBankFields;
    private ArrayList<JLabel> pointers;
    private ArrayList<JLabel> results;
    private ArrayList<JLabel> names;

    /**
     * Creates new form GameFrame
     */
    public GameFrame(Game game) {
        this.game = game;
        initComponents();
        hitButton.setVisible(false);
        hitButton.setEnabled(false);
        stayButton.setVisible(false);
        stayButton.setEnabled(false);
    }

    public void initGame() {
        player1CardLabels = new ArrayList(Arrays.asList(card01p1,card02p1,card03p1,card04p1,card05p1,card06p1,card07p1,card08p1,card09p1,card10p1,card11p1));
        player2CardLabels = new ArrayList(Arrays.asList(card01p2,card02p2,card03p2,card04p2,card05p2,card06p2,card07p2,card08p2,card09p2,card10p2,card11p2));
        player3CardLabels = new ArrayList(Arrays.asList(card01p3,card02p3,card03p3,card04p3,card05p3,card06p3,card07p3,card08p3,card09p3,card10p3,card11p3));
        player4CardLabels = new ArrayList(Arrays.asList(card01p4,card02p4,card03p4,card04p4,card05p4,card06p4,card07p4,card08p4,card09p4,card10p4,card11p4));
        playerHandsLabels = new ArrayList (Arrays.asList(player1CardLabels,player2CardLabels,player3CardLabels,player4CardLabels));
        dealerCardLabels = new ArrayList(Arrays.asList(cardD01,cardD02, card03p5,card04p5,card05p5,card06p5,card07p5,card08p5,card09p5,card10p5,card11p5));
        playerHands = new ArrayList(Arrays.asList(p1Hand,p2Hand,p3Hand,p4Hand));
        playerBetBoxes=new ArrayList(Arrays.asList(p1BetBox,p2BetBox,p3BetBox,p4BetBox));
        playerBankFields=new ArrayList(Arrays.asList(lbCredP1,lbCredP2,lbCredP3,lbCredP4));
        pointers = new ArrayList(Arrays.asList(p1Pointer,p2Pointer,p3Pointer));
        results = new ArrayList(Arrays.asList(p1ResultLabel,p2ResultLabel,p3ResultLabel,dealerResultLabel));
        names = new ArrayList(Arrays.asList(lbP1,lbP2,lbP3,lbP4));
        for (int i=0; i<game.getContPlayers();i++){
            if (!game.getPlayerNo(i).getName().equals("")){
                names.get(i).setText(game.getPlayerNo(i).getName());
            }
            for (int j=0; j<11;j++){
                playerHandsLabels.get(i).get(j).setIcon(null);
            }
        }
        for (int i=0; i<playerHands.size();i++){
            if (i>game.getContPlayers()-1)
                playerHands.get(i).setVisible(false);
        }
        dealerHand.setVisible(false);
        p1Pointer.setVisible(false);
        p2Pointer.setVisible(false);
        p3Pointer.setVisible(false);
        doubleDownButton.setVisible(false);
        doubleDownButton.setEnabled(false);
    }
    public void updateScreen(int n, LinkedList cards){
        if(n==0){
            for(int i=0; i<13; i++){
            ((JLabel)p1Hand.getComponent(12-i)).setIcon(((JLabel)(cards.get(i))).getIcon());
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        dealerHand = new javax.swing.JLayeredPane();
        card13p5 = new javax.swing.JLabel();
        card14p5 = new javax.swing.JLabel();
        card15p5 = new javax.swing.JLabel();
        card12p5 = new javax.swing.JLabel();
        card11p5 = new javax.swing.JLabel();
        card10p5 = new javax.swing.JLabel();
        card09p5 = new javax.swing.JLabel();
        card08p5 = new javax.swing.JLabel();
        card07p5 = new javax.swing.JLabel();
        card06p5 = new javax.swing.JLabel();
        card05p5 = new javax.swing.JLabel();
        card04p5 = new javax.swing.JLabel();
        card03p5 = new javax.swing.JLabel();
        cardD02 = new javax.swing.JLabel();
        cardD01 = new javax.swing.JLabel();
        dealerResultLabel = new javax.swing.JLabel();
        p1Hand = new javax.swing.JLayeredPane();
        card13p1 = new javax.swing.JLabel();
        card14p1 = new javax.swing.JLabel();
        card15p1 = new javax.swing.JLabel();
        card12p1 = new javax.swing.JLabel();
        card11p1 = new javax.swing.JLabel();
        card10p1 = new javax.swing.JLabel();
        card09p1 = new javax.swing.JLabel();
        card08p1 = new javax.swing.JLabel();
        card07p1 = new javax.swing.JLabel();
        card06p1 = new javax.swing.JLabel();
        card05p1 = new javax.swing.JLabel();
        card04p1 = new javax.swing.JLabel();
        card03p1 = new javax.swing.JLabel();
        card02p1 = new javax.swing.JLabel();
        card01p1 = new javax.swing.JLabel();
        lbCredP1 = new javax.swing.JLabel();
        lbBetP1 = new javax.swing.JLabel();
        lbP1 = new javax.swing.JLabel();
        p1BetBox = new javax.swing.JTextField();
        p2Hand = new javax.swing.JLayeredPane();
        card13p2 = new javax.swing.JLabel();
        card14p2 = new javax.swing.JLabel();
        card15p2 = new javax.swing.JLabel();
        card12p2 = new javax.swing.JLabel();
        card11p2 = new javax.swing.JLabel();
        card10p2 = new javax.swing.JLabel();
        card09p2 = new javax.swing.JLabel();
        card08p2 = new javax.swing.JLabel();
        card07p2 = new javax.swing.JLabel();
        card06p2 = new javax.swing.JLabel();
        card05p2 = new javax.swing.JLabel();
        card04p2 = new javax.swing.JLabel();
        card03p2 = new javax.swing.JLabel();
        card02p2 = new javax.swing.JLabel();
        card01p2 = new javax.swing.JLabel();
        lbCredP2 = new javax.swing.JLabel();
        lbBetP2 = new javax.swing.JLabel();
        lbP2 = new javax.swing.JLabel();
        p2BetBox = new javax.swing.JTextField();
        p3Hand = new javax.swing.JLayeredPane();
        card13p3 = new javax.swing.JLabel();
        card14p3 = new javax.swing.JLabel();
        card15p3 = new javax.swing.JLabel();
        card12p3 = new javax.swing.JLabel();
        card11p3 = new javax.swing.JLabel();
        card10p3 = new javax.swing.JLabel();
        card09p3 = new javax.swing.JLabel();
        card08p3 = new javax.swing.JLabel();
        card07p3 = new javax.swing.JLabel();
        card06p3 = new javax.swing.JLabel();
        card05p3 = new javax.swing.JLabel();
        card04p3 = new javax.swing.JLabel();
        card03p3 = new javax.swing.JLabel();
        card02p3 = new javax.swing.JLabel();
        card01p3 = new javax.swing.JLabel();
        lbCredP3 = new javax.swing.JLabel();
        lbBetP3 = new javax.swing.JLabel();
        lbP3 = new javax.swing.JLabel();
        p3BetBox = new javax.swing.JTextField();
        p4Hand = new javax.swing.JLayeredPane();
        card13p4 = new javax.swing.JLabel();
        card14p4 = new javax.swing.JLabel();
        card15p4 = new javax.swing.JLabel();
        card12p4 = new javax.swing.JLabel();
        card11p4 = new javax.swing.JLabel();
        card10p4 = new javax.swing.JLabel();
        card09p4 = new javax.swing.JLabel();
        card08p4 = new javax.swing.JLabel();
        card07p4 = new javax.swing.JLabel();
        card06p4 = new javax.swing.JLabel();
        card05p4 = new javax.swing.JLabel();
        card04p4 = new javax.swing.JLabel();
        card03p4 = new javax.swing.JLabel();
        card02p4 = new javax.swing.JLabel();
        card01p4 = new javax.swing.JLabel();
        lbCredP4 = new javax.swing.JLabel();
        lbBetP4 = new javax.swing.JLabel();
        lbP4 = new javax.swing.JLabel();
        p4BetBox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        p3Pointer = new javax.swing.JLabel();
        p1Pointer = new javax.swing.JLabel();
        p1ResultLabel = new javax.swing.JLabel();
        p2Pointer = new javax.swing.JLabel();
        p2ResultLabel = new javax.swing.JLabel();
        p3ResultLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        stayButton = new javax.swing.JButton();
        hitButton = new javax.swing.JButton();
        dealButton = new javax.swing.JButton();
        doubleDownButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLayeredPane1.setMaximumSize(new java.awt.Dimension(883, 536));
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(883, 536));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack2/images/b2fv.png"))); // NOI18N
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(990, 190, 71, 96);

        card13p5.setMaximumSize(new java.awt.Dimension(71, 96));
        card13p5.setMinimumSize(new java.awt.Dimension(71, 96));
        card13p5.setPreferredSize(new java.awt.Dimension(71, 96));
        dealerHand.add(card13p5);
        card13p5.setBounds(280, 0, 71, 96);

        card14p5.setMaximumSize(new java.awt.Dimension(71, 96));
        card14p5.setMinimumSize(new java.awt.Dimension(71, 96));
        card14p5.setPreferredSize(new java.awt.Dimension(71, 96));
        dealerHand.add(card14p5);
        card14p5.setBounds(260, 0, 71, 96);

        card15p5.setMaximumSize(new java.awt.Dimension(71, 96));
        card15p5.setMinimumSize(new java.awt.Dimension(71, 96));
        card15p5.setPreferredSize(new java.awt.Dimension(71, 96));
        dealerHand.add(card15p5);
        card15p5.setBounds(240, 0, 71, 96);

        card12p5.setMaximumSize(new java.awt.Dimension(71, 96));
        card12p5.setMinimumSize(new java.awt.Dimension(71, 96));
        card12p5.setPreferredSize(new java.awt.Dimension(71, 96));
        dealerHand.add(card12p5);
        card12p5.setBounds(220, 0, 71, 96);

        card11p5.setMaximumSize(new java.awt.Dimension(71, 96));
        card11p5.setMinimumSize(new java.awt.Dimension(71, 96));
        card11p5.setPreferredSize(new java.awt.Dimension(71, 96));
        dealerHand.add(card11p5);
        card11p5.setBounds(200, 0, 71, 96);

        card10p5.setMaximumSize(new java.awt.Dimension(71, 96));
        card10p5.setMinimumSize(new java.awt.Dimension(71, 96));
        card10p5.setPreferredSize(new java.awt.Dimension(71, 96));
        dealerHand.add(card10p5);
        card10p5.setBounds(180, 0, 71, 96);

        card09p5.setMaximumSize(new java.awt.Dimension(71, 96));
        card09p5.setMinimumSize(new java.awt.Dimension(71, 96));
        card09p5.setPreferredSize(new java.awt.Dimension(71, 96));
        dealerHand.add(card09p5);
        card09p5.setBounds(160, 0, 71, 96);

        card08p5.setMaximumSize(new java.awt.Dimension(71, 96));
        card08p5.setMinimumSize(new java.awt.Dimension(71, 96));
        card08p5.setPreferredSize(new java.awt.Dimension(71, 96));
        dealerHand.add(card08p5);
        card08p5.setBounds(140, 0, 71, 96);

        card07p5.setMaximumSize(new java.awt.Dimension(71, 96));
        card07p5.setMinimumSize(new java.awt.Dimension(71, 96));
        card07p5.setPreferredSize(new java.awt.Dimension(71, 96));
        dealerHand.add(card07p5);
        card07p5.setBounds(120, 0, 71, 96);

        card06p5.setMaximumSize(new java.awt.Dimension(71, 96));
        card06p5.setMinimumSize(new java.awt.Dimension(71, 96));
        card06p5.setPreferredSize(new java.awt.Dimension(71, 96));
        dealerHand.add(card06p5);
        card06p5.setBounds(100, 0, 71, 96);

        card05p5.setMaximumSize(new java.awt.Dimension(71, 96));
        card05p5.setMinimumSize(new java.awt.Dimension(71, 96));
        card05p5.setPreferredSize(new java.awt.Dimension(71, 96));
        dealerHand.add(card05p5);
        card05p5.setBounds(80, 0, 71, 96);

        card04p5.setMaximumSize(new java.awt.Dimension(71, 96));
        card04p5.setMinimumSize(new java.awt.Dimension(71, 96));
        card04p5.setPreferredSize(new java.awt.Dimension(71, 96));
        dealerHand.add(card04p5);
        card04p5.setBounds(60, 0, 71, 96);

        card03p5.setMaximumSize(new java.awt.Dimension(71, 96));
        card03p5.setMinimumSize(new java.awt.Dimension(71, 96));
        card03p5.setPreferredSize(new java.awt.Dimension(71, 96));
        dealerHand.add(card03p5);
        card03p5.setBounds(40, 0, 71, 96);

        cardD02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack2/b2fv.png"))); // NOI18N
        dealerHand.add(cardD02);
        cardD02.setBounds(20, 0, 71, 96);

        cardD01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack2/b2fv.png"))); // NOI18N
        dealerHand.add(cardD01);
        cardD01.setBounds(0, 0, 71, 96);

        dealerResultLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        dealerResultLabel.setForeground(new java.awt.Color(255, 0, 0));
        dealerHand.add(dealerResultLabel);
        dealerResultLabel.setBounds(150, 110, 50, 0);

        jLayeredPane1.add(dealerHand);
        dealerHand.setBounds(470, 30, 520, 130);

        card13p1.setMaximumSize(new java.awt.Dimension(71, 96));
        card13p1.setMinimumSize(new java.awt.Dimension(71, 96));
        card13p1.setPreferredSize(new java.awt.Dimension(71, 96));
        p1Hand.add(card13p1);
        card13p1.setBounds(280, 0, 71, 96);

        card14p1.setMaximumSize(new java.awt.Dimension(71, 96));
        card14p1.setMinimumSize(new java.awt.Dimension(71, 96));
        card14p1.setPreferredSize(new java.awt.Dimension(71, 96));
        p1Hand.add(card14p1);
        card14p1.setBounds(260, 0, 71, 96);

        card15p1.setMaximumSize(new java.awt.Dimension(71, 96));
        card15p1.setMinimumSize(new java.awt.Dimension(71, 96));
        card15p1.setPreferredSize(new java.awt.Dimension(71, 96));
        p1Hand.add(card15p1);
        card15p1.setBounds(240, 0, 71, 96);

        card12p1.setMaximumSize(new java.awt.Dimension(71, 96));
        card12p1.setMinimumSize(new java.awt.Dimension(71, 96));
        card12p1.setPreferredSize(new java.awt.Dimension(71, 96));
        p1Hand.add(card12p1);
        card12p1.setBounds(220, 0, 71, 96);

        card11p1.setMaximumSize(new java.awt.Dimension(71, 96));
        card11p1.setMinimumSize(new java.awt.Dimension(71, 96));
        card11p1.setPreferredSize(new java.awt.Dimension(71, 96));
        p1Hand.add(card11p1);
        card11p1.setBounds(200, 0, 71, 96);

        card10p1.setMaximumSize(new java.awt.Dimension(71, 96));
        card10p1.setMinimumSize(new java.awt.Dimension(71, 96));
        card10p1.setPreferredSize(new java.awt.Dimension(71, 96));
        p1Hand.add(card10p1);
        card10p1.setBounds(180, 0, 71, 96);

        card09p1.setMaximumSize(new java.awt.Dimension(71, 96));
        card09p1.setMinimumSize(new java.awt.Dimension(71, 96));
        card09p1.setPreferredSize(new java.awt.Dimension(71, 96));
        p1Hand.add(card09p1);
        card09p1.setBounds(160, 0, 71, 96);

        card08p1.setMaximumSize(new java.awt.Dimension(71, 96));
        card08p1.setMinimumSize(new java.awt.Dimension(71, 96));
        card08p1.setPreferredSize(new java.awt.Dimension(71, 96));
        p1Hand.add(card08p1);
        card08p1.setBounds(140, 0, 71, 96);

        card07p1.setMaximumSize(new java.awt.Dimension(71, 96));
        card07p1.setMinimumSize(new java.awt.Dimension(71, 96));
        card07p1.setPreferredSize(new java.awt.Dimension(71, 96));
        p1Hand.add(card07p1);
        card07p1.setBounds(120, 0, 71, 96);

        card06p1.setMaximumSize(new java.awt.Dimension(71, 96));
        card06p1.setMinimumSize(new java.awt.Dimension(71, 96));
        card06p1.setPreferredSize(new java.awt.Dimension(71, 96));
        p1Hand.add(card06p1);
        card06p1.setBounds(100, 0, 71, 96);

        card05p1.setMaximumSize(new java.awt.Dimension(71, 96));
        card05p1.setMinimumSize(new java.awt.Dimension(71, 96));
        card05p1.setPreferredSize(new java.awt.Dimension(71, 96));
        p1Hand.add(card05p1);
        card05p1.setBounds(80, 0, 71, 96);

        card04p1.setMaximumSize(new java.awt.Dimension(71, 96));
        card04p1.setMinimumSize(new java.awt.Dimension(71, 96));
        card04p1.setPreferredSize(new java.awt.Dimension(71, 96));
        p1Hand.add(card04p1);
        card04p1.setBounds(60, 0, 71, 96);

        card03p1.setMaximumSize(new java.awt.Dimension(71, 96));
        card03p1.setMinimumSize(new java.awt.Dimension(71, 96));
        card03p1.setPreferredSize(new java.awt.Dimension(71, 96));
        p1Hand.add(card03p1);
        card03p1.setBounds(40, 0, 71, 96);

        card02p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack2/b2fv.png"))); // NOI18N
        p1Hand.add(card02p1);
        card02p1.setBounds(20, 0, 71, 96);

        card01p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack2/b2fv.png"))); // NOI18N
        p1Hand.add(card01p1);
        card01p1.setBounds(0, 0, 71, 96);

        lbCredP1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbCredP1.setForeground(new java.awt.Color(255, 0, 0));
        lbCredP1.setText("BANK:100");
        p1Hand.add(lbCredP1);
        lbCredP1.setBounds(30, 150, 149, 21);

        lbBetP1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbBetP1.setForeground(new java.awt.Color(255, 0, 0));
        lbBetP1.setText("BET:");
        p1Hand.add(lbBetP1);
        lbBetP1.setBounds(30, 170, 40, 21);

        lbP1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbP1.setForeground(new java.awt.Color(255, 0, 0));
        lbP1.setText("Player 1");
        p1Hand.add(lbP1);
        lbP1.setBounds(30, 130, 149, 21);

        p1BetBox.setText("10");
        p1Hand.add(p1BetBox);
        p1BetBox.setBounds(70, 170, 40, 20);

        jLayeredPane1.add(p1Hand);
        p1Hand.setBounds(250, 440, 360, 210);

        card13p2.setMaximumSize(new java.awt.Dimension(71, 96));
        card13p2.setMinimumSize(new java.awt.Dimension(71, 96));
        card13p2.setPreferredSize(new java.awt.Dimension(71, 96));
        p2Hand.add(card13p2);
        card13p2.setBounds(290, 0, 71, 96);

        card14p2.setMaximumSize(new java.awt.Dimension(71, 96));
        card14p2.setMinimumSize(new java.awt.Dimension(71, 96));
        card14p2.setPreferredSize(new java.awt.Dimension(71, 96));
        p2Hand.add(card14p2);
        card14p2.setBounds(270, 0, 71, 96);

        card15p2.setMaximumSize(new java.awt.Dimension(71, 96));
        card15p2.setMinimumSize(new java.awt.Dimension(71, 96));
        card15p2.setPreferredSize(new java.awt.Dimension(71, 96));
        p2Hand.add(card15p2);
        card15p2.setBounds(250, 0, 71, 96);

        card12p2.setMaximumSize(new java.awt.Dimension(71, 96));
        card12p2.setMinimumSize(new java.awt.Dimension(71, 96));
        card12p2.setPreferredSize(new java.awt.Dimension(71, 96));
        p2Hand.add(card12p2);
        card12p2.setBounds(230, 0, 71, 96);

        card11p2.setMaximumSize(new java.awt.Dimension(71, 96));
        card11p2.setMinimumSize(new java.awt.Dimension(71, 96));
        card11p2.setPreferredSize(new java.awt.Dimension(71, 96));
        p2Hand.add(card11p2);
        card11p2.setBounds(210, 0, 71, 96);

        card10p2.setMaximumSize(new java.awt.Dimension(71, 96));
        card10p2.setMinimumSize(new java.awt.Dimension(71, 96));
        card10p2.setPreferredSize(new java.awt.Dimension(71, 96));
        p2Hand.add(card10p2);
        card10p2.setBounds(190, 0, 71, 96);

        card09p2.setMaximumSize(new java.awt.Dimension(71, 96));
        card09p2.setMinimumSize(new java.awt.Dimension(71, 96));
        card09p2.setPreferredSize(new java.awt.Dimension(71, 96));
        p2Hand.add(card09p2);
        card09p2.setBounds(170, 0, 71, 96);

        card08p2.setMaximumSize(new java.awt.Dimension(71, 96));
        card08p2.setMinimumSize(new java.awt.Dimension(71, 96));
        card08p2.setPreferredSize(new java.awt.Dimension(71, 96));
        p2Hand.add(card08p2);
        card08p2.setBounds(150, 0, 71, 96);

        card07p2.setMaximumSize(new java.awt.Dimension(71, 96));
        card07p2.setMinimumSize(new java.awt.Dimension(71, 96));
        card07p2.setPreferredSize(new java.awt.Dimension(71, 96));
        p2Hand.add(card07p2);
        card07p2.setBounds(130, 0, 71, 96);

        card06p2.setMaximumSize(new java.awt.Dimension(71, 96));
        card06p2.setMinimumSize(new java.awt.Dimension(71, 96));
        card06p2.setPreferredSize(new java.awt.Dimension(71, 96));
        p2Hand.add(card06p2);
        card06p2.setBounds(110, 0, 71, 96);

        card05p2.setMaximumSize(new java.awt.Dimension(71, 96));
        card05p2.setMinimumSize(new java.awt.Dimension(71, 96));
        card05p2.setPreferredSize(new java.awt.Dimension(71, 96));
        p2Hand.add(card05p2);
        card05p2.setBounds(90, 0, 71, 96);

        card04p2.setMaximumSize(new java.awt.Dimension(71, 96));
        card04p2.setMinimumSize(new java.awt.Dimension(71, 96));
        card04p2.setPreferredSize(new java.awt.Dimension(71, 96));
        p2Hand.add(card04p2);
        card04p2.setBounds(70, 0, 71, 96);

        card03p2.setMaximumSize(new java.awt.Dimension(71, 96));
        card03p2.setMinimumSize(new java.awt.Dimension(71, 96));
        card03p2.setPreferredSize(new java.awt.Dimension(71, 96));
        p2Hand.add(card03p2);
        card03p2.setBounds(50, 0, 71, 96);

        card02p2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack2/b2fv.png"))); // NOI18N
        p2Hand.add(card02p2);
        card02p2.setBounds(30, 0, 71, 96);

        card01p2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack2/b2fv.png"))); // NOI18N
        p2Hand.add(card01p2);
        card01p2.setBounds(10, 0, 71, 96);

        lbCredP2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbCredP2.setForeground(new java.awt.Color(255, 0, 0));
        lbCredP2.setText("BANK:100");
        p2Hand.add(lbCredP2);
        lbCredP2.setBounds(40, 160, 149, 21);

        lbBetP2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbBetP2.setForeground(new java.awt.Color(255, 0, 0));
        lbBetP2.setText("BET:");
        p2Hand.add(lbBetP2);
        lbBetP2.setBounds(40, 180, 40, 21);

        lbP2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbP2.setForeground(new java.awt.Color(255, 0, 0));
        lbP2.setText("Player 2");
        p2Hand.add(lbP2);
        lbP2.setBounds(40, 140, 149, 21);

        p2BetBox.setText("10");
        p2Hand.add(p2BetBox);
        p2BetBox.setBounds(80, 180, 40, 20);

        jLayeredPane1.add(p2Hand);
        p2Hand.setBounds(570, 520, 370, 200);

        card13p3.setMaximumSize(new java.awt.Dimension(71, 96));
        card13p3.setMinimumSize(new java.awt.Dimension(71, 96));
        card13p3.setPreferredSize(new java.awt.Dimension(71, 96));
        p3Hand.add(card13p3);
        card13p3.setBounds(290, 0, 71, 96);

        card14p3.setMaximumSize(new java.awt.Dimension(71, 96));
        card14p3.setMinimumSize(new java.awt.Dimension(71, 96));
        card14p3.setPreferredSize(new java.awt.Dimension(71, 96));
        p3Hand.add(card14p3);
        card14p3.setBounds(270, 0, 71, 96);

        card15p3.setMaximumSize(new java.awt.Dimension(71, 96));
        card15p3.setMinimumSize(new java.awt.Dimension(71, 96));
        card15p3.setPreferredSize(new java.awt.Dimension(71, 96));
        p3Hand.add(card15p3);
        card15p3.setBounds(250, 0, 71, 96);

        card12p3.setMaximumSize(new java.awt.Dimension(71, 96));
        card12p3.setMinimumSize(new java.awt.Dimension(71, 96));
        card12p3.setPreferredSize(new java.awt.Dimension(71, 96));
        p3Hand.add(card12p3);
        card12p3.setBounds(230, 0, 71, 96);

        card11p3.setMaximumSize(new java.awt.Dimension(71, 96));
        card11p3.setMinimumSize(new java.awt.Dimension(71, 96));
        card11p3.setPreferredSize(new java.awt.Dimension(71, 96));
        p3Hand.add(card11p3);
        card11p3.setBounds(210, 0, 71, 96);

        card10p3.setMaximumSize(new java.awt.Dimension(71, 96));
        card10p3.setMinimumSize(new java.awt.Dimension(71, 96));
        card10p3.setPreferredSize(new java.awt.Dimension(71, 96));
        p3Hand.add(card10p3);
        card10p3.setBounds(190, 0, 71, 96);

        card09p3.setMaximumSize(new java.awt.Dimension(71, 96));
        card09p3.setMinimumSize(new java.awt.Dimension(71, 96));
        card09p3.setPreferredSize(new java.awt.Dimension(71, 96));
        p3Hand.add(card09p3);
        card09p3.setBounds(170, 0, 71, 96);

        card08p3.setMaximumSize(new java.awt.Dimension(71, 96));
        card08p3.setMinimumSize(new java.awt.Dimension(71, 96));
        card08p3.setPreferredSize(new java.awt.Dimension(71, 96));
        p3Hand.add(card08p3);
        card08p3.setBounds(150, 0, 71, 96);

        card07p3.setMaximumSize(new java.awt.Dimension(71, 96));
        card07p3.setMinimumSize(new java.awt.Dimension(71, 96));
        card07p3.setPreferredSize(new java.awt.Dimension(71, 96));
        p3Hand.add(card07p3);
        card07p3.setBounds(130, 0, 71, 96);

        card06p3.setMaximumSize(new java.awt.Dimension(71, 96));
        card06p3.setMinimumSize(new java.awt.Dimension(71, 96));
        card06p3.setPreferredSize(new java.awt.Dimension(71, 96));
        p3Hand.add(card06p3);
        card06p3.setBounds(110, 0, 71, 96);

        card05p3.setMaximumSize(new java.awt.Dimension(71, 96));
        card05p3.setMinimumSize(new java.awt.Dimension(71, 96));
        card05p3.setPreferredSize(new java.awt.Dimension(71, 96));
        p3Hand.add(card05p3);
        card05p3.setBounds(90, 0, 71, 96);

        card04p3.setMaximumSize(new java.awt.Dimension(71, 96));
        card04p3.setMinimumSize(new java.awt.Dimension(71, 96));
        card04p3.setPreferredSize(new java.awt.Dimension(71, 96));
        p3Hand.add(card04p3);
        card04p3.setBounds(70, 0, 71, 96);

        card03p3.setMaximumSize(new java.awt.Dimension(71, 96));
        card03p3.setMinimumSize(new java.awt.Dimension(71, 96));
        card03p3.setPreferredSize(new java.awt.Dimension(71, 96));
        p3Hand.add(card03p3);
        card03p3.setBounds(50, 0, 71, 96);

        card02p3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack2/b2fv.png"))); // NOI18N
        p3Hand.add(card02p3);
        card02p3.setBounds(30, 0, 71, 96);

        card01p3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack2/b2fv.png"))); // NOI18N
        p3Hand.add(card01p3);
        card01p3.setBounds(10, 0, 71, 96);

        lbCredP3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbCredP3.setForeground(new java.awt.Color(255, 0, 0));
        lbCredP3.setText("BANK:100");
        p3Hand.add(lbCredP3);
        lbCredP3.setBounds(30, 150, 149, 21);

        lbBetP3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbBetP3.setForeground(new java.awt.Color(255, 0, 0));
        lbBetP3.setText("BET:");
        p3Hand.add(lbBetP3);
        lbBetP3.setBounds(30, 170, 40, 21);

        lbP3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbP3.setForeground(new java.awt.Color(255, 0, 0));
        lbP3.setText("Player 3");
        p3Hand.add(lbP3);
        lbP3.setBounds(30, 130, 149, 21);

        p3BetBox.setText("10");
        p3Hand.add(p3BetBox);
        p3BetBox.setBounds(70, 170, 40, 20);

        jLayeredPane1.add(p3Hand);
        p3Hand.setBounds(910, 440, 390, 210);

        card13p4.setMaximumSize(new java.awt.Dimension(71, 96));
        card13p4.setMinimumSize(new java.awt.Dimension(71, 96));
        card13p4.setPreferredSize(new java.awt.Dimension(71, 96));
        p4Hand.add(card13p4);
        card13p4.setBounds(290, 0, 71, 96);

        card14p4.setMaximumSize(new java.awt.Dimension(71, 96));
        card14p4.setMinimumSize(new java.awt.Dimension(71, 96));
        card14p4.setPreferredSize(new java.awt.Dimension(71, 96));
        p4Hand.add(card14p4);
        card14p4.setBounds(270, 0, 71, 96);

        card15p4.setMaximumSize(new java.awt.Dimension(71, 96));
        card15p4.setMinimumSize(new java.awt.Dimension(71, 96));
        card15p4.setPreferredSize(new java.awt.Dimension(71, 96));
        p4Hand.add(card15p4);
        card15p4.setBounds(250, 0, 71, 96);

        card12p4.setMaximumSize(new java.awt.Dimension(71, 96));
        card12p4.setMinimumSize(new java.awt.Dimension(71, 96));
        card12p4.setPreferredSize(new java.awt.Dimension(71, 96));
        p4Hand.add(card12p4);
        card12p4.setBounds(230, 0, 71, 96);

        card11p4.setMaximumSize(new java.awt.Dimension(71, 96));
        card11p4.setMinimumSize(new java.awt.Dimension(71, 96));
        card11p4.setPreferredSize(new java.awt.Dimension(71, 96));
        p4Hand.add(card11p4);
        card11p4.setBounds(210, 0, 71, 96);

        card10p4.setMaximumSize(new java.awt.Dimension(71, 96));
        card10p4.setMinimumSize(new java.awt.Dimension(71, 96));
        card10p4.setPreferredSize(new java.awt.Dimension(71, 96));
        p4Hand.add(card10p4);
        card10p4.setBounds(190, 0, 71, 96);

        card09p4.setMaximumSize(new java.awt.Dimension(71, 96));
        card09p4.setMinimumSize(new java.awt.Dimension(71, 96));
        card09p4.setPreferredSize(new java.awt.Dimension(71, 96));
        p4Hand.add(card09p4);
        card09p4.setBounds(170, 0, 71, 96);

        card08p4.setMaximumSize(new java.awt.Dimension(71, 96));
        card08p4.setMinimumSize(new java.awt.Dimension(71, 96));
        card08p4.setPreferredSize(new java.awt.Dimension(71, 96));
        p4Hand.add(card08p4);
        card08p4.setBounds(150, 0, 71, 96);

        card07p4.setMaximumSize(new java.awt.Dimension(71, 96));
        card07p4.setMinimumSize(new java.awt.Dimension(71, 96));
        card07p4.setPreferredSize(new java.awt.Dimension(71, 96));
        p4Hand.add(card07p4);
        card07p4.setBounds(130, 0, 71, 96);

        card06p4.setMaximumSize(new java.awt.Dimension(71, 96));
        card06p4.setMinimumSize(new java.awt.Dimension(71, 96));
        card06p4.setPreferredSize(new java.awt.Dimension(71, 96));
        p4Hand.add(card06p4);
        card06p4.setBounds(110, 0, 71, 96);

        card05p4.setMaximumSize(new java.awt.Dimension(71, 96));
        card05p4.setMinimumSize(new java.awt.Dimension(71, 96));
        card05p4.setPreferredSize(new java.awt.Dimension(71, 96));
        p4Hand.add(card05p4);
        card05p4.setBounds(90, 0, 71, 96);

        card04p4.setMaximumSize(new java.awt.Dimension(71, 96));
        card04p4.setMinimumSize(new java.awt.Dimension(71, 96));
        card04p4.setPreferredSize(new java.awt.Dimension(71, 96));
        p4Hand.add(card04p4);
        card04p4.setBounds(70, 0, 71, 96);

        card03p4.setMaximumSize(new java.awt.Dimension(71, 96));
        card03p4.setMinimumSize(new java.awt.Dimension(71, 96));
        card03p4.setPreferredSize(new java.awt.Dimension(71, 96));
        p4Hand.add(card03p4);
        card03p4.setBounds(50, 0, 71, 96);

        card02p4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack2/b2fv.png"))); // NOI18N
        p4Hand.add(card02p4);
        card02p4.setBounds(30, 0, 71, 96);

        card01p4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack2/b2fv.png"))); // NOI18N
        p4Hand.add(card01p4);
        card01p4.setBounds(0, 0, 71, 96);

        lbCredP4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbCredP4.setForeground(new java.awt.Color(255, 255, 0));
        lbCredP4.setText("Credit: ");
        p4Hand.add(lbCredP4);
        lbCredP4.setBounds(0, 120, 149, 21);

        lbBetP4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbBetP4.setForeground(new java.awt.Color(255, 255, 0));
        lbBetP4.setText("Bet:");
        p4Hand.add(lbBetP4);
        lbBetP4.setBounds(0, 140, 40, 21);

        lbP4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbP4.setForeground(new java.awt.Color(255, 255, 0));
        lbP4.setText("Player 4");
        p4Hand.add(lbP4);
        lbP4.setBounds(0, 100, 149, 21);

        p4BetBox.setText("10");
        p4Hand.add(p4BetBox);
        p4BetBox.setBounds(40, 140, 18, 20);

        jLayeredPane1.add(p4Hand);
        p4Hand.setBounds(460, 220, 370, 160);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack2/images/b2fv.png"))); // NOI18N
        jLayeredPane1.add(jLabel2);
        jLabel2.setBounds(980, 190, 71, 96);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack2/images/b2fv.png"))); // NOI18N
        jLayeredPane1.add(jLabel3);
        jLabel3.setBounds(970, 190, 71, 96);

        p3Pointer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack2/images/Originals/marker.png"))); // NOI18N
        jLayeredPane1.add(p3Pointer);
        p3Pointer.setBounds(950, 330, 50, 50);

        p1Pointer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack2/images/Originals/marker.png"))); // NOI18N
        jLayeredPane1.add(p1Pointer);
        p1Pointer.setBounds(280, 330, 50, 50);

        p1ResultLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        p1ResultLabel.setForeground(new java.awt.Color(255, 0, 0));
        jLayeredPane1.add(p1ResultLabel);
        p1ResultLabel.setBounds(250, 390, 110, 20);

        p2Pointer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack2/images/Originals/marker.png"))); // NOI18N
        jLayeredPane1.add(p2Pointer);
        p2Pointer.setBounds(610, 410, 50, 50);

        p2ResultLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        p2ResultLabel.setForeground(new java.awt.Color(255, 0, 0));
        jLayeredPane1.add(p2ResultLabel);
        p2ResultLabel.setBounds(590, 470, 120, 20);

        p3ResultLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        p3ResultLabel.setForeground(new java.awt.Color(255, 0, 0));
        jLayeredPane1.add(p3ResultLabel);
        p3ResultLabel.setBounds(930, 380, 130, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack2/images/blackjack.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLayeredPane1.add(jLabel6);
        jLabel6.setBounds(0, 0, 1380, 720);

        stayButton.setText("STAY");
        stayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stayButtonActionPerformed(evt);
            }
        });
        jLayeredPane1.add(stayButton);
        stayButton.setBounds(770, 720, 90, 50);

        hitButton.setText("HIT");
        hitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitButtonActionPerformed(evt);
            }
        });
        jLayeredPane1.add(hitButton);
        hitButton.setBounds(450, 720, 90, 50);

        dealButton.setText("DEAL");
        dealButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealButtonActionPerformed(evt);
            }
        });
        jLayeredPane1.add(dealButton);
        dealButton.setBounds(610, 720, 90, 50);

        doubleDownButton.setText("Double Down");
        doubleDownButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doubleDownButtonActionPerformed(evt);
            }
        });
        jLayeredPane1.add(doubleDownButton);
        doubleDownButton.setBounds(600, 720, 120, 50);

        jMenu1.setText("File");

        jMenuItem1.setText("New Game");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Quit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1279, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dealButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealButtonActionPerformed
        for (int i=0;i<playerBetBoxes.size();i++)
            playerBetBoxes.get(i).setEditable(false);
        for (int i=0; i<game.getContPlayers();i++){
            results.get(i).setText("");
            if (Integer.parseInt(playerBetBoxes.get(i).getText())>game.getPlayerNo(i).getCredit())
                playerBetBoxes.get(i).setText(game.getPlayerNo(i).getCredit()+"");
            if (Integer.parseInt(playerBetBoxes.get(i).getText())<1)
                playerBetBoxes.get(i).setText(1+"");
            game.getPlayerNo(i).setBetValue(Integer.parseInt(playerBetBoxes.get(i).getText()));
            game.getPlayerNo(i).setCredit(game.getPlayerNo(i).getCredit()-game.getPlayerNo(i).getBetValue());
            playerBankFields.get(i).setText("BANK: "+game.getPlayerNo(i).getCredit());
        }
        results.get(currentPlayer).setText("");
        dealButton.setVisible(false);
        dealButton.setEnabled(false);
        stayButton.setVisible(true);
        stayButton.setEnabled(true);
        hitButton.setVisible(true);
        hitButton.setEnabled(true);
        dealerHand.setVisible(true);
        game.getDealer().setHand(new Hand(game.getDeck()));
        for (int i=0; i<game.getContPlayers();i++){
            game.getPlayerNo(0).setHand(new Hand(game.getDeck()));
            for (int j=0; j<11; j++){
                playerHandsLabels.get(i).get(j).setIcon(null);
                
            }
        }
        for (int i=0;i<11;i++)
            dealerCardLabels.get(i).setIcon(null);
        game.getDeck().shuffleCards();
        for (int i=0; i<game.getContPlayers();i++)
            game.getPlayerNo(i).setHand(new Hand(game.getDeck()));
        game.getDealer().setHand(new Hand(game.getDeck()));
        for (int i=0; i<2;i++){
            for (int j=0; j<game.getContPlayers();j++){
                game.getPlayerNo(j).getHand().addCard(game.getDeck().dealCard());
                playerHandsLabels.get(j).get(i).setIcon(game.getPlayerNo(j).getHand().getCard(i).getIcon());
            }
            game.getDealer().getHand().addCard(game.getDeck().dealCard());
        }
        cardD01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack2/images/b2fv.png")));
        cardD02.setIcon(game.getDealer().getHand().getCard(1).getIcon());
        p1Pointer.setVisible(true);
        if (game.getPlayerNo(currentPlayer).getHand().getHandValue()==21)
            stayButton.doClick();
        doubleDownButton.setEnabled(true);
        doubleDownButton.setVisible(true);
    }//GEN-LAST:event_dealButtonActionPerformed

    private void hitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitButtonActionPerformed
        doubleDownButton.setVisible(false);
        doubleDownButton.setEnabled(false);
        game.getPlayerNo(currentPlayer).getHand().addCard(game.getDeck().dealCard());
        playerHandsLabels.get(currentPlayer).get(game.getPlayerNo(currentPlayer).getHand().getContCards()-1).setIcon(game.getPlayerNo(currentPlayer).getHand().getCard(game.getPlayerNo(currentPlayer).getHand().getContCards()-1).getIcon());
        System.out.println(game.getPlayerNo(currentPlayer).getHand().getHandValue());
        if (game.getPlayerNo(currentPlayer).getHand().getHandValue()>=21){
            if (game.getPlayerNo(currentPlayer).getHand().getHandValue()>21)
                results.get(currentPlayer).setText(game.getPlayerNo(currentPlayer).getName()+" Busted!");
            stayButton.doClick();
        }
    }//GEN-LAST:event_hitButtonActionPerformed

    private void stayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stayButtonActionPerformed
        doubleDownButton.setVisible(false);
        doubleDownButton.setEnabled(false);
        pointers.get(currentPlayer).setVisible(false);
        currentPlayer++;
        System.out.println(currentPlayer);
        System.out.println(game.getContPlayers());
    if (currentPlayer>game.getContPlayers()-1){
        currentPlayer=0;
        cardD01.setIcon(game.getDealer().getHand().getCard(0).getIcon());
        while (game.getDealer().getHand().getHandValue()<17){
            game.getDealer().getHand().addCard(game.getDeck().dealCard());
            dealerCardLabels.get(game.getDealer().getHand().getContCards()-1).setIcon(game.getDealer().getHand().getCard(game.getDealer().getHand().getContCards()-1).getIcon());
        }
        for (int i=0;i<game.getContPlayers();i++){
            if ((game.getDealer().getHand().getHandValue()>21 && game.getPlayerNo(i).getHand().getHandValue()<21) || game.getPlayerNo(i).getHand().getHandValue()>game.getDealer().getHand().getHandValue() && game.getPlayerNo(i).getHand().getHandValue()<=21){
                if (game.getPlayerNo(i).getHand().getHandValue()==21 && game.getPlayerNo(i).getHand().getContCards()==2){
                    game.getPlayerNo(i).setCredit(game.getPlayerNo(i).getCredit()+((5*game.getPlayerNo(i).getBetValue())/2));
                    results.get(i).setText(game.getPlayerNo(i).getName()+" has blackjack!");
                }
                else{
                    game.getPlayerNo(i).setCredit(game.getPlayerNo(i).getCredit()+(2*game.getPlayerNo(i).getBetValue()));
                    results.get(i).setText(game.getPlayerNo(i).getName()+" Won!");
                }
                playerBankFields.get(i).setText("BANK: "+game.getPlayerNo(i).getCredit()+"");
            }
            else if (game.getPlayerNo(i).getHand().getHandValue()<=21 && game.getDealer().getHand().getHandValue()==game.getPlayerNo(i).getHand().getHandValue()){
                game.getPlayerNo(i).setCredit(game.getPlayerNo(i).getCredit()+game.getPlayerNo(i).getBetValue());
                playerBankFields.get(i).setText("BANK: "+game.getPlayerNo(i).getCredit()+"");
                results.get(i).setText(game.getPlayerNo(i).getName()+" Pushed.");
            }
            else if (game.getPlayerNo(i).getHand().getHandValue()<21){
                results.get(i).setText(game.getPlayerNo(i).getName()+" Lost.");
            }
        }
        hitButton.setVisible(false);
        hitButton.setEnabled(false);
        stayButton.setVisible(false);
        stayButton.setEnabled(false);
        dealButton.setVisible(true);
        dealButton.setEnabled(true);
        for (int i=0;i<game.getContPlayers();i++){
            playerBetBoxes.get(i).setEditable(true);
        }
        }
    else{
            pointers.get(currentPlayer).setVisible(true);
            if (game.getPlayerNo(currentPlayer).getHand().getHandValue()==21)
                stayButton.doClick();
            doubleDownButton.setVisible(true);
            doubleDownButton.setEnabled(true);
    }
    }//GEN-LAST:event_stayButtonActionPerformed

    private void doubleDownButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doubleDownButtonActionPerformed
        game.getPlayerNo(currentPlayer).getHand().addCard(game.getDeck().dealCard());
        playerHandsLabels.get(currentPlayer).get(2).setIcon(game.getPlayerNo(currentPlayer).getHand().getCard(2).getIcon());
        game.getPlayerNo(currentPlayer).setCredit(game.getPlayerNo(currentPlayer).getCredit()-game.getPlayerNo(currentPlayer).getBetValue());
        game.getPlayerNo(currentPlayer).setBetValue(game.getPlayerNo(currentPlayer).getBetValue()*2);
        playerBankFields.get(currentPlayer).setText("BANK: "+ game.getPlayerNo(currentPlayer).getCredit());
        stayButton.doClick();
    }//GEN-LAST:event_doubleDownButtonActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        InitialFrame i= new InitialFrame();
        i.setSize(1280, 700);
        i.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel card01p1;
    private javax.swing.JLabel card01p2;
    private javax.swing.JLabel card01p3;
    private javax.swing.JLabel card01p4;
    private javax.swing.JLabel card02p1;
    private javax.swing.JLabel card02p2;
    private javax.swing.JLabel card02p3;
    private javax.swing.JLabel card02p4;
    private javax.swing.JLabel card03p1;
    private javax.swing.JLabel card03p2;
    private javax.swing.JLabel card03p3;
    private javax.swing.JLabel card03p4;
    private javax.swing.JLabel card03p5;
    private javax.swing.JLabel card04p1;
    private javax.swing.JLabel card04p2;
    private javax.swing.JLabel card04p3;
    private javax.swing.JLabel card04p4;
    private javax.swing.JLabel card04p5;
    private javax.swing.JLabel card05p1;
    private javax.swing.JLabel card05p2;
    private javax.swing.JLabel card05p3;
    private javax.swing.JLabel card05p4;
    private javax.swing.JLabel card05p5;
    private javax.swing.JLabel card06p1;
    private javax.swing.JLabel card06p2;
    private javax.swing.JLabel card06p3;
    private javax.swing.JLabel card06p4;
    private javax.swing.JLabel card06p5;
    private javax.swing.JLabel card07p1;
    private javax.swing.JLabel card07p2;
    private javax.swing.JLabel card07p3;
    private javax.swing.JLabel card07p4;
    private javax.swing.JLabel card07p5;
    private javax.swing.JLabel card08p1;
    private javax.swing.JLabel card08p2;
    private javax.swing.JLabel card08p3;
    private javax.swing.JLabel card08p4;
    private javax.swing.JLabel card08p5;
    private javax.swing.JLabel card09p1;
    private javax.swing.JLabel card09p2;
    private javax.swing.JLabel card09p3;
    private javax.swing.JLabel card09p4;
    private javax.swing.JLabel card09p5;
    private javax.swing.JLabel card10p1;
    private javax.swing.JLabel card10p2;
    private javax.swing.JLabel card10p3;
    private javax.swing.JLabel card10p4;
    private javax.swing.JLabel card10p5;
    private javax.swing.JLabel card11p1;
    private javax.swing.JLabel card11p2;
    private javax.swing.JLabel card11p3;
    private javax.swing.JLabel card11p4;
    private javax.swing.JLabel card11p5;
    private javax.swing.JLabel card12p1;
    private javax.swing.JLabel card12p2;
    private javax.swing.JLabel card12p3;
    private javax.swing.JLabel card12p4;
    private javax.swing.JLabel card12p5;
    private javax.swing.JLabel card13p1;
    private javax.swing.JLabel card13p2;
    private javax.swing.JLabel card13p3;
    private javax.swing.JLabel card13p4;
    private javax.swing.JLabel card13p5;
    private javax.swing.JLabel card14p1;
    private javax.swing.JLabel card14p2;
    private javax.swing.JLabel card14p3;
    private javax.swing.JLabel card14p4;
    private javax.swing.JLabel card14p5;
    private javax.swing.JLabel card15p1;
    private javax.swing.JLabel card15p2;
    private javax.swing.JLabel card15p3;
    private javax.swing.JLabel card15p4;
    private javax.swing.JLabel card15p5;
    private javax.swing.JLabel cardD01;
    private javax.swing.JLabel cardD02;
    private javax.swing.JButton dealButton;
    private javax.swing.JLayeredPane dealerHand;
    private javax.swing.JLabel dealerResultLabel;
    private javax.swing.JButton doubleDownButton;
    private javax.swing.JButton hitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lbBetP1;
    private javax.swing.JLabel lbBetP2;
    private javax.swing.JLabel lbBetP3;
    private javax.swing.JLabel lbBetP4;
    private javax.swing.JLabel lbCredP1;
    private javax.swing.JLabel lbCredP2;
    private javax.swing.JLabel lbCredP3;
    private javax.swing.JLabel lbCredP4;
    private javax.swing.JLabel lbP1;
    private javax.swing.JLabel lbP2;
    private javax.swing.JLabel lbP3;
    private javax.swing.JLabel lbP4;
    private javax.swing.JTextField p1BetBox;
    private javax.swing.JLayeredPane p1Hand;
    private javax.swing.JLabel p1Pointer;
    private javax.swing.JLabel p1ResultLabel;
    private javax.swing.JTextField p2BetBox;
    private javax.swing.JLayeredPane p2Hand;
    private javax.swing.JLabel p2Pointer;
    private javax.swing.JLabel p2ResultLabel;
    private javax.swing.JTextField p3BetBox;
    private javax.swing.JLayeredPane p3Hand;
    private javax.swing.JLabel p3Pointer;
    private javax.swing.JLabel p3ResultLabel;
    private javax.swing.JTextField p4BetBox;
    private javax.swing.JLayeredPane p4Hand;
    private javax.swing.JButton stayButton;
    // End of variables declaration//GEN-END:variables

}
