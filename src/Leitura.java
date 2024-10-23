import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu nome");
        String name = leitura.nextLine();
        System.out.println("Digite a sua idade");
        int age = leitura.nextInt();
        System.out.println("Digite o valor que você deseja investir esse mês");
        double investment = leitura.nextDouble();
        System.out.println(String.format(
                "Olá, meu nome é %s, eu tenho %d anos, e eu desejo investir %.2f por mês", name, age, investment
        ));
    }
}
