package edu.walber;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        System.out.println("CONTA BANCÁRIA Z");
        System.out.println("*** Recebendo dados da conta bancária ***");

        //criando o objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // capturando dados
        System.out.println("Por favor, digite seu nome");
        String nomeCLiente = scanner.next();   

        System.out.println("Por favor, digite o número da agência: ");
        String agencia  = scanner.next(); 

        System.out.println("Por favor, digite o número da conta: ");
        int numero  = scanner.nextInt();

        System.out.println("Por favor, digite o saldo: ");
        double saldo  = scanner.nextDouble();

        System.out.print("Olá "+nomeCLiente);
        System.out.print(", obrigado por criar uma conta em nosso banco.");
        System.out.print(" Sua agência é "+agencia+", conta "+numero);
        System.out.print(" e seu saldo é "+saldo+" já está disponível para saque.");
    }
}
