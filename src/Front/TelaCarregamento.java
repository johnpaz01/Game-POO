package Front;

import Back.BuscarNome;
import Back.LoadGame;
import Back.DeletarPersonagen;
import Back.RetornaID;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;


public class TelaCarregamento extends javax.swing.JFrame {

    public   BuscarNome bc = new BuscarNome();
    public RetornaID Rid = new RetornaID();
    public LoadGame Lgame =new LoadGame();
    private int id = 0;
    private String nomePersonagem;
    private String ultimoSave;
    private String posicaoAtual;
    private ArrayList<String> InventaioCarregado = new ArrayList<>();
    
    
    public TelaCarregamento(int op) {
        initComponents();
        switch (op) {
            case 1:
                CarregarPersonagem.setVisible(true);
                DeletarPersonagem.setVisible(false);
                LabelTitle.setText("Carregar Save:");
                break;
            case 2:
                CarregarPersonagem.setVisible(false);
                DeletarPersonagem.setVisible(true);
                LabelTitle.setText("Deletar Save:");

                break;
            default:
                break;
        }
        CarregarPersonagem.setBackground(Color.WHITE);
        Voltar.setBackground(Color.WHITE);
        DeletarPersonagem.setBackground(Color.WHITE);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ListaPersonagns = new javax.swing.JList<>();
        scrollPane1 = new java.awt.ScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListarPersonagens = new javax.swing.JList<>();
        CarregarPersonagem = new javax.swing.JButton();
        LabelPosicaoAtual = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LabelTitle = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LabelNomeJogador = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LabelLabelDate = new javax.swing.JLabel();
        Voltar = new javax.swing.JButton();
        RecebeNome = new javax.swing.JTextField();
        DeletarPersonagem = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(ListaPersonagns);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 650));
        getContentPane().setLayout(null);

        ListarPersonagens.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListarPersonagens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListarPersonagensMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ListarPersonagens);

        scrollPane1.add(jScrollPane2);

        getContentPane().add(scrollPane1);
        scrollPane1.setBounds(40, 180, 220, 360);

        CarregarPersonagem.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CarregarPersonagem.setText("Confirmar");
        CarregarPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarregarPersonagemActionPerformed(evt);
            }
        });
        getContentPane().add(CarregarPersonagem);
        CarregarPersonagem.setBounds(530, 500, 130, 50);

        LabelPosicaoAtual.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LabelPosicaoAtual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelPosicaoAtual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(LabelPosicaoAtual);
        LabelPosicaoAtual.setBounds(390, 390, 270, 50);

        jLabel3.setFont(new java.awt.Font("Castellar", 0, 24)); // NOI18N
        jLabel3.setText("Jogos Salvos:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 90, 220, 60);

        LabelTitle.setFont(new java.awt.Font("Castellar", 0, 24)); // NOI18N
        LabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitle.setText(".");
        getContentPane().add(LabelTitle);
        LabelTitle.setBounds(210, 30, 330, 60);

        jLabel5.setFont(new java.awt.Font("Castellar", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Posição Atual: ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(400, 330, 250, 60);

        LabelNomeJogador.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LabelNomeJogador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNomeJogador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(LabelNomeJogador);
        LabelNomeJogador.setBounds(390, 160, 260, 50);

        jLabel7.setFont(new java.awt.Font("Castellar", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ultimo Save:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(410, 210, 220, 60);

        LabelLabelDate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LabelLabelDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelLabelDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(LabelLabelDate);
        LabelLabelDate.setBounds(390, 280, 270, 50);

        Voltar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar);
        Voltar.setBounds(380, 500, 130, 50);

        RecebeNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecebeNomeActionPerformed(evt);
            }
        });
        RecebeNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RecebeNomeKeyReleased(evt);
            }
        });
        getContentPane().add(RecebeNome);
        RecebeNome.setBounds(40, 150, 220, 30);

        DeletarPersonagem.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        DeletarPersonagem.setText("Deletar");
        DeletarPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarPersonagemActionPerformed(evt);
            }
        });
        getContentPane().add(DeletarPersonagem);
        DeletarPersonagem.setBounds(530, 500, 130, 50);

        jLabel6.setFont(new java.awt.Font("Castellar", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nome:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(420, 100, 220, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CarregarPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarregarPersonagemActionPerformed
       
    //=========================    
    //chamar tela de acordo com position id        
    //=========================
    }//GEN-LAST:event_CarregarPersonagemActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
       TelaInical tli = new TelaInical();
       tli.setVisible(true);
       dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void RecebeNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecebeNomeActionPerformed

    }//GEN-LAST:event_RecebeNomeActionPerformed

    private void RecebeNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RecebeNomeKeyReleased
        String Letra = RecebeNome.getText().toLowerCase();
        ListarNomes(Letra);
    }//GEN-LAST:event_RecebeNomeKeyReleased

    private void ListarPersonagensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListarPersonagensMouseClicked
        if (evt.getClickCount() == 1) {
            JList<String> list = (JList<String>) evt.getSource();
            int index = list.getSelectedIndex();
            if (index >= 0) {
                String Nome = (String) list.getModel().getElementAt(index);
                 this.id = Rid.obtemid(Nome);
                System.out.println(id);
             this.nomePersonagem = Lgame.retunrName(id);
             this.posicaoAtual = Lgame.returnPosition(id);
             this.ultimoSave = Lgame.returnDate(id);
             this.InventaioCarregado = Lgame.returnInventory(id);
             setarLabes();
            }
        }
    }//GEN-LAST:event_ListarPersonagensMouseClicked

    private void DeletarPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarPersonagemActionPerformed
        System.out.println(id);
        DeletarPersonagen dlp = new DeletarPersonagen(id, nomePersonagem);
       dlp.deletarTodosArquivos();
      
    }//GEN-LAST:event_DeletarPersonagemActionPerformed

        
   public void ListarNomes(String letra){
       if(letra.equals("")){ListarPersonagens.setVisible(false);}else{
           ListarPersonagens.setVisible(true);
       }
    ArrayList<String> listaPersonagens = new ArrayList<>();
    listaPersonagens = (ArrayList<String>) bc.buscarNome(letra);
    DefaultListModel<String> model = new DefaultListModel<>(); 
        
    for (String listaPersonagen : listaPersonagens) {
        model.addElement(listaPersonagen); 
    }
    ListarPersonagens.setModel(model);
}

   public void setarLabes(){
     LabelNomeJogador.setText(getNomePersonagem());
     LabelLabelDate.setText(getUltimoSave());
     LabelPosicaoAtual.setText(getPosicaoAtual());
   }

   
   
    public String getNomePersonagem() {
        return nomePersonagem;
    }

    public String getUltimoSave() {
        return ultimoSave;
    }

    public String getPosicaoAtual() {
        return posicaoAtual;
    }

   

    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCarregamento(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CarregarPersonagem;
    private javax.swing.JButton DeletarPersonagem;
    private javax.swing.JLabel LabelLabelDate;
    private javax.swing.JLabel LabelNomeJogador;
    private javax.swing.JLabel LabelPosicaoAtual;
    private javax.swing.JLabel LabelTitle;
    private javax.swing.JList<String> ListaPersonagns;
    private javax.swing.JList<String> ListarPersonagens;
    private javax.swing.JTextField RecebeNome;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.ScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables
}
