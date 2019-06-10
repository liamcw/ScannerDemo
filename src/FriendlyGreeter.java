import java.util.Scanner;

public class FriendlyGreeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner1 = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name;
		name = scanner1.next();

		System.out.print("Enter your age (years): ");
		int age;
		age = scanner1.nextInt(); // returns an int

		System.out.print("Enter your height (m): ");
		double height;
		height = scanner1.nextDouble();// returns a double

		System.out.print("Enter your weight (Kg): ");
		double weight = scanner1.nextDouble();

		double bmi = weight / (height * height);

		scanner1.close();// NEEDS TO BE CLOSED

		System.out.println("Hello " + name + "!");
		System.out.print("You are " + age + " and your body mass index is " + bmi + ".");

	}

}
