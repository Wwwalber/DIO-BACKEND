package map.ope_basicas;

public class AgendaMain {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

            // Adicionar contatos
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("João", 5665);
        agendaContatos.adicionarContato("Carlos", 1111111);
        agendaContatos.adicionarContato("Ana", 654987);
        agendaContatos.adicionarContato("Maria", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);
        agendaContatos.adicionarContato("Camila DIO", 52458);

        System.out.println("Exibindo os contatos:");
        agendaContatos.exibirContatos();

        String paraRemover = "Ana";
        System.out.println("Remover contato "+paraRemover);
        agendaContatos.removerContato(paraRemover);

        System.out.println("exibir após remoção");
        agendaContatos.exibirContatos();

        // pesquisar múmero por nome
        String nomepesquida = "João";
        agendaContatos.pesquisarPorNome(nomepesquida);
        System.out.println("O número de telefone do "+nomepesquida+
                " é "+agendaContatos.pesquisarPorNome(nomepesquida));

    }
}
