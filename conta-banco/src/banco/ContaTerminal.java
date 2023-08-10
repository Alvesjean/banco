package banco;

import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite o número da sua conta: ");
		int conta = entrada.nextInt();
		
		System.out.println("digite o número da sua agência: ");
		String agencia = entrada.next();
		
		System.out.println("digite seu nome: ");
		String nome = entrada.next();
		
		System.out.println("digite seu saldo: ");
		double saldo = entrada.nextDouble();
		
		System.out.println("Olá " + nome + ", obrigado por criar sua conta em nosso banco, sua agência é: " + agencia + " conta: " + conta + " e seu saldo de: " + saldo + " já está disponível para saque.");
		
		
		entrada.close();
	}

}
