package set.pesquisa;

public class AgendaMain {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

            // Adicionando contatos à agenda
        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("Maria Fernandes", 55555555);
        agendaContatos.adicionarContato("Ana", 88889999);
        agendaContatos.adicionarContato("Fernando", 77778888);
        agendaContatos.adicionarContato("Carolina", 55555555);

            // Exibindo os contatos na agenda
        agendaContatos.exibirContatos();
            // Pesquisando contatos pelo nome
        String nomeParaPesquisar = "Maria";
        System.out.println("Pesquisar pelo nome '"+nomeParaPesquisar+"'");

        // Atualizando o número de um contato
        String contatoParaAtualizar ="Carolina";
        int numeroParaAtualizar = 44443333;
        System.out.println("Atualizar o contato '"+contatoParaAtualizar+"' com o número '"+numeroParaAtualizar+"'");
        
        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato(contatoParaAtualizar,numeroParaAtualizar);

        System.out.println("Contato atualizado: " + contatoAtualizado);

        // Exibindo os contatos atualizados na agenda
        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.exibirContatos();    
    }
}
