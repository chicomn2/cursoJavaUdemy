
public class Main {

	public static void main(String[] args) {
		double b, B, h, area;
		b = 6;
		B = 8;
		h = 5;
		
		area = ((b+B)/ 2)*h;
		System.out.println("A medida de b �:"+b);
		System.out.println("A medida de B �:"+B);
		System.out.println("A altura h �:"+h);
		System.out.printf("Calculando a �rea com a f�rmula((%.2f+%.2f)/2)*%.2f teremos:%n", b, B, h);
		System.out.println(area);
	}

}
