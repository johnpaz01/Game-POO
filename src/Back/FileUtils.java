package Back;

import java.io.File;
import java.io.IOException;

public class FileUtils {
    public static String caminhoPasta;
    public static String caminhoArquivo;
    public static String diretorioBase;
/*aqui eu criei as variaveis que são o caminho do arquivo todos nomes.txt
    depois o caminho para pasta,depois odiretorio base, que´eu consigo toda ez que chamo
    a função criarPastaEArquivo(String diretorioBase), eu inico ela na tela inicial
    quando eu chamo o constrtutor,
    logo ele vai iniciar esta calsse sempre que eu iniciar ela e chamar o metodo inicial
    */     

    public static void criarPastaEArquivo() {
        //abaixo eu inicio com uma função que eu encontrei, para obter o usuario
        diretorioBase = System.getProperty("user.home") + File.separator + "Documentos";
        String nomePasta = "SavesPerson";
        String nomeArquivo = "todosnomes.txt";
        //esses arquivos não alteram a menos que eu queria, pos relativamente são fixos

        caminhoPasta = diretorioBase + File.separator + nomePasta;
        caminhoArquivo = caminhoPasta + File.separator + nomeArquivo;
        //aqui eu construo os caminhos prontos!

        try {
        //crio a pasta caso ela não exista
            File pasta = new File(caminhoPasta);
            if (!pasta.exists()) {
                pasta.mkdirs();
                System.out.println("Pasta 'SavesPerson' criada em: " + caminhoPasta);
            }

           //aqui eu crio o arquivo, se ele não existir tbm
            File arquivo = new File(caminhoArquivo);
            if (!arquivo.exists()) {
                arquivo.createNewFile();
                System.out.println("Arquivo 'todosnomes.txt' criado em: " + caminhoArquivo);
            }

        } catch (IOException e) {
            System.out.println("Erro ao criar a pasta e o arquivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
