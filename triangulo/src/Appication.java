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

		System.out.println("digite os 3 lados do triângulo X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("digite os 3 lados do triângulo Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();

		
		double areaY = y.area();
				
		System.out.printf("A área do triangulo X é %.02fmm %n", areaX);
		System.out.printf("A área do triangulo Y é %.02fmm %n", areaY);

		if (areaX > areaY) {
			System.out.println("A área do triângulo X é a maior");
		} else {
			System.out.println("A área do triângulo Y é a maior");
		}

		sc.close();
	}

}
