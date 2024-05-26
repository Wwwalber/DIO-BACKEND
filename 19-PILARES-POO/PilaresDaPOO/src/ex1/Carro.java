package ex1;

public class Carro {

    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }

    private void confereCombustivel(){
        System.out.println("conferindo combustível");
    }

    private void confereCambio(){
        System.out.println("conferindo cambio em P");
    }

}
