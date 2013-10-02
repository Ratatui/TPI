import java.util.Scanner;

/**
 * @author Stas Frolov
 * Lab 1, part 2
 */
public class LongSequence {
	public static void main(String[] args) {

		// get number
		System.out.print("Enter number: ");
		Scanner scanner = new Scanner(System.in);
		long number = scanner.nextInt();
		scanner.close();

		// find must long sequence
		int maxLength = 1;
		int currentLength = 1;
		long lastNumber = -1;
		while (number != 0) {
			long tempNumber = number % 10;
			number = number / 10;
			if (tempNumber != lastNumber){
				currentLength = 1;
				lastNumber = tempNumber;
			} else {
				currentLength++;
				if (currentLength > maxLength)
					maxLength = currentLength;
			}
		}

		System.out.println("Max length = " + maxLength);
	}
}
