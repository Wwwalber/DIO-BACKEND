package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
    public void adicionarLancheNoBalcao(){
		System.out.println("ADICIONANDO LANCHE NATURAL HAMBÚRGUER NO BALCÃO");
    }

    public void adicionarSucoNoBalcao(){
        System.out.println("ADICIONANDO SUCO NO BALCÃO");
    }

    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche(){// acesso agora somente na própria classe
        System.out.println("PREPARANDO LANCHE TIPO HAMBÚRGUER");
    }

    private void prepararVitamina(){// acesso agora somente na própria classe
        System.out.println("PREPARANDO VITAMINA");

    }

    public void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche() {
		System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
	}

	private void selecionarIngredientesVitamina() { // acesso agora somente na própria classe
		System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
	}

	private void lavarIngredientes() { // acesso agora somente na própria classe
		System.out.println("LAVANDO INGREDIENTES");
	}

	private void baterVitaminaLiquidificador() {// acesso agora somente na própria classe
		System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
	}

	private void fritarIngredientesLanche() {
		System.out.println("FRITANDO A CARNE E OVO PARA O HAMBÚRGUER");
	}

    private void pedirParaTrocarGas(Atendente meuAmigo){
        // meuAmigo.trocarGas();// mudando o acesso a esse método na classe Atendente, não tem mais como chamá-lo daqui
        // *** O ZOZINHEIRO NÃO PODE PEDIR PARA O ATENDENTE TROCAR O GÁS ***
    }

    private void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }

    private void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
}
