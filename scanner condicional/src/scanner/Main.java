package scanner;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x, y;
		x = sc.nextDouble();
		y = sc.nextDouble();
		if (x > 0 && y > 0) {
			System.out.println("O ponto " + x + " " + y + " encontra-se no quadrante Q1");
		} else if (x < 0 && y > 0) {
			System.out.println("O ponto " + x + " " + y + " encontra-se no quadrante Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("O ponto " + x + " " + y + " encontra-se no quadrante Q3");
		} else if (x > 0 && y < 0) {
			System.out.println("O ponto " + x + " " + y + " encontra-se no quadrante Q4");
		} else if (x == 0 && y != 0) {
			System.out.println("O ponto " + x + " " + y + " encontra-se no eixo X");
		} else if (x != 0 && y == 0) {
			System.out.println("O ponto " + x + " " + y + " encontra-se no eixo Y");
		} else {
			System.out.println("O ponto " + x + " " + y + " está na Origem");
		}
		sc.close();

	}

}
