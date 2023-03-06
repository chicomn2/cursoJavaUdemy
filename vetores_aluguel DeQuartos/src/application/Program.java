package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Guests;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Guests[] vect = new Guests[10];

		System.out.print("How many rooms will be rented? ");
		int rentNum = sc.nextInt();
		for (int i = 0; i < rentNum; i++) {
			System.out.println("Rent #" + (i + 1) + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String mail = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Guests(name, mail);
		}
		System.out.println("Busy Rooms: ");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		sc.close();
	}

}
