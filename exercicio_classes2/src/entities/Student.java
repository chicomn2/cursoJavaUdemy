package entities;

public class Student {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;

	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}

	public String showResult() {
		if (finalGrade() > 60) {
			return "FINAL GRADE = " + String.format("%.2f", finalGrade()) + "\nPASS";
		} else {
			return "FINAL GRADE = " + String.format("%.2f", finalGrade()) + "\nFAILLED\nMISSING " +String.format("%.2f",(60 - finalGrade()))
					+ " POINTS";
		}

	}

}
