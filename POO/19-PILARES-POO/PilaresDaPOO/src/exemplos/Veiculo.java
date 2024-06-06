package exemplos;

public abstract class Veiculo {
    private String chassi;

    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    // quem quiser ser um veículo precisará ter o método ligar()
    public abstract void ligar();
}
