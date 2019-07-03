class Candidate {

	int age;
	String name;

	void speak() {
		System.out.println("My name is : " + name);
	}

	int retirementCalculation() {
		int yearsLeftToRetire = 65 - age;

		System.out.println("I will retire in " + yearsLeftToRetire + " years.");
		return yearsLeftToRetire;

	}
}

public class Getters {

	public static void main(String[] args) {

		Candidate candidate1 = new Candidate();
		candidate1.name = "John";
		candidate1.age = 26;

		candidate1.speak();
		candidate1.retirementCalculation();

	}

}
