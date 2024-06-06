package generics.exemplos;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GenericsExempleMap {
public static void main(String[] args) {
    // exemplo sem generic
    Map mapaSemGeneric = new HashMap();
    mapaSemGeneric.put("Chave 1", 10);
    mapaSemGeneric.put("Chave 2", "valor");

    //iterando
    for (Object obj : mapaSemGeneric.entrySet()) {
        Entry entrada = (Entry) obj;
        String chave = (String) entrada.getKey();
        Object valor = entrada.getValue();
        System.out.println("Chave: " + chave + ", Valor: " + valor);
    }

    // exemplo com generic
    Map<String, Integer> mapaGenerics = new HashMap<>();
    mapaGenerics.put("Chave 1", 10);
    mapaGenerics.put("Chave 2", 20);

    // iterando com geberics
    for (Map.Entry<String, Integer> entrada : mapaGenerics.entrySet()) {
        String chave = entrada.getKey();
        int valor = entrada.getValue();
        System.out.println("Chave: " + chave + ", Valor: " + valor);
    }
}
}
