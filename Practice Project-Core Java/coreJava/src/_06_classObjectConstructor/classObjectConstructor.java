package _06_classObjectConstructor;

public class classObjectConstructor {
	
	private String name;
	private int rollNumber;
	
	//Constructor
	public classObjectConstructor(String nameOfStudent, int rollNoOfStudent) {
		name = nameOfStudent;
		rollNumber = rollNoOfStudent;
		System.out.println("Constructor has Executed");
	}
	
	public void display() {
		System.out.println("Name of Student : " + name);
		System.out.println("Roll Number of Student : " + rollNumber);
	}

	public static void main(String[] args) {
		//Creating Objects
		classObjectConstructor student1 = new classObjectConstructor("Sam", 101);
		classObjectConstructor student2 = new classObjectConstructor("John", 102);
		
		student1.display();
		student2.display();

	}

}
