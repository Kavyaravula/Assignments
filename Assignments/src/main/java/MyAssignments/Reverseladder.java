package MyAssignments;

public class Reverseladder {

	public static void main(String[] args) {
		int number=10;
		
		for (int i=1; i<=number; i++){
			for (int j=1;j<=i;j++){
				System.out.print(number);
				number--;
			}
			System.out.println();
		}
	}

}
