package set.pesquisa.criado_auxilio_de_ia.gpt_codepilot;

// Classe Main para testar os métodos
public class Main {
    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        // Teste adicionarTarefa
        lista.adicionarTarefa("Estudar para prova");
        lista.adicionarTarefa("Fazer compras");
        lista.adicionarTarefa("Limpar a casa");

        // Teste exibirTarefas
        System.out.println("Todas as Tarefas:");
        lista.exibirTarefas();

        // Teste contarTarefas
        System.out.println("\nTotal de Tarefas: " + lista.contarTarefas());

        // Teste marcarTarefaConcluida
        lista.marcarTarefaConcluida("Estudar para prova");
        System.out.println("\nTarefas Concluídas:");
        for (Tarefa tarefa : lista.obterTarefasConcluidas()) {
            System.out.println(tarefa);
        }

        // Teste obterTarefasPendentes
        System.out.println("\nTarefas Pendentes:");
        for (Tarefa tarefa : lista.obterTarefasPendentes()) {
            System.out.println(tarefa);
        }

        // Teste removerTarefa
        lista.removerTarefa("Fazer compras");
        System.out.println("\nTarefas após remover 'Fazer compras':");
        lista.exibirTarefas();

        // Teste limparListaTarefas
        lista.limparListaTarefas();
        System.out.println("\nTarefas após limpar a lista:");
        lista.exibirTarefas();
    }
}
