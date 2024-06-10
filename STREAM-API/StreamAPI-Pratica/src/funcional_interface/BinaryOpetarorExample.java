import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOpetarorExample {
    public static void main(String[] args) {
                // cria lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
            /* usa o BinaryOperator com função lambda para somar dois números inteiros */
            BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2 ;
                             System.out.println("---- 1ª versão ------");

            // usa o BinaryOperator para somar todos os números
            int resultado = numeros.stream().reduce(0, somar); // 1º como variável temporária
            // imprimir os resultados
            System.out.println("A soma dos números é: "+resultado);
            
                            System.out.println("---- 2ª versão ------");
            // sem implementar o BinaryOperator
            int resultado2 = numeros.stream().reduce(0, new BinaryOperator<Integer>() {
                @Override
                public Integer apply(Integer n1, Integer n2) {
                    return n1 + n2;
                }
            });
            System.out.println("A soma dos números é: "+resultado2);


    }

}
