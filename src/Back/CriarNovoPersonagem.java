package Back;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class CriarNovoPersonagem {

    private String nome;
    private String position;
    private ArrayList<String> inventory = new ArrayList<>();
    private String data;
    private int id;
    private String caminho = "C:/Users/johnp/OneDrive/Desktop/GameInforamtion/";
    private String caminhonome = "C:/Users/johnp/OneDrive/Desktop/GameInforamtion/todosnomes.txt";
    
    public CriarNovoPersonagem(String name) {
    this.nome = name.toLowerCase();
    this.position = "a01"; 
    Date dataAtual = new Date();
    SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
    this.data = formatoData.format(dataAtual); 
    geraID(); 
}

 public void adicionarItemInicial(String item) {
        inventory.add(item);
    }
   

    public void geraID() {
    ArrayList<Integer> IdSalvo = lerIDsDoArquivo(caminhonome);
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
    
  public void salvarInformacoes(int tipo, String informacao, String sufixo) throws IOException {
    String caminhoArquivo = caminho + id + "_" + sufixo + ".txt";
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

     
     
     
     public void salvarInformacoesInventory() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminho + id + "_inventory.txt"))) {
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
     
     
    public void saveALL() throws IOException {
    salvarInformacoes(2, this.data, "date"); 
    salvarInformacoes(3, this.position, "position");
    salvarInformacoes(5, nome, "name");
    salvarInformacoesInventory();
    adicionarLinha(caminhonome, nomeComId());
    System.out.println(id);
    JOptionPane.showMessageDialog(null, "Personagem Salvo Com Sucesso!");

}

}   

