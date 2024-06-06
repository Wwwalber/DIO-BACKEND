package generics.exemplos;

import java.util.ArrayList;
import java.util.List;

public class GenericsExempleList {
    public static void main(String[] args) {
        // exemplo sem generic
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10);

    //exemplo com Generics
        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");

    //iterando sobre a lista com Generics
        for (String object : listaGenerics) {
            System.out.println(object);
        }
    //iterando sobre a lista sem Generics( necessário fazer cast)
        for (Object object : listaSemGenerics) {
            String str = (String) object;
            System.out.println(str);
        }

    }
}
