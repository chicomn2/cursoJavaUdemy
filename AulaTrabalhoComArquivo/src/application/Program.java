package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite o caminho do arquivo de entrada COM NOME: ");
		String arquivo = sc.nextLine();
		try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
			String linha = br.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}

}
