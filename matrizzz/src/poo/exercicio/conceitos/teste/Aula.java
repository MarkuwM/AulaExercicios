package poo.exercicio.conceitos.teste;

class Aula {
    private Professor professor;

    public Aula(Professor professor) {
        this.professor = professor;
    }

    public void ensinar(Aluno aluno) {
        System.out.println(professor.getNome() + " ensina " + aluno.getNome());
    }
}
