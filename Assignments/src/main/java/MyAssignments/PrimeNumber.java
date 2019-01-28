package MyAssignments;

public class PrimeNumber {

	public static void main(String[] args) {
		int number = 100;
		int reminder;
		System.out.println("Prime Numbers uptp "+ number + " are below: ");
		for (int i = 2; i <= number; i++) {
			for (int j = 2; j <= i; j++) {
				reminder = i % j;
				if (reminder == 0) {
					if (i == j) {
						System.out.print(i + " ");

					} else if (i != j) {
						// System.out.println("Not Prime Number");
						break;
					}

				}
			}

		}

	}

}
