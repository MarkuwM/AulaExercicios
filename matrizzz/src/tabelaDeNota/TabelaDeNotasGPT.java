package tabelaDeNota;

import java.util.Scanner;

public class TabelaDeNotasGPT {
    public static void main(String[] args) {
        String[][] notas = new String[5][5];
        Scanner input = new Scanner(System.in);

        // Cabeçalhos da tabela
        notas[0][0] = "Aluno";
        notas[0][1] = "Etapa 1";
        notas[0][2] = "Etapa 2";
        notas[0][3] = "Etapa 3";
        notas[0][4] = "Média";

        // Entrada de dados
        for (int i = 1; i < notas.length; i++) {
            System.out.println("Digite o nome do Aluno " + i + ":");
            notas[i][0] = input.nextLine();

            for (int j = 1; j <= 3; j++) {
                System.out.println("Digite a nota da Etapa " + j + " para " + notas[i][0] + ":");
                while (true) {
                    try {
                        notas[i][j] = String.valueOf(Integer.parseInt(input.nextLine()));
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida. Digite um número inteiro.");
                    }
                }
            }
        }

        // Cálculo das médias
        calcularMedias(notas);

        // Exibir tabela inicial
        System.out.println("Tabela de Notas:");
        percorrerMatriz(notas);

        // Ordenar alunos por média
        ordenarNotas(notas);

        // Exibir tabela ordenada
        System.out.println("Tabela Ordenada por Média:");
        percorrerMatriz(notas);

        // Maior e menor nota
        printMaiorNota(notas);
        printMenorNota(notas);
    }

    public static void percorrerMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void calcularMedias(String[][] matriz) {
        for (int i = 1; i < matriz.length; i++) {
            int soma = 0;
            for (int j = 1; j <= 3; j++) {
                soma += Integer.parseInt(matriz[i][j]);
            }
            matriz[i][4] = String.format("%.2f", soma / 3.0);
        }
    }

    public static void ordenarNotas(String[][] matriz) {
        for (int i = 1; i < matriz.length - 1; i++) {
            for (int j = i + 1; j < matriz.length; j++) {
                if (Double.parseDouble(matriz[i][4]) < Double.parseDouble(matriz[j][4])) {
                    String[] temp = matriz[i];
                    matriz[i] = matriz[j];
                    matriz[j] = temp;
                }
            }
        }
    }

    public static void printMaiorNota(String[][] matriz) {
        int maiorNota = 0;
        String aluno = "";
        String etapa = "";

        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j <= 3; j++) {
                int nota = Integer.parseInt(matriz[i][j]);
                if (nota > maiorNota) {
                    maiorNota = nota;
                    aluno = matriz[i][0];
                    etapa = "Etapa " + j;
                }
            }
        }

        System.out.println("Maior Nota:");
        System.out.println("Aluno: " + aluno);
        System.out.println("Nota: " + maiorNota + " (" + etapa + ")");
    }

    public static void printMenorNota(String[][] matriz) {
        int menorNota = Integer.MAX_VALUE;
        String aluno = "";
        String etapa = "";

        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j <= 3; j++) {
                int nota = Integer.parseInt(matriz[i][j]);
                if (nota < menorNota) {
                    menorNota = nota;
                    aluno = matriz[i][0];
                    etapa = "Etapa " + j;
                }
            }
        }

        System.out.println("Menor Nota:");
        System.out.println("Aluno: " + aluno);
        System.out.println("Nota: " + menorNota + " (" + etapa + ")");
    }
}
