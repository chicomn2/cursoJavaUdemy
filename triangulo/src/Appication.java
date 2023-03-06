import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Appication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("digite os 3 lados do tri�ngulo X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("digite os 3 lados do tri�ngulo Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();

		
		double areaY = y.area();
				
		System.out.printf("A �rea do triangulo X � %.02fmm %n", areaX);
		System.out.printf("A �rea do triangulo Y � %.02fmm %n", areaY);

		if (areaX > areaY) {
			System.out.println("A �rea do tri�ngulo X � a maior");
		} else {
			System.out.println("A �rea do tri�ngulo Y � a maior");
		}

		sc.close();
	}

}
