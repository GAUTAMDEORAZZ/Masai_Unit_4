package Problem1;

public class HistoryStudent extends Student{
    int historyMarks;
    int civicsMarks;
    @Override
    public void getPercentage(){
        int sum=historyMarks+civicsMarks;
        float percentage=sum*100/200;



        System.out.println("The percentage of History is :"+percentage +"%");

    }
}
