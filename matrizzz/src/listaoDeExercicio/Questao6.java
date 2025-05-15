package listaoDeExercicio;

import java.util.Arrays;
import java.util.List;

public class Questao6 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Alice", "Bruno", "Carlos", "Daniela", "Eduardo");

        nomes.parallelStream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
