package application;

import java.io.File;
import java.util.Scanner;

public class Main {
	// listagem de pastas e/ou arquivos
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o caminho da pasta: ");
		String stringCaminho = sc.nextLine();
		System.out.println();
		File caminho = new File(stringCaminho);

		File[] pastas = caminho.listFiles(File::isDirectory);
		System.out.println("Pastas: ");
		for (File p : pastas) {
			System.out.println(p);
		}
		System.out.println();

		File[] arquivos = caminho.listFiles(File::isFile);
		System.out.println("Arquivos: ");
		for (File a : arquivos) {
			System.out.println(a);
		}

		new File(stringCaminho + "\\pasta teste").mkdir();
		System.out.println("Pasta crada com sucesso: ");
		System.out.println();

		pastas = caminho.listFiles(File::isDirectory);
		System.out.println("Pastas: ");
		for (File p : pastas) {
			System.out.println(p);
		}
		System.out.println();

		sc.close();

	}

}
