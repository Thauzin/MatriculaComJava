package service;
import java.util.ArrayList;
import java.util.List;
import model.aluno;
import model.curso;
import model.disciplina;
import model.professor;
import java.util.HashMap;
import java.util.Map;

public class gestorAcademico {
        protected List<aluno> ArmazenarAluno = new ArrayList<>(); 
        protected List<professor> ArmazenarProfessor = new ArrayList<>(); 
        protected List<disciplina> ArmazenarDisciplina = new ArrayList<>(); 
        Map<String, curso> cursos = new HashMap<>();

        public void cadastrarCurso(curso c){
            cursos.put(c.getCodigo(), c);
        }

        public void cadastrarDisciplina(disciplina d){
            ArmazenarDisciplina.add(d);
        }

        public void contratarProfessor(professor p){
            ArmazenarProfessor.add(p);
        }

        public void demitirProfessor(professor p){
            ArmazenarProfessor.remove(p);
        }

        public void matricularAluno (aluno a, String curso_key){
            curso c = this.cursos.get(curso_key);
            if (c == null) {
                System.out.println("Curso não encontrado! ");
                return;
            }
        a.AdicionarCurso(c);
        ArmazenarAluno.add(a);
    }

        public void desmatricularAluno(aluno a, String curso_key) {
            curso c = this.cursos.get(curso_key);
            if(c == null){
                System.out.println("Curso não encontrado!");
                return;
            }
            a.RemoverCurso(c);
        }  

        public void MatricularAlunoCurso(aluno a, String curso_key) {
            curso c = this.cursos.get(curso_key);
            if(c == null){
                System.out.println("Curso não encontrado!");
                return;
            }
            a.AdicionarCurso(c);
        } 

        public void AdicionarCursoAoProfessor(professor p, String curso_key) {
            curso c = this.cursos.get(curso_key);
            if(c == null){
                System.out.println("Curso não encontrado!");
                return;
            }
            p.AdicionarCurso(c);
        } 

        public void AdicionarDisciplinaAoCurso(disciplina d, String curso_key) {
            curso c = this.cursos.get(curso_key);
            if(c == null){
                System.out.println("Curso não encontrado!");
                return;
            }
            c.AdicionarDisciplina(d);
        }

        public void listarAlunos(){
            this.ArmazenarAluno.stream().forEach(aluno -> aluno.exibirDetalhes());
        }


        public void listarCursos(){
            cursos.values().stream().forEach(curso-> { System.out.println(curso.getNome());
            curso.ExibirDisciplinasMatriculadas();
        });
        }

        public void listarProfessores(){
            ArmazenarProfessor.stream().forEach(p -> p.exibirDetalhes());
        }


        public void listarProfPorNome(String filterNome){
            ArmazenarProfessor.stream().filter(p -> p.getNome().contains(filterNome)).forEach(p -> System.out.println(p.getNome()));
        }

        public void MateriasProf(String nomeProf3){
            ArmazenarProfessor.stream().filter(p -> p.getNome().contains(nomeProf3)).forEach(p -> p.exibirMaterias());
        }

        public void alunosPorCurso(String nomeCurso) {
            ArmazenarAluno.stream().filter(a -> a.getCursos().stream().anyMatch(c -> c.getNome().equals(nomeCurso))).forEach(a -> System.out.println(a.getNome()));
        }

        public void contarAlunos(String nomeCurso) {
           long total = ArmazenarAluno.stream().filter(a -> a.getCursos().stream().anyMatch(c -> c.getNome().equals(nomeCurso))).count();
            System.out.println("Total de alunos: " +nomeCurso + " é de " +total);
        }
        

        public aluno AlunoPorRA(String raDesmatricular) {
            return ArmazenarAluno.stream().filter(a -> a.getRa().equals(raDesmatricular)).findFirst().orElse(null);
        }

        public professor ProfPorNome(String nomeProf2) {
            return ArmazenarProfessor.stream().filter(p -> p.getNome().equals(nomeProf2)).findFirst().orElse(null);
        }

        public disciplina DporNome(String nomeD) {
            return ArmazenarDisciplina.stream().filter(d -> d.getNome().equals(nomeD)).findFirst().orElse(null);
        }



        
        

}