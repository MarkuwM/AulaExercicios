package listaoDeExercicio;

import java.util.Optional;

public class Questao9 {
    public static void main(String[] args) {
        Optional<String> mensagem = Optional.ofNullable("Olá Mundo");

        mensagem.ifPresent(System.out::println);
    }

}
