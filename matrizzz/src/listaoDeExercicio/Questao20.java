package listaoDeExercicio;

public class Questao20 {

    record Produto(String nome, double preco, String categoria) {}

    public static void main(String[] args) {
        Produto produto1 = new Produto("Smartphone", 1999.99, "Eletrônicos");
        Produto produto2 = new Produto("Camiseta", 49.90, "Vestuário");
        Produto produto3 = new Produto("Cafeteira", 299.90, "Eletrodomésticos");

        System.out.println(formatarConsulta(produto1));
        System.out.println(formatarConsulta(produto2));
        System.out.println(formatarConsulta(produto3));
    }

    public static String formatarConsulta(Produto produto) {
        return switch (produto.categoria()) {
            case "Eletrônicos" -> String.format("""
                    Categoria: Eletrônicos
                    Produto: %s
                    Preço: R$ %.2f
                    """, produto.nome(), produto.preco());
            case "Vestuário" -> String.format("""
                    Categoria: Vestuário
                    Produto: %s
                    Preço: R$ %.2f
                    """, produto.nome(), produto.preco());
            case "Eletrodomésticos" -> String.format("""
                    Categoria: Eletrodomésticos
                    Produto: %s
                    Preço: R$ %.2f
                    """, produto.nome(), produto.preco());
            default -> String.format("""
                    Categoria: Indefinida
                    Produto: %s
                    Preço: R$ %.2f
                    """, produto.nome(), produto.preco());
        };
    }
}
