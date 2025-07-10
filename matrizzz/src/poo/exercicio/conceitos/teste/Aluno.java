package poo.exercicio.conceitos.teste;

class Aluno extends Pessoa {
    public Aluno(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void apresentar() {
        System.out.println("Aluno: " + getNome() + ", Idade: " + getIdade());
    }
}

class Professor extends Pessoa {
    public Professor(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void apresentar() {
        System.out.println("Professor: " + getNome());
    }
}
