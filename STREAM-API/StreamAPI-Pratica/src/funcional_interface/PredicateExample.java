import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Kiotlin", "JavaScript", "C", "Python", "C#","Go");

        // cria o Predicate para verificar se e palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        /* usar o Stream para filtrar as palavras com mais de 5 caracteres e imprime cada
         palavra que passou no filtro  */
        palavras.stream().filter(maisDeCincoCaracteres).forEach(System.out::println);
    }
}
