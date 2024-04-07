package Back;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LoadGame {

    private String pasta;
    String caminho = "C:/Users/johnp/OneDrive/Desktop/GameInforamtion"; 

 
 
    public void setPasta(String pasta) {
        this.pasta = pasta;
    }
    
    public String returnPosition(int id) {
        setPasta(caminho);
        return carregarArquivos(Integer.toString(id) + "_position.txt");
    }
    public String returnDate(int id) {
        setPasta(caminho);
        return carregarArquivos(Integer.toString(id) + "_date.txt");
    }
    
    public String retunrName(int id){
        setPasta(caminho);
        return carregarArquivos(Integer.toString(id)+"_name.txt");
    }
    
     public ArrayList<String> returnInventory(int id) {
        return carregarInventario(Integer.toString(id) + "_inventory.txt");
    }
    
   private ArrayList<String> carregarInventario(String nomeArquivo) {
    ArrayList<String> inventario = new ArrayList<>();

    String caminhoArquivo = caminho + "/" + nomeArquivo;

    try (BufferedReader leitor = new BufferedReader(new FileReader(caminhoArquivo))) {
        String linha;
        while ((linha = leitor.readLine()) != null) {
            String[] itens = linha.split("\\n"); 
            for (String item : itens) {
                inventario.add(item); 
            }
        }
    } catch (IOException e) {
        System.err.println("Erro ao carregar inventário: " + e.getMessage());
    }

    System.out.println("Itens do inventário:");
    for (String item : inventario) {
    System.out.print(item+", ");
}
    return inventario;
}
    

    private String carregarArquivos(String nomeArquivo) {
        String caminhoArquivo = pasta + "/" + nomeArquivo;
        StringBuilder conteudo = new StringBuilder();

        try {
            File arquivo = new File(caminhoArquivo);
            BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
            String linha;

            while ((linha = leitor.readLine()) != null) {
                conteudo.append(linha);
                conteudo.append("\n");
            }
            leitor.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao carregar o arquivo: " + e.getMessage());
            return null;
        }

        return conteudo.toString();
    }
}
