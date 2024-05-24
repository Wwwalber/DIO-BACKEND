package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        //ações que não precisam estarem disponíveis para toda a aplicação
        // métodos privados Estabelecimento não tem mais acesso
        cozinheiro.baterVitaminaLiquidificador();
        cozinheiro.prepararLanche();
        cozinheiro.prepararVitamina();
        cozinheiro.prepararVitamina();

        // ações que estabelecimento precisa estar ciente
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Almoxarife almoxarife = new Almoxarife();
        //ações que não precisam estarem disponíveis para toda a aplicação
        almoxarife.controlarEntrada();
        almoxarife.controlarSaida();
		//ação que somente o seu pacote cozinha precisa conhecer (default)
        //almoxarife.entregarIngredientes();/*esse método tornou-se visível somente no pacote 'cozinha'. 
                //Logo não será mais visível para o estabelecimento como um todo */
        //almoxarife.trocarGas();//esse método tornou-se visível somente no pacote 'cozinha'

        Atendente atendente = new Atendente();
        atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servindoMesa();

  		//ação que somente o seu pacote cozinha precisa conhecer (default)
        //atendente.trocarGas();  // acesso a este método foi limitado na classe 
        // *** PEDIR PARA O ATENDENTE TROCAR O GÁS É UMA FUNCIONALIDADE LIMITADA ***

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        //não deveria, mas o estabelecimento
		//ainda não definiu normas de atendimento
		cliente.pegarPedidoBalcao();

		//esta ação é muito sigilosa, qua tal ser privada ?
        cliente.consultarSaldoAplicativo();

        //já pensou os clientes ouvindo que o gás acabou ?
        cozinheiro.pedirParaTrocarGas(atendente);
        cozinheiro.pedirParaTrocarGas(almoxarife);
    }
}
