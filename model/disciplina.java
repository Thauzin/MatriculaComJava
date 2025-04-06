package model;

public class disciplina {
    protected String nome;
    protected int cargaHoraria;
    protected int periodo;

    public disciplina(String nome, int cargaHoraria, int periodo) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.periodo = periodo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return this.nome;
    }


}
