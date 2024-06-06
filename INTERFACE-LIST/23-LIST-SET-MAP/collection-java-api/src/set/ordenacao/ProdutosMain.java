package set.ordenacao;

public class ProdutosMain {
    public static void main(String[] args) {
        CadastroProduto cadastroProdutos = new CadastroProduto();
            // Adicionando produtos ao cadastro
        cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
        cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
        cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
        cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);

        // exibindo os produtos
        System.out.println("Exibindo o cadastro de produtos:");
        System.out.println(cadastroProdutos.produtoSet);

        System.out.println("Exibindo produtos ordenados por nome: ");
        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println("Exibindo produtos ordenados por preço: ");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());

    }
}
