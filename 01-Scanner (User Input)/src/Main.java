import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("What is your name? \n");
		String name = scanner.nextLine();

		System.out.println("How old are you?\n");
		int age = scanner.nextInt();
		scanner.nextLine();

		System.out.println("What is your favorite food?\n");
		String food = scanner.nextLine();

		System.out.println("Hello " + name);
		System.out.println("You are " + age + " years old.");
		System.out.println("You like " + food);
	}

}
