package ListaoDeExercicios;

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do dia da semana (1 a 7): ");
        int numeroDoDia = scanner.nextInt();

        String descricao = switch (numeroDoDia) {
            case 1 -> "Domingo";
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            case 7 -> "Sábado";
            default -> "Número inválido! Por favor, insira um número entre 1 e 7.";
        };

        System.out.println("O dia da semana é: " + descricao);

        scanner.close();
    }
}
