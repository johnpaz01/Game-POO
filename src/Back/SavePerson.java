package Back;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import Back.GuardaDadosGameplay;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class SavePerson extends CriarNovoPersonagem{
    
    /*puxo as informaçoes da classe que guarda os dados da gameplay
    facilitar a manipulação
    */
    private String position = GuardaDadosGameplay.posicaoAtual;
    private ArrayList<String> inventory = GuardaDadosGameplay.InventaioCarregado;
    private String data;
    private int id = GuardaDadosGameplay.id;
    private String caminhoPasta = FileUtils.caminhoPasta;
    private String caminhoArquivo = FileUtils.caminhoArquivo;

    /*a data esta sendo formada aqui no construtor para toda vez que for chamda a classe ele pegar
    a data do ultimo Save;
    */

    public SavePerson() {
        super(2);
        Date dataAtual = new Date();
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        this.data = formatoData.format(dataAtual); 
    }

    @Override
    public void salvarInformacoes(int tipo, String informacao, String sufixo) throws IOException {
        super.salvarInformacoes(tipo, informacao, sufixo); 
    }

    public void salvarInformacoesInventory() {
        super.salvarInformacoesInventory(inventory);
    }
   
    

    
    
  
     
     
  
    public void saveALLBeforeFirstSave() throws IOException {
        System.out.println("Entrando no salvamento:");
      
            System.out.println("Indo pra data");
            super.modificaperson(this.data, "date.txt" );
            System.out.println("Indo pra posicap");
            System.out.println(position);
            super.modificaperson(this.position, "position.txt");
            System.out.println("Antes do inventário");
            super.modificaInventarioPerson(inventory);
            System.out.println("Salvou");
    }
}

    
    
    
    
    
    
