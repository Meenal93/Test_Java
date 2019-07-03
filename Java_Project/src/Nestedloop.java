
public class Nestedloop {
	
	/*
	 * For loop --> 3 times
	 * While loop --> 5 times
	 * do while loop --> 6 times
	 * 
	 */

	public static void main(String[] args) {
		
		int i = 0;
		  while (i<5) {
			
			  for (int j = 0; j < 3; j++) {
				
				int k=0;
				   do {
					
					System.out.println("i -->" + i + "j --> " + j + " k --> " + k);
					k++;
					
			     	} while (k<6);
			        	
			}
			  i++;
			
		}
		 
	}
}
