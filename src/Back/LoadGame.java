import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LoadGame {
    
    private String pasta;
    
    public LoadGame(String caminho) {
        this.pasta = caminho;
    }
   
    public String returnPosition(int id) {
        return carregarArquivos(Integer.toString(id) + "_position.txt");
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

