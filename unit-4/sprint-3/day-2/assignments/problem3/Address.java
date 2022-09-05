package Problem4;

public class Address{
	String city;
	String state;
	String pinCode;
	@Override
	public String toString() {
		
		System.out.println("city="+city +" "+ "state=" +state  +" " + "pincode="+pinCode);
		return super.toString();
	}

}
