
package Front.TelaGame;

import Back.GuardaDadosGameplay;
import Front.OpcoesinGame;
import java.awt.Color;


public class TelaA01 extends javax.swing.JFrame {


    public TelaA01() {
        initComponents();
        Fotos.setBackground(Color.green);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ChamaMenu = new javax.swing.JButton();
        Fotos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 670));
        setPreferredSize(getMinimumSize());
        getContentPane().setLayout(null);

        ChamaMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/MenuIcon.png"))); // NOI18N
        ChamaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChamaMenuActionPerformed(evt);
            }
        });
        getContentPane().add(ChamaMenu);
        ChamaMenu.setBounds(990, 20, 30, 40);

        Fotos.setBackground(new java.awt.Color(0, 255, 51));
        Fotos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Fotos);
        Fotos.setBounds(-10, 10, 750, 480);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(750, 10, 290, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChamaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChamaMenuActionPerformed
    Front.OpcoesinGame op =new OpcoesinGame();
    op.setVisible(true);
    
    if(Back.GuardaDadosGameplay.printall()){
        System.out.println("As informação ai ^^^^");
    }
    }//GEN-LAST:event_ChamaMenuActionPerformed


    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windos".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaA01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaA01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaA01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaA01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaA01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChamaMenu;
    private javax.swing.JLabel Fotos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
