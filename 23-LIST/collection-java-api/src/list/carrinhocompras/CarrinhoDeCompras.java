package list.carrinhocompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itensDaLista;

    public CarrinhoDeCompras() {
        this.itensDaLista = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        itensDaLista.add(item);
    }

    public void removerItem(String nomeDoItem){
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itensDaLista.isEmpty()) {
            for (Item item : itensDaLista) {
                if (item.getNome().equalsIgnoreCase(nomeDoItem)) {
                    // preenche com todos os que serão removidos
                    itensParaRemover.add(item);
                }
            } // após preencher todos os itens
            itensDaLista.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal(){
        double valorCarrinho = 0;
        for (Item item : itensDaLista) {
            valorCarrinho = valorCarrinho + (item.getPreco()*item.getQuantidade());
        }
        //return itensDaLista.size() * valorCarrinho;
        return  valorCarrinho;
    }

    public void exibirItens(){
        System.out.println(itensDaLista);
    }
}
