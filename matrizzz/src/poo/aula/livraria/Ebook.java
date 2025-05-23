package poo.aula.livraria;

public class Ebook extends Livro{
    private String waterMark;

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    public void setTitulo(String titulo) {
        String novoTitulo = titulo + " (Ebook)" + " By: " + getWaterMark();
        super.setTitulo(novoTitulo);
    }
}
