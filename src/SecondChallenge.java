import java.util.Scanner;

public class SecondChallenge {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);

        /*exercicio 1*/

        /*System.out.println("Digite um número...");
        double number = reading.nextDouble();
        if (number >= 0) {
            System.out.println(String.format("Number %.0f is positive ", number));
        } else {
            System.out.println(String.format("Number %.0f is negative ", number));
        }*/

        /*exercicio 2*/

        /*System.out.println("Digite um número...");
        int numero1 = reading.nextInt();
        System.out.println("Digite outro número...");
        int numero2 = reading.nextInt();
        if(numero1 == numero2) {
            System.out.println("Os números são iguais");
        } else if (numero1 > numero2) {
            System.out.println(String.format("O número %d é maior que o %d", numero1, numero2));
        } else {
            System.out.println(String.format("O número %d é menor que o %d", numero1, numero2));
        }*/

        /*exercicio 3*/

        /*System.out.println("Digite 1 para calcular a área do quadrado e 2 para calcular a área do circulo...");
        int opcao = reading.nextInt();
        if(opcao == 1) {
            System.out.println("Digite o tamanho em metros para calcular a área do quadrado...");
            int res = reading.nextInt();
            double areaQuadrado = res * res;
            System.out.println(String.format("A área do quadrado é %.2f metros.", areaQuadrado));
        } else if (opcao == 2) {
            System.out.println("Digite o tamanho em metros para calcular a área do circulo...");
            int res = reading.nextInt();
            double areaCirculo = (res * res) * 3.14159;
            System.out.println(String.format("A área do circulo é %.2f metros", areaCirculo));
        } else {
            System.out.println("Opção inválida...");
        }*/

        /*exercicio 4*/

        /*System.out.println("Digite um número que você deseja saber a tábuada do 1 até o 10");
        int numeroTabuada = reading.nextInt();
        int tabuada ;
        for (int i = 1; i <= 10; i++) {
            tabuada = numeroTabuada * i;
            System.out.println(String.format("%d X %d = %d", numeroTabuada, i, tabuada));
        }*/

        /*exercicio 5*/

        /*System.out.println("Digite um número inteiro...");
        int numeroInteiro = reading.nextInt();
        if (numeroInteiro % 2 == 0) {
            System.out.println(numeroInteiro + " é um número par");
        } else {
            System.out.println(numeroInteiro + " é um número impar");
        }*/

        /*exercicio 6*/

        System.out.println("Digite um número que você deseja saber o fatorial");
        int numeroFatorial = reading.nextInt();
        if (numeroFatorial > 0) {
            int totalFatorial = numeroFatorial;
            String fatorial = "";
            for (int i = numeroFatorial - 1; i > 0; i--) {
                totalFatorial *= i;
                fatorial += String.format("X %d ", i);
            }
            System.out.println(String.format("%d! = %d %s = %d", numeroFatorial, numeroFatorial, fatorial, totalFatorial));
        } else {
            System.out.println("NÚMERO INVÁLIDO!");
        }
    }
}
