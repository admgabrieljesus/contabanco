import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("digite o número da conta: ");
        int numero = scanner.nextInt();
        
        System.out.print("digite o número da agência: ");
        String agencia = scanner.next();
        
        System.out.print("digite o nome do cliente: ");
        String nome_cliente = scanner.next();

        System.out.print("digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        scanner.close();
      

        System.out.println("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +  " já está disponível para saque.");

        
    }
}