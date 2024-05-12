package edu.walber;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero =1; numero<=8;numero++){
            if (numero == 3 || numero ==5)
                break;// interronpeu o laço que seria até 5
            System.out.println(numero);
        }
        System.out.println("-----------");
        for(int numero =1; numero<=8;numero++){
            if (numero == 3 || numero == 6)
                continue;// interronpeu na condição 3 e 6, e continua com as impressões
            System.out.println(numero);
        }
    }
}
