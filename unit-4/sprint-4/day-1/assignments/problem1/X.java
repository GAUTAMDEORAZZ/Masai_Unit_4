package problem1;

public interface X {
	public abstract void A();
	default void B() {
		System.out.println("I am default method-B inside interface X");
	}
	public static void C() {
		System.out.println("I am static method in interfase X");
	}

}
