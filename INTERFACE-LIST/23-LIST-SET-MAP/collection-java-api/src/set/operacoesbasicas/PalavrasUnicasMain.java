package set.operacoesbasicas;

public class PalavrasUnicasMain {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("vaca");
        conjuntoPalavrasUnicas.adicionarPalavra("macaco");
        conjuntoPalavrasUnicas.adicionarPalavra("elo");
        conjuntoPalavrasUnicas.adicionarPalavra("céu");
        conjuntoPalavrasUnicas.adicionarPalavra("estrela");
        conjuntoPalavrasUnicas.adicionarPalavra("carro");
        conjuntoPalavrasUnicas.adicionarPalavra("sentar");

        System.out.println("Exibir palavras criadas inicialmente: ");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        String palavraParaRetirar = "macaco";
        System.out.println("Remover palavra '"+palavraParaRetirar+"'");
        conjuntoPalavrasUnicas.removerPalavra(palavraParaRetirar);

        String palavraParaBuscar = "estrela";
        System.out.println("Buscar pela palavra '"+palavraParaBuscar+"'");
        conjuntoPalavrasUnicas.verificarPalavra(palavraParaBuscar);

        System.out.println("Exibindo Set de palavras após edições ");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
