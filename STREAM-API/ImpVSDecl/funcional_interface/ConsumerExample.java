import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // cria lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar o Consumer com expressão lambda para imprimir múmeros pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if(numero % 2 == 0){ // verifica se é par
                System.out.print(numero+" ");
            }
        };
        // Usar o consumer para imprimir números pares
        numeros.stream().forEach(imprimirNumeroPar); 
        // transformando a lista 'numeros' em um stream
        System.out.println("\n------------");
        // segundo uso, mais prático
        numeros.stream().forEach(new Consumer<Integer>(){

            @Override
            public void accept(Integer num) {
                if (num % 2 == 0) {
                    System.out.print(num+" ");
                }
            }
            
        });
    }
}
