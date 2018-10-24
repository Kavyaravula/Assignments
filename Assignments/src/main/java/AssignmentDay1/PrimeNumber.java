package AssignmentDay1;

public class PrimeNumber {
	public static void main(String[] args){
		
		int num=7;
		int reminder;
		
		for (int i=1; i<=num; i++){
			
			reminder= num%i;
			if (reminder==0){
			
				if (i!= num ){
					System.out.println("Given number is not prime number");
					break;
				}
				
				else if(i==num){
					System.out.println("Given number is a prime number");
				}
				}
			
			}
		
		
			
		}
		
}
	


