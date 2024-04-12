package Front;

import Back.CriarNovoPersonagem;
import Back.GuardaDadosGameplay;
import Back.SavePerson;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import Back.GuardaDadosGameplay;


public class OpcoesinGame extends javax.swing.JFrame {

    public OpcoesinGame() {
        initComponents();
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sair = new javax.swing.JButton();
        Contnuar = new javax.swing.JButton();
        Salvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(740, 550));
        getContentPane().setLayout(null);

        Sair.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        getContentPane().add(Sair);
        Sair.setBounds(210, 320, 310, 70);

        Contnuar.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        Contnuar.setText("Continuar");
        Contnuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContnuarActionPerformed(evt);
            }
        });
        getContentPane().add(Contnuar);
        Contnuar.setBounds(210, 110, 310, 70);

        Salvar.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        Salvar.setText("Salvar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });
        getContentPane().add(Salvar);
        Salvar.setBounds(210, 210, 310, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void ContnuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContnuarActionPerformed
        dispose();
    }//GEN-LAST:event_ContnuarActionPerformed

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        GuardaDadosGameplay.setPosicaoAtual("b2");
        GuardaDadosGameplay.printall();
        GuardaDadosGameplay.addItem("corda");
        SavePerson sp = new SavePerson();
        try {
            sp.saveALLBeforeFirstSave();
        } catch (IOException ex) {
            Logger.getLogger(OpcoesinGame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_SalvarActionPerformed

    public static void main(String args[]) {
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpcoesinGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Contnuar;
    private javax.swing.JButton Sair;
    private javax.swing.JButton Salvar;
    // End of variables declaration//GEN-END:variables
}
