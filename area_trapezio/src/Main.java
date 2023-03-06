
public class Main {

	public static void main(String[] args) {
		double b, B, h, area;
		b = 6;
		B = 8;
		h = 5;
		
		area = ((b+B)/ 2)*h;
		System.out.println("A medida de b é:"+b);
		System.out.println("A medida de B é:"+B);
		System.out.println("A altura h é:"+h);
		System.out.printf("Calculando a área com a fórmula((%.2f+%.2f)/2)*%.2f teremos:%n", b, B, h);
		System.out.println(area);
	}

}
