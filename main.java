import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		var employee = new Employee(50_000);
		// var employee = new Employee(50_000, 20);
		// employee.baseSalary = 50_000;
		// employee.setBaseSalary(50_000);
		// employee.hourlyRates = 20;
		// employee.setHourlyRates(20);

		System.out.println(employee.numberOfEmployees);
		// employee.printNumberOfEmployees();

		// int wage = employee.calculateWage();
		// System.out.println(wage);

		// var mortgage = new Mortgage();
	}
}
