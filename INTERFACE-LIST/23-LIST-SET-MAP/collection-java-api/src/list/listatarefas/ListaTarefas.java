package list.listatarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
        for (Tarefa tarefa : tarefaList) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                // vai preenchendo o que deverá ser removido
                tarefaParaRemover.add(tarefa);
            }
        }
        tarefaList.removeAll(tarefaParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("O número total de elementos na lista é:  "+
                    listaTarefas.obterNumeroTotalTarefas());
        
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");

        listaTarefas.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é:  "+
        listaTarefas.obterNumeroTotalTarefas());  
        
        listaTarefas.removerTarefa("Tarefa 1");

        System.out.println("O número total de elementos na lista é:  "+
        listaTarefas.obterNumeroTotalTarefas()); 
        
        listaTarefas.obterDescricoesTarefas();
    }
}
