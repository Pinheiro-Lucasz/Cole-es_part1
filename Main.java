package Lista;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exemploListaSimplesOrdenadaClasseExterna();
    }

    private static void exemploListaSimplesOrdenadaClasseExterna() {
        System.out.println("****** ID Pessoal ******");
        List<Identificacao> lista = new ArrayList<Identificacao>();

        Identificacao a = new Identificacao("Coronel Jesuino", "Masculino");
        Identificacao b = new Identificacao("Maria Machadão", "Feminino");
        lista.add(a);
        lista.add(b);
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");

        for (Identificacao genero : lista) {
            System.out.println(genero);
        }
    }
}