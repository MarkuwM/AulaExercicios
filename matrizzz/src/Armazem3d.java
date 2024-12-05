import java.util.Scanner;

public class Armazem3d {

    private static final String[][][] armazem = new String[3][4][5];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (condicao = true) {
            iniciarArmazem(armazem);
            mostrarArmazem(armazem);

            System.out.println("\tMenu");
            System.out.println("1 - Exibir o armazem");
            System.out.println("2 - Adicionar produto");
            System.out.println("3 - Remover produto");
            System.out.println("4 - Mover produto");
            System.out.println("5 - Lista produtos abaixo da quantidade minima");
            System.out.println("6 - Sair");
            int acao = scanner.nextInt();

            switch (acao) {
                case 1 -> mostrarArmazem(armazem);
            }
        }
    }

    public static boolean condicao = false;

    public static void iniciarArmazem(String[][][] armazem) {
        for (int andar = 0; andar < 3; andar++) {
            for (int corredor = 0; corredor < 4; corredor++) {
                for (int secao = 0; secao < 5; secao++) {
                    armazem[andar][corredor][secao] = "vazio,0";
                }
            }
        }
    }

    public static void mostrarArmazem(String[][][] armazem) {
        for (int andar = 0; andar < 3; andar++) {
            for (int corredor = 0; corredor < 4; corredor++) {
                for (int secao = 0; secao < 5; secao++) {
                    System.out.print(armazem[andar][corredor][secao] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
