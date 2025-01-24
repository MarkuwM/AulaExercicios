package ListaDeExercicioRecursos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class E3ListaPessoa {
    public static void main(String[] args) {
        List<Pessoa> pessoa = new ArrayList<>();
        pessoa.add(new Pessoa("Enzo", 21));
        pessoa.add(new Pessoa("Ana", 25));
        pessoa.add(new Pessoa("Carlos", 30));
        pessoa.add(new Pessoa("Bianca", 22));
        pessoa.add(new Pessoa("Diego", 35));

        List<Pessoa> crescente = pessoa.stream()
                .sorted(Comparator.comparingInt(Pessoa::getIdade))
                .collect(Collectors.toList());
        System.out.println("Pessoas ordendas por idade: " + crescente);
    }
    public static class Pessoa{
        public String nome;
        public int idade;

        public Pessoa(String nome, int idade){
            this.nome = nome;
            this.idade = idade;
        }
        public int getIdade() {
            return idade;
        }
    }
}
