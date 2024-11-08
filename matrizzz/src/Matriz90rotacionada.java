import java.util.Scanner;

public class Matriz90rotacionada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz3x3 = new int[3][3];
        int[][] matriz90 = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um valor: ");
                matriz3x3[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nMatriz 3x3");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz3x3[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz90[j][2 - i] = matriz3x3[i][j];
            }
        }
        System.out.println("\nMatriz rotacionada");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz90[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
