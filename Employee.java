
public class Employee {
	public int baseSalary;
//	private int baseSalary;
//	public int hourlyRates;
	private int hourlyRate;
//	public int extraHours;

	public static int numberOfEmployees;

	public Employee(int baseSalary) {
		this(baseSalary, 0);
	}

	public Employee(int baseSalary, int hourlyRate) {
		setBaseSalary(baseSalary);
		setHourlyRate(hourlyRate);
		numberOfEmployees++;
	}

	public static void printNumberOfEmployees() {
		System.out.println(numberOfEmployees);
	}

	public int calculateWage(int extraHours) {
		return baseSalary + (hourlyRate * extraHours);
	}

	public int calculateWage() {
		return calculateWage(0);
	}

	private void setBaseSalary(int baseSalary) {
		if (baseSalary <= 0)
			throw new IllegalArgumentException("Salary cannot be 0 or less");
		this.baseSalary = baseSalary;
	}

	private int getBaseSalary() {
		return baseSalary;
	}

	private void setHourlyRate(int hourlyRate) {
		if (hourlyRate < 0)
			throw new IllegalArgumentException("Hourly rate cannot be a negative number");
		this.hourlyRate = hourlyRate;
	}

	private int getHourlyRate() {
		return hourlyRate;
	}
}

// public class Student {
//     // Instance variables (attributes)
//     private String name;
//     final private int age;
//     private double gpa;

//     // Static variable (class-level)
//     private static int totalStudents = 0;

//     // Constructor will go here
//     // Methods will go here
// }
