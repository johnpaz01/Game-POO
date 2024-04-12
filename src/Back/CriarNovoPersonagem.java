package Back;

import Front.TelaCriarSave;
import java.io.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class CriarNovoPersonagem {
    
    private Front.TelaCriarSave tl = new TelaCriarSave();
    private String nome;
    private String position;
    private ArrayList<String> inventory = new ArrayList<>();
    private String data;
    private int id;
    private String caminhoPasta = FileUtils.caminhoPasta;
    private String caminhoArquivo = FileUtils.caminhoArquivo;
    
    /*aqui eu seto as variaveis e uso o construtor para pegar a data
    e a posição inicial, logo criando um novo personagem
    */
    
    public CriarNovoPersonagem(int op) {
     this.nome = tl.RetornaNome();
    this.position = "a1"; 
    Date dataAtual = new Date();
    SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
    this.data = formatoData.format(dataAtual); 
    if(op==1){
        geraID();
    }else{
       this.id = GuardaDadosGameplay.id;
    }
}

    //aqui eu pego ops itens que o usuário escolheu para salvar no array list inventory
 public void adicionarItemInicial(String item) {
        inventory.add(item);
    }
   
/*gero um id com relção a outros saves e limito ele a 1.000 saves
 utilizando a proxima funçãopara pegar os id's salvos e não repetilos
 */
    public void geraID() {
    ArrayList<Integer> IdSalvo = lerIDsDoArquivo(caminhoArquivo);
    Random rd = new Random();
    int cont = 0;
    do {
        this.id = rd.nextInt(999) + 1;
        System.out.println(id);
        cont++;
    } while (IdSalvo.contains(id) || cont > 999);
    
    if (cont > 999) {
        System.out.println("Limite de Saves ultrapassado, exclua algum save!");
    }
}

 
    public ArrayList<Integer> lerIDsDoArquivo(String nomeArquivo) {
        ArrayList<Integer> ids = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String line;
            while ((line = br.readLine()) != null) {
                Pattern pattern = Pattern.compile("\\d+$");
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    String idStr = matcher.group();
                    int id = Integer.parseInt(idStr);
                    ids.add(id);
                }
            }
        } catch (IOException e) {
            System.out.println("Impossivel ler arquivo"+e.getMessage());
        }
        return ids;
    }
    
    public String nomeComId(){
    String nomeFinal = this.nome+"_"+this.id;
        System.out.println(nomeFinal);
        return nomeFinal;
    }
    
    /*uso as funções savar informaçãopara slavar elas no arquivo do personagem
    isso eu tenho casos se for nome eu tenho que salvar de forma diferente do que as outras variaveis
    do mesmo jeito para o inentario, que tem que ser salvo com loops de for each
    */
    
  public void salvarInformacoes(int tipo, String informacao, String sufixo) throws IOException {
    String caminhoArquivo = caminhoPasta +File.separator+ id + "_" + sufixo + ".txt";
      System.out.println(caminhoArquivo);
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
        if (tipo == 5) {
            writer.write(informacao); 
        } else {
            writer.write(informacao); 
        }
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
}

     
     
     
     public void salvarInformacoesInventory(ArrayList<String> inventory) {
         System.out.println("Tentando salvar inventario agora...");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoPasta +File.separator+
                id + "_inventory.txt"))) {
            
            for (String item : inventory) {
                writer.write(item);
                writer.newLine(); 
            }
            System.out.println("Inventário salvo no arquivo.");
        } catch (IOException e) {
            System.err.println("Erro ao salvar inventário no arquivo: " + e.getMessage());
        }
    }
     
     public void adicionarLinha(String caminhoArquivo, String linha) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo, true))) {
            writer.newLine(); 
            writer.write(linha);
            System.out.println("Linha adicionada ao arquivo.");
        } catch (IOException e) {
            System.err.println("Erro ao adicionar linha ao arquivo: " + e.getMessage());
        }
    }
    
     
     /*uma função final para juntar tudo e conseguir fazer um salvamento unico*/
     
   public void saveALL() throws IOException {
  
        salvarInformacoes(2, this.data, "date");
        salvarInformacoes(3, this.position, "position");
        salvarInformacoes(5, nome, "name");
        System.out.println("indo pro inventario");
        salvarInformacoesInventory(inventory);

    JOptionPane.showMessageDialog(null, "Personagem Salvo Com Sucesso!");
}
   
   
   public void modificaperson(String conteudo, String sufixo){
      String arquivo = FileUtils.caminhoPasta+File.separator+ GuardaDadosGameplay.id + "_"+sufixo;
       System.out.println(arquivo);
       
       try {
            // Abrir o arquivo em modo de escrita para sobrescrever as linhas
            BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo));
            writer.write(conteudo);

            writer.close();

            System.out.println("Conteúdo substituído com sucesso.");

        } catch (IOException e) {
            e.printStackTrace();
   }
   }
       
  public void modificaInventarioPerson(ArrayList<String> inventario){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoPasta +File.separator+
                GuardaDadosGameplay.id + "_inventory.txt"))) {
            for (String item : inventory) {
                writer.write(item);
                writer.newLine(); 
            }
            System.out.println("Inventário salvo no arquivo.");
        } catch (IOException e) {
            System.err.println("Erro ao salvar inventário no arquivo: " + e.getMessage());
        }
      
      
  }
  
  
      
  }
        

