package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite o caminho do arquivo de saída COM NOME: ");
		String caminho = sc.nextLine();//caminho do arquivo
		
		String [] linhas = new String[] {"Bom dia", "Boa tarde", "Boa noite", "teste de criação de arquivos por aplicação JAVA"};//texto a ser incluído no arquivo
		
			
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))){//criação do buffered writer e do file wirter para edição do arquivo
			for(String s: linhas) {//for para manipulação do arquivo corretamenmte
				bw.write(s);
				bw.newLine();
			}
			bw.newLine();
		}  catch(IOException e) {// catch para gestão de erros
			e.printStackTrace();
		}

	}

}
