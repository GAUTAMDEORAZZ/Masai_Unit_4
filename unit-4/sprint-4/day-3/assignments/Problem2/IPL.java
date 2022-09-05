package Problem2;

import java.util.Scanner;

public class IPL {
	public void homeTeamStadium(Stadium stadium) {
		if(stadium.equals(Stadium.EDEN_GARDENS_STADIUM))
		{
		System.out.println("This is the home ground of KKR");
		}
		else if(stadium.equals(Stadium.WANKHEDE_STADIUM))
		{
		System.out.println("This is the home ground of Mumbai Indians");
		}
		else if(stadium.equals(Stadium.M_CHINNASWAMY_STADIUM))
		{
		System.out.println("This is the home ground of  RCB");
		}
		else if(stadium.equals(Stadium.CHIDAMBARAM_STADIUM))
		{
		System.out.println("This is the home ground of CSK");
		}
		
}
	
	public static void main(String[] args) {
		IPL obj=new IPL();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Stadium name");
		String stadium=input.nextLine();
		if(stadium.equals("WANKHEDE_STADIUM")) {
			Stadium std=Stadium.WANKHEDE_STADIUM;
		}
		else if(stadium.equals("EDEN_GARDENS_STADIUM")) {
			
			obj.homeTeamStadium(Stadium.EDEN_GARDENS_STADIUM);
		}
		else if(stadium.equals("CHIDAMBARAM_STADIUM")) {
			obj.homeTeamStadium(Stadium.CHIDAMBARAM_STADIUM);
		}
		
       else if(stadium.equals("M_CHINNASWAMY_STADIUM")) {
    	   obj.homeTeamStadium(Stadium.M_CHINNASWAMY_STADIUM);
		}
		
       else {
    	   System.out.println("Enter valid Stadium name");
       }
		
		
	}

}
