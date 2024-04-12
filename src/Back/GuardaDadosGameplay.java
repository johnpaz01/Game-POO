
package Back;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

 
   

public class GuardaDadosGameplay {
    
    protected static String nomePersonagem;
    protected static String ultimoSave;
    protected static String posicaoAtual;
    protected static ArrayList<String> InventaioCarregado = new ArrayList<>();
    protected static int id;

    public GuardaDadosGameplay(String name, String ultimosave, String ultimaPosicao, 
            ArrayList<String> inventario, int ID){
    this.nomePersonagem = name;
    this.ultimoSave = ultimosave;
    this.posicaoAtual= ultimaPosicao;
    this.InventaioCarregado = inventario;
    this.id = ID;
        /*System.out.println(nomePersonagem);
        System.out.println(ultimoSave);
        System.out.println(posicaoAtual);
        for (String string : inventario) {
            System.out.println(InventaioCarregado);*/
        }

    

    public static void setUltimoSave(String ultimoSave) {
         Date dataAtual = new Date();
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        GuardaDadosGameplay.ultimoSave  = formatoData.format(dataAtual);
    }

    public static void setPosicaoAtual(String posicaoAtual) {
        GuardaDadosGameplay.posicaoAtual = posicaoAtual;
    }

    public static void setInventaioCarregado(ArrayList<String> InventaioCarregado) {
        GuardaDadosGameplay.InventaioCarregado = InventaioCarregado;
    }
    public static void addItem(String Item){
        InventaioCarregado.add(Item);
    }

   public void Atualization(){
       setPosicaoAtual(posicaoAtual);
       setInventaioCarregado(InventaioCarregado);
       setUltimoSave(ultimoSave);
   }
    
   public static boolean printall(){
       System.out.println("==== vamo la ver as informações====");
       System.out.println("So a posiçao atual");
       System.out.println(posicaoAtual);
       System.out.println("O inventario, a posição ja passou");
       System.out.println(InventaioCarregado);
       System.out.println(nomePersonagem);
       System.out.println(ultimoSave);
       return true;
   }
    
    
    }


    
    

