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

    public boolean aplicaDesconto(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        }else {
            double novoValor = getValor() - (this.getValor() * porcentagem);
            this.setValor(novoValor);
            return true;
        }
    }
}
