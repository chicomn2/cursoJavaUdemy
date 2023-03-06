import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 3 números inteiros");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = maior(a, b, c);
		mostraResultado(d);
		sc.close();
	}

	public static int maior(int x, int y, int z) {
		int higher;
		if (x > y && x > z) {
			higher = x;
		} else if (y > z) {
			higher = y;
		} else {
			higher = z;
		}
		return higher;
	}

	public static void mostraResultado(int value) {
		System.out.println("O maior número é " + value);
	}
}
