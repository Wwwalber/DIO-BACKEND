package ex1;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        /* não poderão mais ser chamados aqui, mas na própria classe sim
        jeep.confereCambio();
        jeep.confereCombustivel();
        */
        jeep.ligar();
    }
}
