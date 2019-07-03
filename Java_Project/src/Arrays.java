
public class Arrays {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		
		System.out.println(a [4] );
		
		int [][] x = {
				{1 , 2 , 3 , 4},
				{18 , 45},
				{14 , 24 , 34 , 44},
				
		};
		
		System.out.println(x[0][0]);
		System.out.println(x[0][2]);
		
		//Using For Loops with Array
		
		for (int col = 0; col < x.length; col++) {
			
			for (int row = 0; row < x[col].length; row++) {
				
				System.out.print(x[col][row] + " ");
				
			}
			
			System.out.println();
			
		}

	}
		

}


