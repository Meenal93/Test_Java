class Person {

	String name;
	int age;

	void speak() {

		System.out.println("Hi , " + "my name is " + name + " and " + " i am " + age + " years old.");
	}
	public Person() {

		System.out.println("calling the constructor!!!!");
	}
}

public class ObjectAndClasses {
	public static void main(String[] args) {

		Person Person1 = new Person();
		Person Person2 = new Person();

		new Person(); // example of calling a constructor just by creating a new object

		Person1.name = "John";
		Person1.age = 25;

		Person2.name = "Ray";
		Person2.age = 27;

		if (Person1.age >= 26) {

			System.out.println("Eligible Candidate is : " + Person1.name);
			Person1.speak();
		}

		else if (Person2.age >= 26) {

			Person2.speak();

			System.out.println("Eligible Candidate is : " + Person2.name);
		}

		else {
			System.out.println("Tehere is no eligible candidate");
		}

	}

}
