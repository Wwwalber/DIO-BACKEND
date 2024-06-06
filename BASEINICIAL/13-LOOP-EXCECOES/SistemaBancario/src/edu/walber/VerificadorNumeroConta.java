package edu.walber;

import java.util.Scanner;

public class VerificadorNumeroConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Informe o número da conta com 8 dígitos: ");
            String conta = scanner.nextLine();
            verificarNumeroConta(conta);
            System.out.println("Numero de conta valido.");

        } catch (IllegalArgumentException e) {
            System.out.printf("%s\n%s\n","Erro: Número da conta inválido.","Digite exatamente 8 digitos.");
        } finally {
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) throws IllegalArgumentException {
        if (numeroConta.length() < 8) {
            throw new IllegalArgumentException();
        }
    }
}
