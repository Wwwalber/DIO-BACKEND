package exemplos;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        /* não poderão mais ser chamados aqui, mas na própria classe sim
        jeep.confereCambio();
        jeep.confereCombustivel();
        */
        jeep.setChassi("8987554");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("854112");
        z400.ligar();

        Veiculo coringa = jeep;
        Veiculo coringa2 = z400;
        coringa.ligar();
        coringa2.ligar();
    }
}
