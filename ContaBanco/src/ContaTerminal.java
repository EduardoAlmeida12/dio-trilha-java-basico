import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Bem vindo ao Banco Santander ");
        System.out.println("Por favor, Digite o número da Agência");
        int numeroAgenciaDigitado = teclado.nextInt();

        teclado.nextLine();

        System.out.println("Por favor digite a Agencia:");
        String agenciaDigitada=teclado.nextLine();
        System.out.println("Digite o nome do Cliente");
        String clienteDigitado=teclado.nextLine();
        System.out.println("Informe o saldo: ");
        double saldoDigitado=teclado.nextDouble();
        System.out.println("Olá "+clienteDigitado+", obrigado por criar uma conta em nosso banco, sua agência é " +agenciaDigitada+", conta "+numeroAgenciaDigitado+" e o seu saldo "+saldoDigitado+" já está disponível para saque!");
    }

}
