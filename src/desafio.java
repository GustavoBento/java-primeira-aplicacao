public class desafio {
    public static void main (String[] args) {
        /*1*/
        double nota1 = 7.5;
        double nota2 = 8.5;
        double media = (nota1 + nota2) / 2;
        System.out.println(media);

        /*2*/
        double x = 10.5;
        int y = (int) x;
        System.out.println(y);

        /*3*/
        char letra = 'a';
        String palavra = "palavr";
        System.out.println(palavra + letra);

        /*4*/
        double precoProduto = 10.99;
        int quantidade = 3;
        double total = precoProduto * quantidade;
        System.out.println(String.format("O valor total da compra é de R$ %.2f e o valor do item é %.2f",
                total, precoProduto));

        /*5*/
        double valorEmDolares = 15.50;
        double valorDolarEmReal = 4.94;
        double valorConvertido = valorEmDolares * valorDolarEmReal;
        System.out.println(String.format("$%.2f convertido pra real é R$%.2f", valorEmDolares, valorConvertido));

        /*6*/
        double precoOriginal = 59.90;
        double percentualDesconto = 10;
        double valorDesconto = (precoOriginal * percentualDesconto) / 100;
        double precoComDesconto = precoOriginal - valorDesconto;
        System.out.println(String.format("O preço é R$%.2f e o valor do desconto é " +
                        "de R$%.2f. O preço final fica R$%.2f", precoOriginal, valorDesconto, precoComDesconto));
    }
}
