package Back;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BuscarNome {
    

    private String caminhoArquivo = FileUtils.caminhoArquivo;

    public List<String> buscarNome(String nomeProcurado) {
    List<String> nomesEncontrados = new ArrayList<>();
    String caminhoArquivo = this.caminhoArquivo;

    try {
        File arquivo = new File(caminhoArquivo);
        BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
        String linha;

        while ((linha = leitor.readLine()) != null) {
            if (linha.contains(nomeProcurado)) { 
                nomesEncontrados.add(linha);
            }
        }

        leitor.close();
    } catch (IOException e) {
        System.out.println("Ocorreu um erro ao buscar o nome: " + e.getMessage());
    }

    return nomesEncontrados;
}

}
