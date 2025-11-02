import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World");
//		byte herAge = 30;
////		int viewsCount = 123_456_789;
//		long viewsCount = 3_123_456_789L;
////		double price = 10.99;
//		float price = 10.99F;
//		char letter = 'A';
//		boolean isEligible = false;
//
//		byte x = 1;
//		byte y = x;
//		x = 2;
//		System.out.println(y);


//		Primitive type

//		classes and objects
//	    var textBox1 = new TextBox();
//	    textBox1.setText("Box 1");
//	    System.out.println(textBox1.text.toUpperCase());
//
//	    var textBox2 = new TextBox();
//	    textBox1.setText("Box 2");
//	    System.out.println(textBox1.text);

//		var employee = new Employee(50_000);
//		var employee = new Employee(50_000, 20);
//		employee.baseSalary = 50_000;
//		employee.setBaseSalary(50_000);
//		employee.hourlyRates = 20;
//		employee.setHourlyRates(20);

//		System.out.println(employee.numberOfEmployees);
//		employee.printNumberOfEmployees();
//
//		int wage = employee.calculateWage();
//		System.out.println(wage);

//		var mortgage = new Mortgage();

//		int [] studentScore = new int[100];
////		for (int i = 0; i < 100; i++) {
////			studentScore [i] = 0;
////		}
//		System.out.println("studentScore is " + Arrays.toString(studentScore));

////		String message = "   Hello World" + "!!    ";
//		String message = "Hello \"World\"";
//
////		System.out.println(message.trim());
//		System.out.println(message);

//		Arrays ( can be defined as a list of items)
//		int[] numbers = new int[5];
//		numbers[0] = 1;
//		numbers[1] = 2;
//
//		int[] numbers = { 1, 2, 5, 3, 4};
//		Arrays.sort(numbers);
//		System.out.println(Arrays.toString(numbers));
//		final float PI = 3.14F;

//		Multi-Dimensional arrays
//		int[][] numbers = new int [100][1];
////		int[][] numbers = { {1, 2, 3}, {4, 5, 6} };
//		System.out.println(Arrays.deepToString(numbers));

//		double result = (double) 10 / (double) 3;
//		System.out.println(result);

//		Implicit Casting
//		byte > short > int > long > float > double
//		String x = "1";
//		int y =  Integer.parseInt(x) + 2;

//		int rand = (int) (Math.random() * 100);
//		System.out.println(rand);

//		Scanner scanner =  new Scanner(System.in);
//		System.out.println("What is your name: ");
//		String name = scanner.nextLine().trim();
//		String name = scanner.next().trim();
//		System.out.println("What is your age: ");
//		byte age = scanner.nextByte();
//		System.out.println("Your name is: " + name + " and you are " +age+ "years old.");

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Number: ");
//		int number = scanner.nextInt();
//
//		if (number % 5 == 0 && number % 3 ==0) {
//			System.out.println("FizzBuzz");
//		} else if (number % 3 == 0) {
//			System.out.println("Buzz");
//		} else if (number % 5 == 0) {
//			System.out.println("Fizz");
//		} else {
//			System.out.println(number);
//		}

//		for(int i = 0; i < 5; i++) {
//		for(int i = 5; i > 0; i--) {
//
//			System.out.println("Hello World " + i);
//		}
//		Scanner scanner = new Scanner(System.in);
//		String input = "";
//		while(!input.equals("quit")) {
//			System.out.println("Input: ");
//			input = scanner.next().toLowerCase();
//			System.out.println(input);
//		}

//		String[] fruits = { "apple", "orange", "mango" };
//		for (int i = 0; i < fruits.length; i++) {
//			System.out.println(fruits[i]);
//		}
//
////		For Each Loop
//		for (String fruit: fruits) {
//			System.out.println(fruit);
//		}

//		var control = new UIControl();
//		control.disable();
//		System.out.println(control.isEnabled());

//		var textBox = new TextBox();
//		textBox.setText("Hello World");
////		System.out.println(textBox.toString());
//		System.out.println(textBox);

//		UIControl[] controls = { new TextBox(), new CheckBox() };
//		for (var control: controls)
//			control.render();
//		var calculator = new TaxCalculator2018(100_000);
////		var report = new TaxReport(calculator);
//		var report = new TaxReport();
//		report.show(calculator);
//
////		report.setCalculator(new TaxCalculator2019());
//		report.show(new TaxCalculator2019());
		var book =  new Book("The good book", "Okeke Francis");
//		System.out.println(book);
		book.setPrice(20.00);
		System.out.println(book);
		double discountedPrice = book.discountPrice(10);
//		System.out.println(discountedPrice);
	}
}
