package set.pesquisa.criado_auxilio_de_ia.gpt_codepilot;

class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean status) {
        this.concluida = status;
    }

    @Override
    public String toString() {
        return descricao + " [" + (concluida ? "Concluída" : "Pendente") + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tarefa tarefa = (Tarefa) o;

        return descricao != null ? descricao.equals(tarefa.descricao) : tarefa.descricao == null;
    }

    @Override
    public int hashCode() {
        return descricao != null ? descricao.hashCode() : 0;
    }
}