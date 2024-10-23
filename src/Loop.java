import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvailiacao = 0;
        double nota = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota do filme...");
            nota = leitura.nextDouble();
            mediaAvailiacao += nota;
        }
        System.out.println("A avaliação do filme é " + mediaAvailiacao/3);
    }
}
