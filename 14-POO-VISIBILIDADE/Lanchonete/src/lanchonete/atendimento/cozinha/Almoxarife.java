package lanchonete.atendimento.cozinha;

public class Almoxarife {

    public void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
	}
	public void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DOS ITENS");
	}

    public void trocarGas() {
        System.out.println("ENTREGANDO INGREDIENTES");
        throw new UnsupportedOperationException("Unimplemented method 'trocarGas'");
    }

    public void entregarIngredientes() {
		System.out.println("ALMOXARIFE TROCANDO O GÁS");
        throw new UnsupportedOperationException("Unimplemented method 'entregarIngredientes'");
    }

}
