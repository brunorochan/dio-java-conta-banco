import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner answer = new Scanner(System.in);
        Scanner answer2 = new Scanner(System.in);

        System.out.println("Olá cliente. Bem-vindo ao banco digital DEVBANK!");
        System.out.println("Por favor, digite o número da agência:");
        String agency = answer.nextLine();

        System.out.println("Por favor, digite o número da conta bancária, incluindo o dígito verificador:");
        int accountNumber = answer.nextInt();

        System.out.println("Por favor, digite seu nome completo:");
        String customerName = answer2.nextLine();

        System.out.println("Informe o saldo inicial da conta: ");
        float customerBalance = answer.nextFloat();

        System.out.println("Olá " + customerName + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + accountNumber +  " e seu saldo R$" + customerBalance + " já está disponível para saque.");

        answer.close();
        answer2.close();

    }
}
