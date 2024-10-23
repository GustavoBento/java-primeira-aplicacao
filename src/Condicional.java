public class Condicional {
    public static void main(String[] args) {
        double notaDoFilme = 8.1;
        int anoDeLancamento = 2022;
        boolean contaPlus = true;
        String tipoDoPlano = "normal";

        if(anoDeLancamento >= 2022) {
            System.out.println("Filme em lançamento!");
        } else {
            System.out.println("Filme retrô, vale a pena assistir");
        }

        if(contaPlus == true || tipoDoPlano.equals("plus")) {
            System.out.println("Filme liberado para assitir.");
        } else {
            System.out.println("Pagar taxa do filme.");
        }
    }
}
