package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite o caminho do arquivo de entrada COM NOME: ");
		String entrada = sc.nextLine();
		File documentoEntrada = new File(entrada);
		List<Product> produtos = new ArrayList<>();
		System.out.print("Digite endereço do arquivo de saída: ");
		String saida = sc.nextLine();
		String summary = saida+"\\summary.csv";
		try(BufferedReader br = new BufferedReader(new FileReader(documentoEntrada))){
			String linha = br.readLine();
			
			while(linha!=null) {
				String[] linhaPartida = linha.split(",");
				String nome = linhaPartida[0];
				Double preco = Double.parseDouble(linhaPartida[1]);
				Integer quantidade = Integer.parseInt(linhaPartida[2]);
				Product produto = new Product (nome, preco, quantidade);
				produtos.add(produto);
				linha = br.readLine();
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(summary, true))) {
				for(Product p: produtos) {
					bw.write(p.toString());
					bw.newLine();
					
				}
			}
		} catch(IOException e){
			e.getStackTrace();
			
		}

	}

}
