package map.pesquisa;

public class Produto {
    // private long cod;  vai ser implementado como a chave no Map
    private String nome;
    private int quantidade;
    private double preco;
    
    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + "]";
    }

    /* não preciso implementar equal ou hascode porque a coleção
     (Map nesse exemplo) já me garante uma chave que manterá elementos
     únicos
     */
}
