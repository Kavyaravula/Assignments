package MyAssignments;

public class AmstrongNumber {

	public static void main(String[] args) {
		int number= 154;
		int temp = number;
		int reminder, sum=0;
		
		while (number>0){
			
			reminder= number%10;
			sum= sum+ (reminder*reminder*reminder);
			number= number/10;
			
		}
	if( temp==sum){
		System.out.println("Given number is Amstrong number");
	}
	else{
		System.out.println("Given number is NOT an  Amstrong number");
		
	}
	}

}
