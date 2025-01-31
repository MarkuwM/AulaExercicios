package ListaDeExercicioRecursos;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class E3ListaPessoa2 {
    public static void main(String[] args) {
        List<Pessoa> pessoa = new ArrayList<>();
        pessoa.add(new Pessoa("Enzo", 21));
        pessoa.add(new Pessoa("Ana", 25));
        pessoa.add(new Pessoa("Carlos", 30));
        pessoa.add(new Pessoa("Bianca", 22));
        pessoa.add(new Pessoa("Diego", 35));

        // Ordenar a lista por idade
        List<Pessoa> crescente = pessoa.stream()
                .sorted(Comparator.comparingInt(Pessoa::getIdade))
                .collect(Collectors.toList());

        // Exibir as pessoas de forma mais bonita
        System.out.println("Pessoas ordenadas por idade:");
        System.out.println("----------------------------");
        for (Pessoa p : crescente) {
            System.out.println(String.format("%-10s | %-3d anos", p.getNome(), p.getIdade()));
        }
        System.out.println("----------------------------");
    }

    public static class Pessoa {
        private String nome;
        private int idade;

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public int getIdade() {
            return idade;
        }

        public String getNome() {
            return nome;
        }
    }
}
