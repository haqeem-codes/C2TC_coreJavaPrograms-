package day2_basics;
import java.util.*;
public class SExample {

	public static void main(String[] args) {
				try (Scanner sc = new Scanner(System.in)) {
					System.out.print("Enter your name: ");
					String name = sc.nextLine();

					System.out.print("Enter your age: ");
					int age = sc.nextInt();

					System.out.println("Hello, " + name + "! You are " + age + " years old.");
				}

	}

		


}


