
public class Calculator {
	

	public void Add(int a, int b) {
   
		int c = a + b;
		
		System.out.println("a + b is " + c);

	}
	
	public void Sub(int x , int y) {
		
		int z = x-y;
		
		System.out.println("x - y is " + z);
	}
	
	public void Mul(int c, int d) {
		
		int f = c * d;
		
		System.out.println("c * d is " + f);
	}
	
	public void Div(int h, int j) {
		
		int i = h / j;
		
		System.out.println("h / j is " + i);
	}
	
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		cal.Add(1, 2);
		cal.Sub(4, 9);
		cal.Mul(3, 4);
		cal.Div(40, 2);
		
	}

}
