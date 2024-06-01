package set.operacoesbasicas;

public class ConvidadoMain {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
            // Adicionando convidados ao conjunto
        conjuntoConvidados.adicionarConvidado("Alice", 1234);
        conjuntoConvidados.adicionarConvidado("Bob", 1235);
        conjuntoConvidados.adicionarConvidado("Charlie", 1235);
        conjuntoConvidados.adicionarConvidado("David", 1236);

        System.out.println("Convidados no conjunto: ");

        // Exibe o número de convidados
        System.out.println("Existem "+conjuntoConvidados.contarConvidados()+
        " convidado(s) dentro do Set de Convidados");

        // Exibindo os convidados atualizados no conjunto
        System.out.println("Convidados no conjunto antes da remoção:");
        conjuntoConvidados.exibirConvidados();

        // Removendo um convidado do conjunto por código de convite
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1236);
        
        // Exibindo os convidados atualizados no conjunto
        System.out.println("Convidados no conjunto após a remoção:");
        conjuntoConvidados.exibirConvidados();
    }

    
}
