public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int ano = 2022;
        boolean contaPremium = true;
        double notaFilme = 8.1;
        System.out.println("Ano de lançamento: " + ano);
        System.out.println(notaFilme);
        double media = (9.8 + 8.1 + 8.5) / 3;
        /*System.out.println(media);*/
        String sinopse= """
                    Olá
                    estou
                    realizando testes
                """;
        int idade = 21;
        String nome = "Gustavo";
        double numeroDecimal = 5.9999;
       /* System.out.println(sinopse);*/
        String textoTeste = """
                    Olá, eu sou %s e tenho %d anos %.2f
                """.formatted(nome, idade, numeroDecimal);
       /* System.out.println(textoTeste);*/
        int classificacao = (int)  (media) / 2;
        /*System.out.println(classificacao);*/

        double celsius = 35.4;
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println(String.format("A temperatura de %.1f Celsius convertida para fahrenheit é %.1f", celsius, fahrenheit));


    }
}