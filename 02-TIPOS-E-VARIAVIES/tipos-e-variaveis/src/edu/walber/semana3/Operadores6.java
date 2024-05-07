package edu.walber.semana3;

public class Operadores6 {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        String nomeUm = "Walber";
        String nomeDois = "Walber";
        String nomeTres = new String("Walber");// objeto
        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm == nomeTres);
        System.out.println("nomeUm 'equals' nomeTres: "+nomeUm.equals(nomeTres));

        if (numero1 < numero2) {
            System.out.println("A nossa condição é verdadeira");
        }

        boolean simNao = numero1 == numero2;
        System.out.println("Número um é igual a número 2 ? "+simNao);

        simNao = numero1 != numero2;
        System.out.println("Número um é diferente do número 2 ? "+simNao);  

        simNao = numero1 > numero2;
        System.out.println("Número um é maior que número 2 ? "+simNao);  
    }
}
