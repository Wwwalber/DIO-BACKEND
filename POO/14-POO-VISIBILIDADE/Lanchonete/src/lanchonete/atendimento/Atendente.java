package lanchonete.atendimento;

public class Atendente {

    public void servindoMesa(){
        pegarLancheCozinha();
        System.out.println("SERVINDO A MESA");
    }

    private void pegarLancheCozinha(){
        System.out.println("PEGANDO O LANCHE NA COZINHA");
    }

    public void receberPagamento() {
		System.out.println("RECEBENDO PAGAMENTO");
	}

    void trocarGas() {// mudança de public para default (sem anotação) para limitar o acesso
        System.out.println("ATENDENTE TROCANDO O GÁS");
        throw new UnsupportedOperationException("Unimplemented method 'trocarGas'");
    }

    private void pegarPedidoBalcao() {
		System.out.println("PEGANDO O PEDIDO NO BALCÃO");
	}

}
