import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("digite a agencia da sua conta: ");
        String agencia=scanner.nextLine();

        System.out.println("digite seu nome: ");
        String nomeCliente=scanner.nextLine();

        System.out.println("digite o numero da sua conta: ");
        int numero=scanner.nextInt();

        System.out.println("digite o saldo da sua conta: ");
        double saldo=scanner.nextDouble();

        System.out.println("Olá "+ nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+",conta "+numero+" e seu saldo "+ saldo+" já está disponível para saque.");
    }
}
