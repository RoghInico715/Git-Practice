package practiceProjects;

public interface interfacesAndDefaultMethods {

public void day();
	
	public default void month() {
		System.out.println("It is July");
	}
}
