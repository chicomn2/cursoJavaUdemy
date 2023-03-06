package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Diga o tamanho da amostragem: ");
		int n = sc.nextInt();
		Double[] vect = new Double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Diga o tamanho da altura do elemento: ");
			vect[i] = sc.nextDouble();
		}
		double sum = 0.0;
		for(int i = 0;i<n;i++) {
			sum+=vect[i];
		}
		sum=sum/n;
		
		System.out.println(String.format("%.2f",sum));

		sc.close();
	}

}
