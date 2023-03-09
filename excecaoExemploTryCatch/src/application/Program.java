package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre os dados da conta: ");
		System.out.print("Número: ");
		int numero = sc.nextInt();
		System.out.print("Nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Saldo: ");
		Double saldo = sc.nextDouble();
		System.out.print("Limite: ");
		Double limite = sc.nextDouble();
		Conta conta = new Conta(numero, nome, saldo, limite);

		System.out.println();
		System.out.print("Quantidade a ser sacada: ");

		try {
			conta.saque(sc.nextDouble());
			System.out.println("Saldo atualizado: R$" + String.format("%.2f", conta.getSaldo()));
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
