package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Student name: ");
		Student student = new Student();
		student.name = sc.nextLine();
		System.out.print("Grade 1: ");
		student.grade1 = sc.nextDouble();
		System.out.print("Grade 2: ");
		student.grade2 = sc.nextDouble();
		System.out.print("Grade 3: ");
		student.grade3 = sc.nextDouble();
		System.out.println(student.showResult());		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		

	}

}
