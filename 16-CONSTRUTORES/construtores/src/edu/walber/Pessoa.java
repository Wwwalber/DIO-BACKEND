package edu.walber;

public class Pessoa {
    private String nome;
	private String cpf;
	private String endereco;

    public Pessoa(String cpf, String nome){
        this.cpf = cpf; // this informa que this.cpf é o da classe
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
