package Front;

import Back.FileUtils;
import java.awt.Color;

public class TelaInical extends javax.swing.JFrame {

    public TelaInical() {
        initComponents();
        FileUtils.criarPastaEArquivo();
        caregarjogo.setBackground(Color.WHITE);
        newgame.setBackground(Color.WHITE);
        DeletSave.setBackground(Color.WHITE);
        Sair.setBackground(Color.WHITE);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        newgame = new javax.swing.JButton();
        DeletSave = new javax.swing.JButton();
        caregarjogo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Inicial");
        setMinimumSize(new java.awt.Dimension(850, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel1.setText("Deletar Save: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 330, 200, 30);

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel2.setText("Revaltion");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(350, 70, 140, 30);

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel3.setText("Novo jogo:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 260, 190, 30);

        newgame.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        newgame.setText("<-");
        newgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newgameActionPerformed(evt);
            }
        });
        getContentPane().add(newgame);
        newgame.setBounds(290, 260, 160, 30);

        DeletSave.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        DeletSave.setText("<-");
        DeletSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletSaveActionPerformed(evt);
            }
        });
        getContentPane().add(DeletSave);
        DeletSave.setBounds(290, 330, 160, 30);

        caregarjogo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        caregarjogo.setText("<-");
        caregarjogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caregarjogoActionPerformed(evt);
            }
        });
        getContentPane().add(caregarjogo);
        caregarjogo.setBounds(290, 180, 160, 30);

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel4.setText("Carregar jogo:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 180, 220, 30);

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel5.setText("Sair:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 400, 150, 30);

        Sair.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Sair.setText("<-");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        getContentPane().add(Sair);
        Sair.setBounds(290, 400, 160, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newgameActionPerformed
        new TelaCriarSave().setVisible(true);
        dispose();
    }//GEN-LAST:event_newgameActionPerformed

    private void DeletSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletSaveActionPerformed
  TelaCarregamento tlc = new TelaCarregamento(2);
    tlc.setVisible(true);
        dispose();        
    }//GEN-LAST:event_DeletSaveActionPerformed

    private void caregarjogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caregarjogoActionPerformed
    new TelaCarregamento(1).setVisible(true);
        dispose();
    }//GEN-LAST:event_caregarjogoActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
       dispose();
    }//GEN-LAST:event_SairActionPerformed

    
    
    
  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInical().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeletSave;
    private javax.swing.JButton Sair;
    private javax.swing.JButton caregarjogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton newgame;
    // End of variables declaration//GEN-END:variables
}
