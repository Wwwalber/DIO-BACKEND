package generics.exemplos;

import java.util.HashSet;
import java.util.Set;

public class GenericsExempleSet {
    public static void main(String[] args) {
        // com generics
        Set<String> conjuntoGeneric = new HashSet<>();
        conjuntoGeneric.add("elemento 1");
        conjuntoGeneric.add("elemento 2");

        //iterando
        for (String string : conjuntoGeneric) {
            System.out.println(string);
        }

        // sem generic
        Set conjuntoSemGeneric = new HashSet();
        conjuntoSemGeneric.add("elemento 1");
        conjuntoSemGeneric.add(10);

        // iterando (necessário cast)
        for (Object object : conjuntoSemGeneric) {
            String str = (String) object;
            System.out.println(str);
        }
    }
}
