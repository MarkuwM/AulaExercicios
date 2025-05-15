package listaoDeExercicio;

import java.util.Optional;

public class Questao10 {
    public static void main(String[] args) {
        Optional<String> nome = Optional.ofNullable(null);

        nome.ifPresent(System.out::println);
    }
}
