package edu.walber;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
    
        try {
            // chamar método com lógica de contagem
            contar(parametroUm,parametroDois);
        } catch (ParametrosInvalidosException e) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException();
        int contagem = parametroDois - parametroUm;
    }
    
}
