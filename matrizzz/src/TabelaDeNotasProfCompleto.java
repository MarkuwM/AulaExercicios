import java.util.Scanner;

public class TabelaDeNotasProfCompleto {
    public static void main(String[] args) {

        String[][] notas = new String[5][5];
        Scanner input = new Scanner(System.in);
        notas[0][0] = "Aluno";
        notas[0][1] = "Etapa 1";
        notas[0][2] = "Etapa 2";
        notas[0][3] = "Etapa 3";
        notas[0][4] = "Média";

        percorrerMatriz(notas);

        for (int i = 1; i < notas.length; i++) {
            for (int j = 0; j < notas.length; j++) {
                if (j == 0) {
                    System.out.println("Digite o nome do Aluno");
                    notas[i][j] = input.nextLine();
                }
                if (j == 1) {
                    System.out.println("Digite a nota da Etapa 1");
                    notas[i][j] = input.nextLine();
                }
                if (j == 2) {
                    System.out.println("Digite a nota da Etapa 2");
                    notas[i][j] = input.nextLine();
                }
                if (j == 3) {
                    System.out.println("Digite a nota da Etapa 3");
                    notas[i][j] = input.nextLine();
                }
            }
        }

        percorrerMatriz(notas);
        calcularMedias(notas);
        ordenarNotas(notas);
        percorrerMatriz(notas);
        printMaiorNota(notas);
        printMenorNota(notas);

    }

    public static void percorrerMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void calcularMedias(String[][] matriz) {
        for (int i = 1; i < matriz.length; i++) {
            int soma = 0;
            for (int j = 1; j < matriz.length - 1; j++) {
                int valor = Integer.valueOf(matriz[i][j]);
                soma += valor;
            }
            matriz[i][4] = String.valueOf(soma / 3);
        }
    }

    public static void printMaiorNota(String[][] matriz) {
        int maiorNota = 0;
        String etapa = "";
        String aluno = "";

        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz.length - 1; j++) {
                int nota = Integer.valueOf(matriz[i][j]);
                if (nota > maiorNota) {
                    maiorNota = nota;
                    etapa = "Etapa " + j;
                    aluno = matriz[i][0];
                }
            }
        }

        System.out.println("--------------------------");
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Aluno: " + aluno);
        System.out.println(etapa);
        System.out.println("--------------------------");

    }

    public static void printMenorNota(String[][] matriz) {
        int menorNota = Integer.MAX_VALUE;
        String etapa = "";
        String aluno = "";

        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz.length - 1; j++) {
                int nota = Integer.valueOf(matriz[i][j]);
                if (nota < menorNota) {
                    menorNota = nota;
                    etapa = "Etapa " + j;
                    aluno = matriz[i][0];
                }
            }
        }

        System.out.println("--------------------------");
        System.out.println("Menor nota: " + menorNota);
        System.out.println("Aluno: " + aluno);
        System.out.println(etapa);
        System.out.println("--------------------------");

    }

    public static void ordenarNotas(String[][] matriz) {
        // Bubble Sort para ordenar as linhas com base na média (coluna 4)
        for (int i = 1; i < matriz.length - 1; i++) {
            for (int j = i + 1; j < matriz.length; j++) {
                // Comparar as médias (coluna 4)
                double media1 = Double.parseDouble(matriz[i][4]);
                double media2 = Double.parseDouble(matriz[j][4]);

                if (media1 < media2) { // Trocar para ordem crescente: use `media1 > media2`
                    // Troca de linhas
                    String[] temp = matriz[i];
                    matriz[i] = matriz[j];
                    matriz[j] = temp;
                }
            }
        }
    }
}