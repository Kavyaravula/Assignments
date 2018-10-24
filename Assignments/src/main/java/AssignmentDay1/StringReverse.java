package AssignmentDay1;

public class StringReverse {
	public static void main(String[] args){
		
		String str= "madam";
		String strRev = "";
	char a;
	
		
		for(int i=(str.length()-1); i>=0; i--){
				
		a= str.charAt(i) ;
		strRev=strRev+a;
		}
		System.out.println(strRev);
		
		if (str.contentEquals(strRev)){
			System.out.println("Strings are equal");
		}
		else{
			System.out.println("Strings NOT are equal");
		}
	
	}

}
