package MyAssignments;

public class PrintingSequence {

	public static void main(String[] args) {
		char c = 'A';
		int counter;

		for (int i = 1; i <= 5; i++) {
			counter = 1;

			while (i >= counter) {
				System.out.print(c);
				counter++;
			}
			System.out.println();
		}
	}
}
