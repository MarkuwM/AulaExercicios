package poo.alderlindson.atividade02;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fiat", "Uno", 2010, "Vermelho");
        Carro carro2 = new Carro("Chevrolet", "Celta", 2011, "Preto");

        System.out.println("Detalhes do Carro 1");
        carro1.imprimirDetalhes();
        carro1.acelerar();
        carro1.acelerar();
        carro1.frear();

        System.out.println("\nDetalhes do Carro 2");
        carro2.imprimirDetalhes();
        carro2.acelerar();
        carro2.frear();
        carro2.frear();
    }
}
