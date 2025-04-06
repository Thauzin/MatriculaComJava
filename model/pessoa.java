package model;

public abstract class pessoa {
    protected String nome;
    protected int idade;
    protected String cpf; 


    public pessoa (String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }


    public abstract void exibirDetalhes();
    
    
}
