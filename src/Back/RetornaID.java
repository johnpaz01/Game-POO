package Back;

public class RetornaID {

    private Integer Id = 0;

    public int obtemid(String nome) {
        char[] vetorNome = nome.toCharArray();
        int i = 0;
        String numeroObtido = "";

        while (i < vetorNome.length && vetorNome[i] != '_') {
            i++;
        }
        if (i < vetorNome.length) {
            i++;
            while (i < vetorNome.length && Character.isDigit(vetorNome[i])) {
                numeroObtido += vetorNome[i];
                i++;
            }
        }
        Id = Integer.parseInt(numeroObtido);
        System.out.println(numeroObtido);
        System.out.println(Id + " + " + Id + " = " + (Id + Id));
        return Id;
    }

    public Integer getId() {
        return Id;
    }
    
}
