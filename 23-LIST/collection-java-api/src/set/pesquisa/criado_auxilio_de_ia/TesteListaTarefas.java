package set.pesquisa.criado_auxilio_de_ia;

public class TesteListaTarefas {
    public static void main(String[] args) {
        // Criando uma lista de tarefas
        ListaTarefas lista = new ListaTarefas();

        // Adicionando algumas tarefas
        lista.adicionarTarefa("Estudar para a prova");
        lista.adicionarTarefa("Fazer compras no mercado");
        lista.adicionarTarefa("Lavar o carro");

        // Marcando tarefas como concluídas
        lista.marcarTarefaConcluida("Estudar para a prova");
        lista.marcarTarefaConcluida("Lavar o carro");

        // Exibindo todas as tarefas
        System.out.println("Todas as tarefas:");
        lista.exibirTarefas();

        // Exibindo tarefas concluídas
        System.out.println("\nTarefas concluídas:");
        lista.obterTarefasConcluidas().forEach(System.out::println);

        // Exibindo tarefas pendentes
        System.out.println("\nTarefas pendentes:");
        lista.obterTarefasPendentes().forEach(System.out::println);
    }
}
