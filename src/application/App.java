package application;

public class App {

	public static void main(String[] args) {
		double fahrenheit = 91;
		
		double celsius = (fahrenheit - 32) * 5.0 / 9.0;
		
		//System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees celsius.");
		System.out.printf("%.2f degrees Fahrenheit is %.2f degrees celsius.\n", fahrenheit, celsius);
		
		System.out.print("Hello");
		
		//println adds in a new line automatically
		System.out.println("Hello");
		System.out.printf("Hello\n");
		System.out.printf("Hello\n");
		
		double value = 1.237548;
		System.out.printf("Hello %f\n", value);
		System.out.printf("Hello\n");
		// "Hello %f\n" and value are arguments passed to the printf method
		
		double value1 = 1.237548;
		System.out.printf("Hello %.2f\n", value1);
		System.out.printf("Hello %d\n", 123);	
		//%f.2 means to use 2 decimal places
		//%d is used for integers
		//123 is the argument passed to the %d
		
		System.out.printf("%s %d", "Test string", 12345);

	}

}
