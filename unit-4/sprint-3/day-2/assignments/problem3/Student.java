package Problem4;

public class Student extends Person {
	int studentId;
	String courseEntrolled;
	int courseFee;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
//		String output="studentId="+studentId+ "coursefee="+courseFee+"courseEntrolled="+courseEntrolled +"address"+str;
		System.out.println("studentId="+studentId  +" "+  "coursefee="+courseFee  +" "+"courseEntrolled="+courseEntrolled);
//		super.toString();
//		System.out.println(output);
		return super.toString();
	}

}
