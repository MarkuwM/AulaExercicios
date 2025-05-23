package poo.aula.livraria;

public class TesteLivraria {
    public static void main(String[] args) {
        Ebook eBookXoto = new Ebook();
        eBookXoto.setWaterMark("Pablo Marçal");
        eBookXoto.setTitulo("Aprenda POO em apenas 7 dias");
        eBookXoto.setValor(27.90);
        eBookXoto.aplicarDesconto(0.1);
        System.out.println("Valor do eBook: " + eBookXoto.getValor());

        LivroFisico livroFisico = new LivroFisico();
        livroFisico.setTitulo("Mais esperto que o Diabo");
        livroFisico.setValor(270);

        //Ilustrando sobreescrita do método .getTitulo()
        System.out.println("Titulo do livro: " + eBookXoto.getTitulo());

        //Ilustrando sobrecarga de métodos
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(eBookXoto);
        carrinho.adiciona(livroFisico);

    }
}
