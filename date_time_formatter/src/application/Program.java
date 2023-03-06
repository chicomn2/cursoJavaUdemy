package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter dtm3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());// Padrão para ajuste de data conforme fuso horário do sistema.
		
		
		LocalDate d01 = LocalDate.now();
		System.out.println("Local date: "+d01);
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("Local date time: "+d02);
		Instant d03 = Instant.now();
		System.out.println("Instant in the Zulu Time: "+d03);
		LocalDate d04 = LocalDate.parse("1923-03-04");
		System.out.println("Local date parse: "+d04);
		LocalDate d05 = LocalDate.parse("04/03/2023", dtm1);
		System.out.println("Local date time parse: "+d05);
		LocalDateTime d06 = LocalDateTime.parse("04/03/2023 16:24", dtm2);
		System.out.println("Local date time parse: "+d06);
		LocalDateTime d07 = LocalDateTime.of(2023, 03, 04, 16, 35);
		System.out.println("Local date Time of: "+d07);
		System.out.println("Data customizada: "+d06.format(dtm2));
		System.out.println("Data e hora ATUAL customizada e com fuso horário corrigido: "+dtm3.format(d03));
		
		Instant d08 = Instant.parse("2023-03-06T00:15:00Z");
		LocalDateTime r1 = LocalDateTime.ofInstant(d08, ZoneId.systemDefault());
		LocalDateTime r2 = LocalDateTime.ofInstant(d08, ZoneId.of("Japan"));
		System.out.println("-------------");
		System.out.println("Fuso horário original: "+d08);
		System.out.println("Conversão de fuso horários:");
		System.out.println("Convertido para o horário do sistema em padrão brasileiro: "+dtm3.format(r1));
		System.out.println("Convertido para o horário do Japão em padrão brasileiro: "+dtm3.format(r2));
		System.out.println("Obtendo informações da data: ");
		System.out.println("Dia da data específica: "+r1.getDayOfMonth());
		System.out.println("Mês da data específica: "+r1.getMonth());
		System.out.println("Ano da data específica: "+r1.getYear());
		System.out.println("Hora da data específica: "+r1.getHour());
		System.out.println("Cálculos com datas: ");
		LocalDateTime somaDias = r1.plusDays(15);
		LocalDateTime subtraiDia = r1.minusDays(2);
		LocalDateTime subtraiHora = r1.minusHours(11);
		System.out.println("Soma de dias em Java com padrão brasileiro: "+dtm3.format(somaDias));
		System.out.println("Subtração de dias em Java com padrão brasileiro: "+dtm3.format(subtraiDia));
		System.out.println("Subtração de hora em Java com padrão brasileiro: "+dtm3.format(subtraiHora));
		System.out.println("Durações: ");
		Duration d1 = Duration.between(r1, somaDias);
		Duration d2 = Duration.between(subtraiDia, r1);
		Duration d3 = Duration.between(subtraiHora, r1);
		System.out.println("Cálculo de duração de dias: "+d1.toDays());
		System.out.println("Cálculo de duração de dias: "+d2.toDays());
		System.out.println("Cálculo de duração de horas: "+d3.toHours());
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		}

}
