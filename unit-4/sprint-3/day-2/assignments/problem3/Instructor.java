package Problem4;

public class Instructor extends Person{
	int instructorId;
	int salary;

	@Override
	public String toString() {
	
		System.out.println("InstructoriD=" +instructorId +" " +"Salary=" +salary +" ");
		return super.toString();
	}

}
