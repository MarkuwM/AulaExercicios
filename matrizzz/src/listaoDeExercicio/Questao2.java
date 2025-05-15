package listaoDeExercicio;

import java.util.function.BinaryOperator;

public class Questao2 {
    public static void main(String[] args) {
        BinaryOperator<Double> soma = (a, b) -> a + b;
        BinaryOperator<Double> subtracao = (a, b) -> a - b;
        BinaryOperator<Double> multiplicacao = (a, b) -> a * b;
        BinaryOperator<Double> divisao = (a, b) -> b != 0 ? a / b : Double.NaN;

        /*BinaryOperator<Double> divisao = (a, b) -> {
            if (b == 0) {
                System.out.println("Erro: Divisão por zero não permitida!");
                return Double.NaN;
            }
            return a / b;
        };*/

        double a = 10;
        double b = 0;

        System.out.println("Soma: " + soma.apply(a, b));
        System.out.println("Subtração: " + subtracao.apply(a, b));
        System.out.println("Multiplicação: " + multiplicacao.apply(a, b));
        System.out.println("Divisão: " + divisao.apply(a, b));
    }
}
