package edu.walber.debbuging;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = { "Camila", "Lucas", "Bruna", "Pedro" };
        try {
            double media = calculaMediaDaTurma(alunos, scan);

            System.out.printf("Média da turma %.1f", media);
        } catch (InputMismatchException e) {
            System.out.println("Você deve fornecer um número!");
        }
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {
        double soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextInt();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
