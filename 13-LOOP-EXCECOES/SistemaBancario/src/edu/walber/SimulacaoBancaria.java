package edu.walber;

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        // Loop infinito para manter o programa em execução até que o usuário decida
        // sair
        boolean programaExecutando = true;
        while (programaExecutando) {
            System.out.println("Sistema bancário. Escolha uma opção digitando o número:");
            System.out.printf("1. %s\n2. %s\n3. %s\n4. %s\n", "Depositar", "Sacar", "Consultar saldo", "Encerrar");
            System.out.println("");
            int opcao = scanner.nextInt();
            System.out.println("Opção escolhida " + opcao);

            switch (opcao) {
                case 1:
                    System.out.println("Qual o valor a ser depositado?");
                    double deposito = scanner.nextDouble();
                    saldo = saldo + deposito;
                    System.out.println("Saldo atual: "+saldo);
                    break;
                case 2:
                    System.out.println("Qual o valor a ser sacado?");
                    double saque = scanner.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente para o saque!");
                        System.out.println("Saldo atual: "+saldo);
                    }else{
                        saldo = saldo - saque;
                        System.out.println("Saldo atual: "+saldo);
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: "+saldo);
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    programaExecutando = false;
                    break;
                default:
                System.out.println("Opção inválida. Tente novamente.");
            }

        }
    }
}
