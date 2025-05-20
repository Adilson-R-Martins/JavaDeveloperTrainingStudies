import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        String nome;
        int agencia;
        int conta;
        double saldo;
        String entrada;

        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite seu Nome: ");
        nome = input.nextLine();

        System.out.println("Por favor, digite o número da sua Agência: ");
        while (true) {
            entrada = input.nextLine();
            try {
                agencia = Integer.parseInt(entrada);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Digite apenas números.\nInsira novamente o número da sua Agência:");
            }
        }

        System.out.println("Por favor, digite o número da sua Conta: ");
        while (true) {
            entrada = input.nextLine();
            try {
                conta = Integer.parseInt(entrada);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Digite apenas números.\nInsira novamente o número da sua Conta:");
            }
        }

        System.out.println("Por favor, digite o seu Saldo: ");
        while (true) {
            entrada = input.nextLine();
            try {
                saldo = Double.parseDouble(entrada);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Digite apenas números.\nInsira novamente o seu Saldo:");
            }
        }

        input.close();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$" + String.format("%.2f", saldo) + " já está disponível para saque.");


    }
}