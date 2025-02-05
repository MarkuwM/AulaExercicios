package ListaoDeExercicios;

import java.util.Arrays;
import java.util.List;

public class Questao17 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("João", 25),
                new Pessoa("Maria", 30),
                new Pessoa("Carlos", 22),
                new Pessoa("Ana", 28)
        );

        double mediaIdades = pessoas.stream()
                .mapToInt(Pessoa::getIdade)
                .average()
                .orElse(0);

        System.out.println("Média de idades: " + mediaIdades);
    }
}

class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    int getIdade() {
        return idade;
    }
}
