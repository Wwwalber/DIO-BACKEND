package exemplos;

public class Carro {

    private String chassi;

    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }

    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    
    private void confereCombustivel(){
        System.out.println("conferindo combustível");
    }

    private void confereCambio(){
        System.out.println("conferindo cambio em P");
    }

}
