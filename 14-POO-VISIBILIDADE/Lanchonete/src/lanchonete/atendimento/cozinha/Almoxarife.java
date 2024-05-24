package lanchonete.atendimento.cozinha;

public class Almoxarife {

    private void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
	}
	private void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DOS ITENS");
	}

    // não é mais public, mas default já que nem todos precisam tomar conhecimento dessas ações
    void trocarGas() {
        System.out.println("ENTREGANDO INGREDIENTES");
        throw new UnsupportedOperationException("Unimplemented method 'trocarGas'");
    }

    void entregarIngredientes() {
		System.out.println("ALMOXARIFE TROCANDO O GÁS");
        throw new UnsupportedOperationException("Unimplemented method 'entregarIngredientes'");
    }

}
