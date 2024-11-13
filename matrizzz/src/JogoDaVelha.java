import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
        char[][] tabuleiro = new char[3][3];
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro jogador");
        String jogadorA = input.nextLine();

        System.out.println("Digite o nome do segundo jogador");
        String jogadorB = input.nextLine();

        inicializarTabuleiro(tabuleiro);
        boolean isJogoAcabou = false;
        int linha, coluna = 0;
        String jogadorAtual = jogadorA;

        while (!isJogoAcabou) {

            System.out.println(jogadorAtual + ", digite a linha da sua jogada");
            linha = input.nextInt();

            System.out.println(jogadorAtual + ", digite a coluna da sua jogada");
            coluna = input.nextInt();

            realizarJogada(linha, coluna);
            isJogoAcabou = verificarFimPartida();
            exibirTabuleiro();
            if (jogadorAtual == jogadorA) {
                jogadorAtual = jogadorB;
            }
            else {
                jogadorAtual = jogadorA;
            }
        }

    }

    public static void inicializarTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                System.out.print(tabuleiro[i][j]);
            }
            System.out.println();
        }
    }

    public static void exibirTabuleiro(){
        System.out.println("Exibindo o tabuleiro");
    }

    public static void realizarJogada(int linha, int coluna) {
        System.out.println("Realizando a jogada");
        if (isJogadaValida(linha, coluna)) {
            //atualizar matriz com a jogada
        }
    }

    public static boolean isJogadaValida(int linha, int coluna) {
        System.out.println("verificando se a jogada é válida");
        //verificar se a matriz ta vazia na posição da jogada
        return false;
    }

    public static boolean verificarFimPartida() {
        System.out.println("verificando se a partida acabou");
        //validar se alguém venceu ou se a partida empatou
        //ganha quando a matriz tiver o mesmo valor em linha, coluna ou diagonal
        return false;
    }
}