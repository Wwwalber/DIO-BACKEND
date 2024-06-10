import java.util.List;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {

        // Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(
            () ->  "Olá! Seja bem vindo!")               
            .limit(5).toList();

        // imprime as saudações geradas
        listaSaudacoes.forEach(System.out::println);
    }
}
