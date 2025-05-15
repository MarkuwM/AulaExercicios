package listaoDeExercicio;

public class Questao15 {
    private double x, y;

    public Questao15(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calcularDistancia(Questao15 outroPonto) {
        return Math.sqrt(Math.pow(outroPonto.x - this.x, 2) + Math.pow(outroPonto.y - this.y, 2));
    }

    public static void main(String[] args) {
        Questao15 ponto1 = new Questao15(3, 4);
        Questao15 ponto2 = new Questao15(7, 1);
        System.out.println("Distância: " + ponto1.calcularDistancia(ponto2));
    }
}
