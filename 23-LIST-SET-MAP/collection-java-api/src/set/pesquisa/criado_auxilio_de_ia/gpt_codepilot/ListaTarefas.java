package set.pesquisa.criado_auxilio_de_ia.gpt_codepilot;

import java.util.HashSet;
import java.util.Set;

class ListaTarefas {
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        Tarefa tarefa = new Tarefa(descricao);
        tarefas.add(tarefa);
    }

    public void removerTarefa(String descricao) {
        tarefas.remove(new Tarefa(descricao));
    }

    public void exibirTarefas() {
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }

    public int contarTarefas() {
        return tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> concluidas = new HashSet<>();
        for (Tarefa tarefa : tarefas) {
            if (tarefa.isConcluida()) {
                concluidas.add(tarefa);
            }
        }
        return concluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> pendentes = new HashSet<>();
        for (Tarefa tarefa : tarefas) {
            if (!tarefa.isConcluida()) {
                pendentes.add(tarefa);
            }
        }
        return pendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefa.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefa.setConcluida(false);
            }
        }
    }

    public void limparListaTarefas() {
        tarefas.clear();
    }
}