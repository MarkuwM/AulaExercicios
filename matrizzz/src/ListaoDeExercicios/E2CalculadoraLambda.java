package ListaoDeExercicios;

import java.util.function.BiFunction;

public class E2CalculadoraLambda {
    public static void main(String[] args) {
        BiFunction<Double, Double, Double> soma = (a, b) -> a + b;
        BiFunction<Double, Double, Double> subtracao = (a, b) -> a - b;
        BiFunction<Double, Double, Double> multiplicacao = (a, b) -> a * b;
        BiFunction<Double, Double, Double> divisao = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Divisão por zero não é permitida!");
            }
            return a / b;
        };

        double a = 10;
        double b = 5;

        System.out.println("Soma: " + soma.apply(a, b));
        System.out.println("Subtração: " + subtracao.apply(a, b));
        System.out.println("Multiplicação: " + multiplicacao.apply(a, b));
        System.out.println("Divisão: " + divisao.apply(a, b));
    }
}
