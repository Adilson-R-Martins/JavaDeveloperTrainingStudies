import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        String nome;
        int agencia = 0;
        int conta = 0;
        double saldo = 0;
        String entrada;

        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite seu Nome: ");
        nome = input.nextLine();

        System.out.println("Por favor, digite o número da sua Agência: ");
        entrada = input.nextLine();
        try {
            agencia = Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite apenas números.");
        }

        System.out.println("Por favor, digite o número da sua Conta: ");
        entrada = input.nextLine();
        try {
            conta = Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite apenas números.");
        }

        System.out.println("Por favor, digite o seu Saldo: ");
        entrada = input.nextLine();
        try {
            saldo = Double.parseDouble(entrada);
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite apenas números.");
        }

        input.close();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$" + String.format("%.2f", saldo) + " já está disponível para saque.");


    }
}