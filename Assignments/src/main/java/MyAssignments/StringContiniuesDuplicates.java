package MyAssignments;

public class StringContiniuesDuplicates {

	public static void main(String[] args) {
		String str= "kaaavyaRedddyyy";
		char c;
		
		for(int i=0; i< str.length()-1; i++){
			
			for(int j=i+1; j<=i+2; j++){
				c= str.charAt(i); //k
				if (c==str.charAt(j)){
					if (str.charAt(j)==str.charAt(j+1)){
					System.out.println("three Continuoes duplicates are found  "+ c);
				}
				}
			}
			
		}

	}

}
