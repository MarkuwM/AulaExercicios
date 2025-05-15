package listaoDeExercicio;

import java.util.stream.IntStream;

public class Questao5 {
    public static void main(String[] args) {
        int soma = IntStream.rangeClosed(1, 100)
                .filter(n -> n % 3 == 0)
                .sum();

        System.out.println("A soma dos números divisíveis por 3 entre 1 e 100 é: " + soma);
    }
}
