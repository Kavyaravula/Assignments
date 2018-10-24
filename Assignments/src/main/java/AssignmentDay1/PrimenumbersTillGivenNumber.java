package AssignmentDay1;

public class PrimenumbersTillGivenNumber {
	
	public static void main(String[]args){
		int num=7;
		int reminder ;
		
		for (int i=2;i<=num;i++){
			 		reminder= num%i;
			 		if (reminder==0){
			 			
			 			if (num!=i ){
			 				System.out.println("NOT Prime number");
			 				break;
			 			}
			 			
			 			else if(num==i){
			 				System.out.println("Prime Number");
			 			}
			 		}
			
		}
		
	}

}
