package poo.aula.livraria;

public class LivroFisico extends Livro {

    public double getTaxaImpressao(){
        return this.getValor() * 0.05;
    }
}
