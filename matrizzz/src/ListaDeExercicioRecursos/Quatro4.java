package ListaDeExercicioRecursos;

import java.util.List;

public class Quatro4 {
    public static void main(String[] args) {
        List<String> palavras = List.of("cachorro", "gato", "elefante", "bicicleta", "java", "python");

        long quantidadeMaiorQueCinco = palavras.stream()
                .filter(palavra -> palavra.length() > 5)
                .count();

        System.out.println("Quantidade de palavras com mais de 5 caracteres: " + quantidadeMaiorQueCinco);
    }
}
