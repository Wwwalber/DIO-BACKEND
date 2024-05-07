package edu.walber.semana3;

public class Operadores7 {
    public static void main(String[] args) {

        boolean condição1 = true;
        boolean condição2 = true;

        if (condição1 && condição2) {
            System.out.println("As duas condições são verdadeiras!");
        }
        if (condição1 && (7 > 4)) {
            System.out.println("As duas condições são verdadeiras!");
        }
        if (condição1 || condição2) {
            System.out.println("Uma das condições é verdadeira!");
        }


        System.out.println("FIM!");
    }
}
