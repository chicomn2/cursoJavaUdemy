package application;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import calculations.LocacaoDia;
import calculations.LocacaoHora;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		System.out.println("Entre com os dados do aluguel do veículo: ");
		System.out.print("Carro foi alugado: ");
		String nome = sc.nextLine();
		//sc.nextLine();
		System.out.print("Data e hora da locação (dd/mm/yyyy hh:mm): ");
		LocalDateTime horaSaida = LocalDateTime.parse(sc.nextLine(), dtm2);
		//sc.nextLine();
		System.out.print("Data e hora da devolução (dd/mm/yyyy hh:mm): ");
		LocalDateTime horaDevolucao = LocalDateTime.parse(sc.nextLine(), dtm2);
		//sc.nextLine();	
		
		if(Duration.between(horaSaida, horaDevolucao).toHours()>12) {
			System.out.print("Preço por dia: ");
		Double precoDia = sc.nextDouble();
		
			LocacaoDia locacaoDia = new LocacaoDia(horaSaida, horaDevolucao, precoDia);
			System.out.println(locacaoDia.toString());
		} else {
			System.out.print("Preço por hora: ");
		Double precoHora = sc.nextDouble();
		System.out.println(Duration.between(horaSaida, horaDevolucao).toHours()*precoHora);
			LocacaoHora locacaoHora = new LocacaoHora(horaSaida, horaDevolucao, precoHora);
			System.out.println(locacaoHora.toString());
		}

		sc.close();
	}

}
