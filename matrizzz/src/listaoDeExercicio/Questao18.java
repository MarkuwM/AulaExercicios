package listaoDeExercicio;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Questao18 {
    public static void main(String[] args) {
        List<Optional<String>> listaDeValores = Arrays.asList(
                Optional.of("Valor 1"),
                Optional.empty(),
                Optional.of("Valor 2"),
                Optional.empty(),
                Optional.of("Valor 3")
        );

        List<String> valoresValidos = listaDeValores.stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());

        System.out.println("Valores válidos: " + valoresValidos);
    }
}
