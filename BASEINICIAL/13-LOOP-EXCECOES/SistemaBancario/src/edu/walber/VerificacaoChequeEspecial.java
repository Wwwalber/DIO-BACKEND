package edu.walber;

import java.util.Scanner;

public class VerificacaoChequeEspecial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o saldo atual da conta bancária.");
        double saldo = scanner.nextDouble();

        System.out.println("Informe o valor do saque que você deseja realiza:");
        double saque = scanner.nextDouble();

        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500;

        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {
            System.out.println("Transação realizada com sucesso.");
        }else if (saque > (saldo + 500)) {
            System.out.println("Transação não realizada. Limite do cheque especial excedido.");
        }
         else {
            System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
        }
        scanner.close();
    }
}