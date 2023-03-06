package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas: ");
		int n = sc.nextInt();
		Character[] gen = new Character[n];
		Double[] altura = new Double[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Altura da pessoa número " + (i + 1) + ":");
			altura[i] = sc.nextDouble();
			System.out.print("Gênero da pessoa número " + (i + 1) + ":");
			gen[i] = sc.next().charAt(0);
		}
		Double menor = altura[0];
		Double maior = altura[0];
		Double media=0.0;
		int homens=0;
		int mulheres=0;
		
		for(int i =0;i<n;i++) {
			if(altura[i]<menor) {
				menor = altura[i];
			}
			if(altura[i]>maior) {
				maior = altura[i];
			}
			if(gen[i]=='F'){
				media+=altura[i];
				mulheres++;
				} else {
					homens++;
				}
		}
		media = media/mulheres;		
		System.out.println("Menor altura = "+menor);
		System.out.println("Maior altura = "+maior);
		System.out.println("Media das alturas das alturas das mulheres = "+String.format("%.2f",media));
		System.out.println("Quantidade de homens = "+homens);
		
		

		sc.close();
	}

}
