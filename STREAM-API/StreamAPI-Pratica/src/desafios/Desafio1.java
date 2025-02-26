package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 11,4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // mostrar os números na órdem alfabética
        numeros.stream().sorted().forEach(System.out::println);

                System.out.println("Mostre a lista na ordem númerica: ");
        List<Integer> numerosOrdemNatural = numeros.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(numerosOrdemNatural);
    }
}
