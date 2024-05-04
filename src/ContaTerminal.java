import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite a agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome!");

        //consumir quebra de linha
        scanner.nextLine();
        //nextLine para receber o nome com espaço
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, " +
                "obrigado por criar uma conta em nosso banco, " +
                "sua agência é %s, " +
                "conta %d e seu saldo %.2f já está disponível para saque\n",
                nomeCliente, agencia, numero, saldo
        );
    }
}
