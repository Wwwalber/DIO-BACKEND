package set.pesquisa.criado_auxilio_de_ia;

import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;

public class ListaTarefas {
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        tarefas.removeIf(tarefa -> tarefa.getDescricao().equals(descricao));
    }

    public void exibirTarefas() {
        tarefas.forEach(tarefa -> System.out.println(tarefa));
    }

    public int contarTarefas() {
        return tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        return tarefas.stream()
                      .filter(Tarefa::isConcluida)
                      .collect(Collectors.toSet());
    }

    public Set<Tarefa> obterTarefasPendentes() {
        return tarefas.stream()
                      .filter(tarefa -> !tarefa.isConcluida())
                      .collect(Collectors.toSet());
    }

    public void marcarTarefaConcluida(String descricao) {
        tarefas.stream()
               .filter(tarefa -> tarefa.getDescricao().equals(descricao))
               .findFirst()
               .ifPresent(tarefa -> tarefa.setConcluida(true));
    }

    public void marcarTarefaPendente(String descricao) {
        tarefas.stream()
               .filter(tarefa -> tarefa.getDescricao().equals(descricao))
               .findFirst()
               .ifPresent(tarefa -> tarefa.setConcluida(false));
    }

    public void limparListaTarefas() {
        tarefas.clear();
    }
}

