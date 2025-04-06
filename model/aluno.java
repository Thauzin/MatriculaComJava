package model;
import java.util.ArrayList;
import java.util.List;



public class aluno extends pessoa{
    protected String ra;
    protected List<curso> cursos = new ArrayList<>(); 
    protected List<disciplina> disciplinasMatriculadas = new ArrayList<>();


    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public aluno (String nome, int idade, String cpf, String ra, curso c, disciplina d){
        super(nome,idade,cpf);
        this.ra = ra; 
        this.cursos.add(c); 
        this.disciplinasMatriculadas.add(d);
    }

    public aluno (String nome, int idade, String cpf, String ra, curso c){
        super(nome,idade,cpf);
        this.ra = ra; 
        this.cursos.add(c); 
    }

    public aluno (String nome, int idade, String cpf, String ra){
        super(nome,idade,cpf);
        this.ra = ra; 
    }

    @Override 
    public void exibirDetalhes(){
        System.out.println("\nNome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Idade: " + getIdade());
        System.out.println("RA: " + this.ra);
        System.out.println("Cursos: " + getCursos()); 
        System.out.println("\nDisciplinas Matriculadas: " + getDisciplinasMatriculadas());
    }

    public void AdicionarDisciplina(disciplina d){
        this.disciplinasMatriculadas.add(d);
    }

    public void RemoverDisciplina(disciplina d){
        this.disciplinasMatriculadas.remove(d);
    }


    public void AdicionarCurso(curso c) {
        this.cursos.add(c);
    }
    
    
    public void RemoverCurso(curso c) {
        this.cursos.remove(c);
    }

    public List<curso> getCursos(){
        return this.cursos;
    }

    public List<disciplina> getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    public void ExibirDisciplinasMatriculadas(){
        System.out.println("\nDisciplinas Matriculadas: " + getDisciplinasMatriculadas());

    }
    
}
