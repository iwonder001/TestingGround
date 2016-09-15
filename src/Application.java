import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String letterGrade;
		String cont;
		do {

			Scanner input = new Scanner(System.in);

			System.out.println("Please put in a letter grade: ");
			letterGrade = input.nextLine();

			if (letterGrade.equalsIgnoreCase("A")) {
				System.out.println("Very good!");
			} else if (letterGrade.equalsIgnoreCase("B")) {
				System.out.println("Very good");
			} else if (letterGrade.equalsIgnoreCase("C")) {
				System.out.println("good");
			} else if (letterGrade.equalsIgnoreCase("D")) {
				System.out.println("good");
			} else {
				System.out.println("fail!!!!!!!");
			}

			System.out.println("Continue y/n: ");
			cont = input.nextLine();
		} while (cont.equals("y"));
	}
}
