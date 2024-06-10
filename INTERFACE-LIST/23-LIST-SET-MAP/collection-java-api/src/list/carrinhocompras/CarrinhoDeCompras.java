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
        if (!itensDaLista.isEmpty()) {
            for (Item item : itensDaLista) {
                valorCarrinho = valorCarrinho + (item.getPreco()*item.getQuantidade());
            }
            //return itensDaLista.size() * valorCarrinho;
            return  valorCarrinho;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public double calcularValorTotalImperativamente(){
        if (itensDaLista.isEmpty()) {
            throw new RuntimeException("A lista está vazia!");
        } else {
            return itensDaLista.stream().mapToDouble(item -> item.getPreco() * item.getQuantidade())
                .sum();
        }
    }

    public void exibirItens(){
        if (!itensDaLista.isEmpty()) {
            System.out.println(itensDaLista);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras [itensDaLista=" + itensDaLista + "]";
    }

    
}
