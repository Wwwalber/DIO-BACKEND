package list.ordenacao;

public class OrdenacaoMain {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoas = new OrdenacaoPessoa();
            // Adicionando pessoas à lista
        ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

        // exibindo a lista de pessoas
        System.out.println(ordenacaoPessoas.pessoaList);

        // exibindo a lista de pessoas por idade
        System.out.println("exibindo a lista de pessoas por idade");
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
    
        // exibindo a lista de pessoas por altura
        System.out.println("exibindo a lista de pessoas por altura");
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
