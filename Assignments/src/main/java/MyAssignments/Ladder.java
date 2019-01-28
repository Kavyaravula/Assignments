package MyAssignments;

public class Ladder {

	public static void main(String[] args) {
		int number = 22;
		int sum = 0;

		for (int i = 0; i <= number; i++) {
			sum = sum + i;
			if (sum > number) {
				System.out.println("Ladder is not possible: -1");
				break;
			}
			if (sum == number) {
				for (int j = 1; j <= number; j++) {
					for (int k = 1; k <= j; k++) {
						System.out.print(number);
						number--;
					}
					System.out.println();
				}
			}
		}

	}

}
