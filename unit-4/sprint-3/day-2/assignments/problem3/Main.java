package Problem4;

public class Main {

	public static Person generatePerson(Person person) {
		person.toString();
		
		return new Person();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public static void main(String[] args) {
		Student student1=new Student();
		Instructor instructor1=new Instructor();
		Person newstudent1=generatePerson(student1);
		Person newteacher=generatePerson(instructor1);
		
		student1.studentId=1;
		student1.courseFee=3000000;
		student1.courseEntrolled="JA111";
		student1.state="Jharkhand";
		student1.city="Ranchi";
		student1.pinCode="829122";
	    student1.toString();
//		
		
		instructor1.city="Banglore";
		instructor1.pinCode="784383";
		instructor1.state="Karnataka";
		instructor1.instructorId=233;
		instructor1.salary=130000;
		instructor1.toString();
		
		
	}
}
