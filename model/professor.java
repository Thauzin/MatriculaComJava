package model;

import java.util.ArrayList;
import java.util.List;

public class professor extends pessoa{
    protected String especialidade;
    protected Double salario;
    protected List<curso> cursos = new ArrayList<>(); 

    public professor(String nome, int idade, String cpf, String especialidade, Double salario, curso c) {
        super(nome, idade, cpf);
        this.especialidade = especialidade;
        this.salario = salario;
        this.cursos.add(c); 
    }

    public professor(String nome, int idade, String cpf, String especialidade, Double salario) {
        super(nome, idade, cpf);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public List<curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<curso> cursos) {
        this.cursos = cursos;
    }

    public void AdicionarCurso(curso c) {
        this.cursos.add(c);
    }

    public void exibirDetalhes(){
        System.out.println("\nNome: " + this.nome); 
        System.out.println("Idade: " + this.idade); 
        System.out.println("CPF: " + this.cpf);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println("Salário: " + this.salario);
        System.out.println("Materias: " +getCursos());
    }

    public void exibirMaterias(){
        System.out.println("\n Nome: " +getNome() + "\nMaterias: " +getCursos());
    }
    
}
