package MyAssignments;

public class PalandromeNumber {

	public static void main(String[] args) {
		
		int number = 12321;
		int num= number;
		int reminder, revNumber =0;
		while (number>0){
			
			reminder= number%10;
			revNumber= revNumber*10 + reminder;
			number=number/10;
			
		}
	System.out.println(revNumber);
	System.out.println(num);
	
	if (num == revNumber){
		System.out.println("Given Number is Palindrome Number "+ num);
	}
	else{
		System.out.println("Given Number is NOT a Palindrome Number");
		
	}
	}

}
