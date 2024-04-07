package Back;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BuscarNome {

    private String pasta = "C:/Users/johnp/OneDrive/Desktop/GameInforamtion";
    private String nomeArquivo;

    public BuscarNome() {
        this.nomeArquivo = "todosnomes.txt";
    }

    public List<String> buscarNome(String nomeProcurado) {
    List<String> nomesEncontrados = new ArrayList<>();
    String caminhoArquivo = pasta + "/" + nomeArquivo;

    try {
        File arquivo = new File(caminhoArquivo);
        BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
        String linha;

        while ((linha = leitor.readLine()) != null) {
            if (linha.contains(nomeProcurado)) { // Alterado aqui
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
