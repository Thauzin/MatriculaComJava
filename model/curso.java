package model;

import java.util.ArrayList;
import java.util.List;

public class curso {
    protected String nome;
    protected int CargaH;
    protected String codigo;
    protected List<disciplina> disciplinasMatriculadas = new ArrayList<>();

    
    public curso(String nome, int CargaH, String codigo) {
        this.nome = nome;
        this.CargaH = CargaH;
        this.codigo = codigo;
    }

    public curso(String nome, int CargaH, String codigo, disciplina d ) {
        this.nome = nome;
        this.CargaH = CargaH;
        this.codigo = codigo;
        this.disciplinasMatriculadas.add(d);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCargaH() {
        return CargaH;
    }

    public void setCargaH(int cargaH) {
        CargaH = cargaH;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome + " (Código: " + this.codigo + ")";
    }

    public List<disciplina> getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    public void AdicionarDisciplina(disciplina d){
        this.disciplinasMatriculadas.add(d);
    }

    public void RemoverDisciplina(disciplina d){
        this.disciplinasMatriculadas.remove(d);
    }

    public void ExibirDisciplinasMatriculadas(){
        System.out.println("\nDisciplinas Matriculadas: " + getDisciplinasMatriculadas());
    }

}
