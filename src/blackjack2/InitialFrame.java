package blackjack2;

/**
 *
 * @author Tiago
 */
public class InitialFrame extends javax.swing.JFrame {

    Game game;
    NameFrame nameFrame;
    public InitialFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lpMain = new javax.swing.JLayeredPane();
        lpButtons = new javax.swing.JLayeredPane();
        btInstruct = new javax.swing.JButton();
        btNewGame = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        cbQtplayers = new javax.swing.JComboBox();
        lbBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        lpMain.setMinimumSize(new java.awt.Dimension(1325, 720));

        btInstruct.setText("INSTRUCTIONS");
        btInstruct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInstructActionPerformed(evt);
            }
        });
        lpButtons.add(btInstruct);
        btInstruct.setBounds(49, 121, 211, 60);

        btNewGame.setText("NEW GAME");
        btNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewGameActionPerformed(evt);
            }
        });
        lpButtons.add(btNewGame);
        btNewGame.setBounds(50, 45, 210, 60);

        btExit.setText("EXIT");
        lpButtons.add(btExit);
        btExit.setBounds(49, 199, 211, 60);

        cbQtplayers.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 Player", "2 Players", "3 Players" }));
        cbQtplayers.setToolTipText("");
        cbQtplayers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbQtplayersActionPerformed(evt);
            }
        });
        lpButtons.add(cbQtplayers);
        cbQtplayers.setBounds(280, 50, 80, 40);

        lpMain.add(lpButtons);
        lpButtons.setBounds(820, 330, 470, 330);

        lbBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack2/images/initialbg.png"))); // NOI18N
        lbBackground.setText("jLabel2");
        lpMain.add(lbBackground);
        lbBackground.setBounds(0, 0, 1280, 710);

        getContentPane().add(lpMain);
        lpMain.setBounds(0, 0, 1325, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewGameActionPerformed
        game =  new Game();
        for(int i=0;i<cbQtplayers.getSelectedIndex();i++){
            game.addPlayer("Player "+(i+2));
        }
       // gameFrame =  new GameFrame(game);
        nameFrame =  new NameFrame(game, cbQtplayers.getSelectedIndex());
        this.setVisible(false);
        nameFrame.setVisible(true);
    }//GEN-LAST:event_btNewGameActionPerformed

    private void btInstructActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInstructActionPerformed
        InstructFrame intruct = new InstructFrame();
        intruct.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btInstructActionPerformed

    private void cbQtplayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbQtplayersActionPerformed
        
        
    }//GEN-LAST:event_cbQtplayersActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExit;
    private javax.swing.JButton btInstruct;
    private javax.swing.JButton btNewGame;
    private javax.swing.JComboBox cbQtplayers;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLayeredPane lpButtons;
    private javax.swing.JLayeredPane lpMain;
    // End of variables declaration//GEN-END:variables
}
