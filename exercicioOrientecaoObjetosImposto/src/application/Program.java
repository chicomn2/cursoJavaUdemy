package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas terão o imposto declarado: ");
		List<Pessoa> pessoas = new ArrayList<>();
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Declaração #" + i + ":");
			System.out.print("Pessoa Fisica ou Juridica (f/j): ");
			char c = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda Anual: ");
			Double rendaAnual = sc.nextDouble();
			if (c == 'f') {
				System.out.print("Gastos com saúde: ");
				Double gastosSaude = sc.nextDouble();
				pessoas.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			} else {
				System.out.print("Numero de funcionarios: ");
				int numeroFunc = sc.nextInt();
				pessoas.add(new PessoaJuridica(nome, rendaAnual, numeroFunc));
			}

		}
		System.out.println();
		System.out.println("Impostos pagos:");
		Double impostoTotal = 0.0;
		for (Pessoa p : pessoas) {
			System.out.println(p.getNome() + ": R$ " + String.format("%.2f",p.impostoDevido()));
			impostoTotal += p.impostoDevido();
		}

		System.out.println("Total pago: R$ " + String.format("%.2f",impostoTotal));

		sc.close();
	}
}
