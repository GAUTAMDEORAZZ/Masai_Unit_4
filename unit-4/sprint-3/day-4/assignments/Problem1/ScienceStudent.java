package Problem1;

public class ScienceStudent extends Student {
    int physicsMarks;
    int chemistryMarks;
    int mathsMarks;
    @Override
    public void getPercentage() {
        int sum=physicsMarks+chemistryMarks+mathsMarks;
        float percentage=sum*100/300;


        System.out.println("The percentage of science is :"+percentage+"%");
    }
}
