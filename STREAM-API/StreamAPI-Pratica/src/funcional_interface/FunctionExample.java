import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,15,25);

        // usar a Function com expressão Lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero * 2; // a vantagem aqui seria a reutilização
    
        // usar a função para dobrar todos os números no Stream e armazená-los em outra lista
        List<Integer> numerosDobrados = numeros.stream().map(dobrar).toList();

        // implementação sem usar o Function criado acima
        List<Integer> numerosDobrados2 = numeros.stream().map(numero -> numero * 2).toList();

        // imprimir a lista de números dobrados
        numerosDobrados2.forEach(System.out::println);
    }
}
