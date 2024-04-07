
package Front;

import Back.CriarNovoPersonagem;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;



public class TelaCriarSave extends javax.swing.JFrame {
     private Checkbox[] checkboxes;
     private ArrayList<String> itensIniciais = new ArrayList<>();
     private String name;

    public TelaCriarSave() {
        initComponents();
        Aviso.setVisible(false);
        formatoDenomeInvalido.setVisible(false);
        nomeEmBranco.setVisible(false);
        checkboxes = new Checkbox[4];
        checkboxes[0] = Canivete;
        checkboxes[1] = Agua;
        checkboxes[2] = curativo;
        checkboxes[3] = Lanterna;
        Voltar.setBackground(Color.WHITE);
        CriarpersonagemButton.setBackground(Color.WHITE);
        initializeCheckboxListeners();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        Labelescolha = new javax.swing.JLabel();
        RecebeNome = new javax.swing.JTextField();
        CriarpersonagemButton = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Canivete = new java.awt.Checkbox();
        Agua = new java.awt.Checkbox();
        curativo = new java.awt.Checkbox();
        Lanterna = new java.awt.Checkbox();
        Aviso = new javax.swing.JLabel();
        formatoDenomeInvalido = new javax.swing.JLabel();
        nomeEmBranco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Castellar", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("New Game:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(290, 90, 220, 60);

        Labelescolha.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        Labelescolha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Labelescolha.setText("Escolha 2 itens:");
        getContentPane().add(Labelescolha);
        Labelescolha.setBounds(270, 290, 250, 30);

        RecebeNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(RecebeNome);
        RecebeNome.setBounds(280, 230, 240, 40);

        CriarpersonagemButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CriarpersonagemButton.setText("Confirmar");
        CriarpersonagemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriarpersonagemButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CriarpersonagemButton);
        CriarpersonagemButton.setBounds(410, 410, 130, 50);

        Voltar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar);
        Voltar.setBounds(260, 410, 130, 50);

        jLabel8.setFont(new java.awt.Font("Castellar", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Nome:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(290, 160, 200, 40);

        Canivete.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Canivete.setLabel("Canivete\n");
        getContentPane().add(Canivete);
        Canivete.setBounds(210, 330, 90, 30);

        Agua.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Agua.setLabel("Água ");
        getContentPane().add(Agua);
        Agua.setBounds(310, 330, 100, 30);

        curativo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        curativo.setLabel("Curativo");
        getContentPane().add(curativo);
        curativo.setBounds(410, 330, 100, 30);

        Lanterna.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Lanterna.setLabel("lanterna");
        getContentPane().add(Lanterna);
        Lanterna.setBounds(520, 330, 100, 30);

        Aviso.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Aviso.setForeground(new java.awt.Color(204, 0, 0));
        Aviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Aviso.setText("*selecione apenas 2 itens*");
        getContentPane().add(Aviso);
        Aviso.setBounds(290, 370, 220, 19);

        formatoDenomeInvalido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        formatoDenomeInvalido.setForeground(new java.awt.Color(204, 0, 0));
        formatoDenomeInvalido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formatoDenomeInvalido.setText("*O nome não pode Terminar em  '\"_ \"  ");
        getContentPane().add(formatoDenomeInvalido);
        formatoDenomeInvalido.setBounds(270, 210, 280, 19);

        nomeEmBranco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nomeEmBranco.setForeground(new java.awt.Color(204, 0, 0));
        nomeEmBranco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeEmBranco.setText("*O nome não pode está em branco");
        getContentPane().add(nomeEmBranco);
        nomeEmBranco.setBounds(260, 210, 280, 19);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CriarpersonagemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarpersonagemButtonActionPerformed
      name = RecebeNome.getText();
      if(verificaFinalnome(name)){
    try { 
        CriarNovoPersonagem novoPersonagem = new CriarNovoPersonagem(name);
        for (int i = 0; i < checkboxes.length; i++) {
            if (checkboxes[i].getState()) {
                novoPersonagem.adicionarItemInicial(checkboxes[i].getLabel());
            }
        }
        novoPersonagem.saveALL();
    } catch (IOException ex) {
        Logger.getLogger(TelaCriarSave.class.getName()).log(Level.SEVERE, null, ex);
        }
      }        
    }//GEN-LAST:event_CriarpersonagemButtonActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        TelaInical tli = new TelaInical();
        tli.setVisible(true);
        dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    
 private void initializeCheckboxListeners() {
    ItemListener itemListener = new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            Checkbox checkbox = (Checkbox) e.getItemSelectable();
            int countSelected = 0;
            for (Checkbox cb : checkboxes) {
                if (cb.getState()) {
                    Aviso.setVisible(false);
                    countSelected++;
                }
            }
            if (countSelected > 2) {
                checkbox.setState(false);
                Aviso.setVisible(true);
            }
        }
    };

    for (Checkbox checkbox : checkboxes) {
        checkbox.addItemListener(itemListener);
    }
}

public boolean verificaFinalnome(String name) {
    boolean ok = true;
    if (name.matches(".*_+$")) {
        formatoDenomeInvalido.setVisible(true);
        nomeEmBranco.setVisible(false);
        ok = false;
    }else if(name.isEmpty()){
        formatoDenomeInvalido.setVisible(false);
        nomeEmBranco.setVisible(true);
        ok=false;
    }else {
        formatoDenomeInvalido.setVisible(false);
        nomeEmBranco.setVisible(false);
    }
    return ok;
}



    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCriarSave().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Checkbox Agua;
    private javax.swing.JLabel Aviso;
    private java.awt.Checkbox Canivete;
    private javax.swing.JButton CriarpersonagemButton;
    private javax.swing.JLabel Labelescolha;
    private java.awt.Checkbox Lanterna;
    private javax.swing.JTextField RecebeNome;
    private javax.swing.JButton Voltar;
    private java.awt.Checkbox curativo;
    private javax.swing.JLabel formatoDenomeInvalido;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel nomeEmBranco;
    // End of variables declaration//GEN-END:variables
}
