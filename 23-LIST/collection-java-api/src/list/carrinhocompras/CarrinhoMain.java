package list.carrinhocompras;

public class CarrinhoMain {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        System.out.println("O valor total dos itens no carrinho é: "+
            carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.adicionarItem("banana", 7.5, 2);
        carrinhoDeCompras.adicionarItem("Leite", 32.0, 3);
        carrinhoDeCompras.adicionarItem("Açúcar", 5.0, 7);
        carrinhoDeCompras.adicionarItem("Café", 5, 7);
        carrinhoDeCompras.adicionarItem("Azeite", 35, 2);

        System.out.println("Itens do carrinho: ");
        carrinhoDeCompras.exibirItens();
        System.out.println("O valor total dos itens no carrinho é: "+
            carrinhoDeCompras.calcularValorTotal());
        
        carrinhoDeCompras.removerItem("banana");
        carrinhoDeCompras.removerItem("leite");
        carrinhoDeCompras.exibirItens();
    }
}
