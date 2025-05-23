package poo.aula.livraria;

public class CarrinhoDeCompras {
    public void adiciona(LivroFisico livro){
        System.out.println("Adicionando livro físico: " + livro.getTitulo());
    }

    public void adiciona(Ebook livro){
        System.out.println("Adicionando eBook: " + livro.getTitulo());
    }

    public void adiciona(Livro livro){
        System.out.println("Adicionando Livro: " + livro.getTitulo());
        System.out.println("marca d'agua: " + ((Ebook)livro).getWaterMark());
    }
}
