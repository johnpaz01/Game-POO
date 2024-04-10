package Back;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DeletarPersonagen {

    private String nome;
    private String ultimoSave;
    private String posicaoAtual;
    private String inventario;
    private String nomePersonagem;
    private String caminhoDiretorio = FileUtils.caminhoPasta;
    private String idString;

    public DeletarPersonagen(int id, String name) {
        idString = Integer.toString(id);
        this.nome = idString + "_name.txt";
        this.ultimoSave = idString + "_date.txt";
        this.posicaoAtual = idString + "_position.txt";
        this.inventario = idString + "_inventory.txt";
        this.nomePersonagem = name;
    }

    public void deletarSaves(String caminho) {
        String nomeArquivo = caminhoDiretorio + caminho;
        File arquivo = new File(nomeArquivo);

        if (arquivo.delete()) {
            System.out.println("Arquivo deletado com sucesso: " + nomeArquivo);
        } else {
            System.out.println("Não foi possível deletar o arquivo: " + nomeArquivo);
        }
    }

   public void deletarTodosArquivos() {
    deletarSaves(nome);
    deletarSaves(ultimoSave);
    deletarSaves(posicaoAtual);
    deletarSaves(inventario);
    String name = construirNome(nomePersonagem, idString);
    excluirLinhaPorConteudo("todosnomes.txt", name);
    JOptionPane.showMessageDialog(null, "Arquivos deletados com sucesso!");
}


  public void excluirLinhaPorConteudo(String nomeArquivo, String conteudo) {
    File arquivoOriginal = new File(caminhoDiretorio + nomeArquivo);
    File arquivoTemporario = new File(caminhoDiretorio + "temp_" + nomeArquivo);

    try (BufferedReader leitor = new BufferedReader(new FileReader(arquivoOriginal));
         BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivoTemporario))) {

        String linha;
        while ((linha = leitor.readLine()) != null) {
            if (!linha.equals(conteudo)) {
                escritor.write(linha);
                escritor.newLine();
            }
        }
    } catch (IOException e) {
        System.err.println("Erro ao manipular o arquivo: " + e.getMessage());
        return;
    }
    if (!arquivoOriginal.delete()) {
        System.err.println("Erro ao excluir o arquivo original.");
        return;
    }

    if (!arquivoTemporario.renameTo(arquivoOriginal)) {
        System.err.println("Erro ao renomear o arquivo temporário.");
    } else {
        System.out.println("Linhas com o conteúdo '" + conteudo + "' removidas com sucesso.");
    }
}



    
public String construirNome(String nomePersonagem, String idString) {
    String frase = nomePersonagem + "_" + idString; 
    char[] fraseChar = frase.toCharArray();
    StringBuilder fraseFinal = new StringBuilder();

    for (char c : fraseChar) {
        if (!Character.isWhitespace(c)) {
            fraseFinal.append(c);
        }
    }
    String fraseFinalString = fraseFinal.toString();
    System.out.println(fraseFinalString);
    return fraseFinalString;
}



}

