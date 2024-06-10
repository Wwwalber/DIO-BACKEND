import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOpetarorExample {
    public static void main(String[] args) {
                // cria lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        /* usa o BinaryOperator com função lambda para somar dois números inteiros */
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2 ;

        // usa o BinaryOperator para somar todos os números
        int resultado = numeros.stream().reduce(0, somar); // 1º como variável temporária

        // imprimir os resultados
        System.out.println("A soma dos números é: "+resultado);

    }

}
