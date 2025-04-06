import model.aluno;
import model.curso;
import model.disciplina;
import model.professor;
import service.gestorAcademico;
import java.util.Scanner;


public class app {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        gestorAcademico gestor = new gestorAcademico();


        while(true) {
            System.out.println("MENU");
            System.out.println("1 - Listar Alunos");
            System.out.println("2 - Listar Cursos");
            System.out.println("3 - Listar Professores");
            System.out.println("4 - Cadastrar Aluno");
            System.out.println("5 - Cadastrar Curso");
            System.out.println("6 - Cadastrar Professor");
            System.out.println("7 - Desmatricular Aluno");
            System.out.println("8 - Matricular Aluno em Curso ");
            System.out.println("9 - Atribuir Curso Ao Professor ");
            System.out.println("10 - Listar Cursos por Professor ");
            System.out.println("11 - Exibir alunos por Curso");
            System.out.println("12 - Contar alunos por Curso");
            System.out.println("13 - Adicionar Disciplina ao Curso");
            System.out.println("14 - Cadastrar disciplina");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 


                switch (opcao) {
                    case 1: 
                    System.out.println("Lista de Alunos");
                    gestor.listarAlunos();
                    break;
                    case 2:
                    System.out.println("Lista de Cursos");
                    gestor.listarCursos();
                    break;
                    case 3:
                    System.out.println("Lista de Professores");
                    gestor.listarProfessores();
                    break;
                    case 4:
                    System.out.println("Cadastrar Aluno");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("RA: ");
                    String ra = scanner.nextLine();
                    System.out.print("Código do curso: ");
                    String codigo_key = scanner.nextLine(); 

                    aluno a = new aluno(nome,idade,cpf,ra);
                    gestor.matricularAluno(a, codigo_key);



                    break;
                    case 5:
                    System.out.println("Cadastrar Curso");
                    System.out.print("Nome do curso: ");
                    String nome_curso = scanner.nextLine();
                    System.out.print("Código do curso: ");
                    String codigo = scanner.nextLine(); 
                    System.out.print("Carga horária: ");
                    int carga = scanner.nextInt();
                    scanner.nextLine();

                    curso c = new curso(nome_curso, carga, codigo);
                    gestor.cadastrarCurso(c);
                    break;

                    case 6: 
                    System.out.println("Cadastrar Professor");
                    System.out.print("Nome: ");
                    String nomeProf = scanner.nextLine(); 
                    System.out.print("Idade: ");
                    int idadeProf = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpfProf = scanner.nextLine();
                    System.out.print("Especialidade: ");
                    String especialidade = scanner.nextLine();
                    System.out.print("Salario: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine();
                    

                    professor p = new professor(nomeProf, idadeProf, cpfProf, especialidade, salario);
                    gestor.contratarProfessor(p);
                    break;

                    case 7: 
                    System.out.println("Desmatricular Aluno");
                    System.out.print("RA do aluno: ");
                    String raDesmatricular = scanner.nextLine();
                    System.out.print("Código do curso: ");
                    String codigo_keyDesmatricular = scanner.nextLine();

                    aluno b = gestor.AlunoPorRA(raDesmatricular);
                    if (b == null) {
                        System.out.println("Aluno não encontrado! ");
                    }
                    else{
                        gestor.desmatricularAluno(b, codigo_keyDesmatricular);
                    }
                    break;

                    case 8:
                    System.out.println("Matricular Aluno em outro curso");
                    System.out.print("RA do aluno: ");
                    String ramatricular = scanner.nextLine();
                    System.out.print("Código do curso: ");
                    String codigo_keyMatricular = scanner.nextLine();

                    aluno d = gestor.AlunoPorRA(ramatricular);
                    if (d == null) {
                        System.out.println("Aluno não encontrado! ");
                    }
                    else{
                        gestor.MatricularAlunoCurso(d, codigo_keyMatricular);
                    }
                    break;

                    case 9: 
                    System.out.println("Cadastrar Curso Ao Professor");
                    System.out.println("Nome do professor");
                    String nomeProf2 = scanner.nextLine();
                    System.out.print("Código do curso: ");
                    String codigo_keyCurso = scanner.nextLine();

                    professor p2 = gestor.ProfPorNome(nomeProf2);
                    if (p2 == null) {
                        System.out.println("Professor não encontrado! ");
                    }
                    else{
                        gestor.AdicionarCursoAoProfessor(p2, codigo_keyCurso);
                    }
                    break;

                    case 10: 
                    System.out.println("Procurar Curso do Professor");
                    System.out.print("Nome do professor: ");
                    String nomeProf3 = scanner.nextLine();
                    if(nomeProf3 == null){
                        System.out.println("Professor não encontrado! ");
                    }
                    else{
                        gestor.MateriasProf(nomeProf3);    
                    }
                    break;

                    case 11: 
                    System.out.println("Exibir Alunos por curso");
                    System.out.print("Nome do curso: ");
                    String codigo_keyCurso2 = scanner.nextLine();
                    gestor.alunosPorCurso(codigo_keyCurso2);
                    break;

                    case 12: 
                    System.out.println("Contar Alunos por curso");
                    System.out.print("Nome do curso: ");
                    String codigo_keyCurso3 = scanner.nextLine();
                    gestor.contarAlunos(codigo_keyCurso3);
                    break;

                    case 13:
                    System.out.println("Adicionar");
                    System.out.print("Nome da Disciplina: ");
                    String nomeD = scanner.nextLine();
                    System.out.print("Código do curso: ");
                    String codigo_keyCurso5 = scanner.nextLine();

                    disciplina d2 = gestor.DporNome(nomeD); 
                    if (d2 == null) {
                        System.out.println("Disciplina não encontrado! ");
                    }
                    else{
                        gestor.AdicionarDisciplinaAoCurso(d2, codigo_keyCurso5);
                    }
                    break;

                    case 14: 
                    System.out.println("Cadastrar Disciplina");
                    System.out.print("Nome da Disciplina: ");
                    String nomeD2 = scanner.nextLine();
                    System.out.print("Carga H da Disciplina: ");
                    int cargaH = scanner.nextInt();
                    System.out.print("Periodo do curso: ");
                    int periodo = scanner.nextInt();
                    disciplina d5 = new disciplina(nomeD2, cargaH, periodo);
                    gestor.cadastrarDisciplina(d5);
                    break;



                    case 0: 
                    System.out.println("Saindo");
                    scanner.close();
        }
    }
    }
}
