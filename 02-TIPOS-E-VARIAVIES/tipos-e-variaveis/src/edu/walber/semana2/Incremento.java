package edu.walber.semana2;

public class Incremento {
    public static void main(String[] args) {
        int numero = 5;

        System.out.println(numero);
        System.out.println(numero++);// aqui imprime, e somentte depois incrementa
        System.out.println(numero);// logo, aqui já foi incrementado

        numero = 10; // alterando o valor de número
        System.out.println(++numero); // incrementando 1º, depois incrementando
    }
}
