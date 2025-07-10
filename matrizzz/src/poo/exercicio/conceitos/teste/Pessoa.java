package poo.exercicio.conceitos.teste;

abstract class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // 5. Sobrescrita (subclasses podem redefinir)
    public void apresentar() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}
