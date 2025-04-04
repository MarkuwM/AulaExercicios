package poo.alderlindson.atividade01;

public class AnimalDeEstimacao {
    private String nome;
    private String tipo;
    private int idade;
    private String raca;

    public AnimalDeEstimacao(String nome, String tipo, int idade, String raca) {
        this.nome = nome;
        this.tipo = tipo;
        this.idade = idade;
        this.raca = raca;
    }

    public void imprimirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Raça: " + raca);
    }

    public void emitirSom() {
        switch (tipo.toLowerCase()) {
            case "cachorro":
                System.out.println(nome + " faz: Au au");
                break;
            case "gato":
                System.out.println(nome + " faz: Miau");
                break;
            case "passaro":
                System.out.println(nome + " faz: Curupaco paco");
                break;
            default:
                System.out.println(nome + " emite um som desconhecido.");
                break;
        }
    }
}
