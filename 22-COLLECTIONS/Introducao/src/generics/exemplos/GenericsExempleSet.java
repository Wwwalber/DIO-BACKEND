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
    }
}
