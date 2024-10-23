import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String tipoConta = "Corrente";
        String usuario = "Gustavo de Jesus Bento";
        double saldo = 2500.00;

        System.out.println("********************************************");
        System.out.println(String.format("Nome:             %s", usuario));
        System.out.println(String.format("Tipo conta:       %s", tipoConta));
        System.out.println(String.format("Saldo inicial:    R$ %.2f", saldo));
        System.out.println("********************************************");
        adicionarEspacos(2);
        String menu = """
                ** Digite sua opção **

                1- Consultar saldos
                2- Receber valor
                3- Transferir o valor
                4- Sair
                """;
        int operacao = 0;
        while ( operacao != 4 ) {
            System.out.println(menu);
            operacao = leitura.nextInt();

            if (operacao == 1) {
                System.out.println(String.format("O saldo atual é R$ %.2f", saldo));
                adicionarEspacos(2);
            } else if (operacao == 2) {
                System.out.println("Informe o valor a receber:");
                double deposito = leitura.nextDouble();
                saldo += deposito;
                System.out.println(String.format("Saldo atualizado R$ %.2f", saldo));
                adicionarEspacos(2);
            } else if (operacao == 3) {
                System.out.println("Informe o valor que deseja transferir:");
                double transferencia = leitura.nextDouble();
                if (transferencia < saldo) {
                    saldo -= transferencia;
                    System.out.println(String.format("O saldo atual é R$ %.2f", saldo));
                } else {
                    System.out.println("Saldo insuficiente para realizar a transferência!");
                    adicionarEspacos(2);
                }
            } else if(operacao != 4) {
                System.out.println("Opção inválida, tente novamente!");
                adicionarEspacos(2);
            }
        }


    }
    private static void adicionarEspacos(int linhas) {
        for (int i = 0; i < linhas; i++) {
            System.out.println();
        }
    }
}
