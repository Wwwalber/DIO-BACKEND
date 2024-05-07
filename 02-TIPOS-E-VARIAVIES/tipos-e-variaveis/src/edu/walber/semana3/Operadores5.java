package edu.walber.semana3;

public class Operadores5 {

    public static void main(String[] args) {
        int a, b;

        a = 6;
        b = 6;

        String resultado = "";

        if (a==b) {
            resultado = "verdadeiro";
        } else {
            resultado = "false";
        }
        System.out.println(resultado);

        // operador ternário
        String resultado2 = (a==b) ? "verdadeiro":"falso";
        System.out.println(resultado2);

        // ou
        int resultado3 = (a==b)? 1 : 2;
        System.out.println(resultado3);
    }
}