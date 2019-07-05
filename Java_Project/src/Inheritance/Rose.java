package Inheritance;

public class Rose extends Plant {

	public static void main(String[] args) {
		Rose obj = new Rose();
		obj.Photosynthesis();
		
		System.out.println("Single Inheritance");
		
			
	}
	
	public void Photosynthesis() {
		
		System.out.println("it performs Photosynthesis");
	}
	
	
	public void RoseIs() {
		
		System.out.print("Rose is beautiful ");
	}
	
}
