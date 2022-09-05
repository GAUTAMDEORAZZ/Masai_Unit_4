package problem1;

public interface Y {
	public abstract void P();
	default void Q() {
		System.out.println(" I am default method-Q inside interface Y");
	}
	public static void R() {
		System.out.println("I am inside ststic method in interface Y");
	}

}
