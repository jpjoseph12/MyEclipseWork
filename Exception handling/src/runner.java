import java.util.InputMismatchException;
import java.util.Scanner;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		takeInput();
	}

	private static int takeInput() {
		Scanner sc = new Scanner(System.in);
		int input = -1;
		try {
			input = sc.nextInt();
		} catch (InputMismatchException ime) {
			System.out.println(ime.toString());
		}
		return input;
	}

}
