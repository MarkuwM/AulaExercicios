package poo.exercicio.conceitos.teste;

import java.util.List;

class Escola {
    private List<Professor> professores;
    private List<Aluno> alunos;

    public Escola(List<Professor> professores, List<Aluno> alunos) {
        this.professores = professores;
        this.alunos = alunos;
    }

    public void listarPessoas() {
        System.out.println("Professores:");
        for (Professor p : professores) {
            p.apresentar();
        }
        System.out.println("Alunos:");
        for (Aluno a : alunos) {
            a.apresentar();
        }
    }
}
