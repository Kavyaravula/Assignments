package AssignmentDay2;

public class FindDuplicateNumberArray {
public static void main(String[] args){
		
		int[] ar1= {400,10,40,90,30,20};
		int len = ar1.length;
		int num;
		boolean b= false;
		
		
		for (int i=0; i<len;i++){
				num=ar1[i]; 
				for (int j=i+1; j<len; j++){
					if (num==ar1[j]){
						num=ar1[j];
						b= true;
						System.out.println("Dulipate number found  "+ num);
						break;
					}
					
				}
					

				
			}
		
	
		if (!b){
			System.out.println("No Dupilcate present");
			
		}
		
}


}
