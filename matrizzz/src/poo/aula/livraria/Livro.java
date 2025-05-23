package poo.aula.livraria;

public abstract class Livro {

    private String titulo;

    private double valor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public boolean aplicarDesconto(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        }else {
            double novoValor = getValor() - (this.getValor() * porcentagem);
            this.setValor(novoValor);
            return true;
        }
    }
    public abstract boolean aplicaDesconto(double porcentagemDesconto);
}
