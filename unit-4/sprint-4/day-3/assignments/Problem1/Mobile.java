package Problem1;

public class Mobile {
	String name;

	 String[] outdatedModels = {"note4","note5","note6","note7"};
 public void searchOutdatedModel(String name,String ...values) {
	
	 for (String string : values) {
		 
		 for (String string2 :outdatedModels) {
			 if(string.equals(string2)) {
				 System.out.println( string +"_OUTDATED");
			 }
		}
		
	}
	 
 }
 
 public static void main(String[] args) {
	 Mobile obj=new Mobile();
	 String name="Samsung";
	 obj.searchOutdatedModel(name,"note4","note6","note11","note5","note12");
   }
}
