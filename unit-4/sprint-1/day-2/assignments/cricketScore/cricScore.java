public class cricScore {
    int score(int one,int two, int three, int four, int six){
        int totalScore =(one*1)+(two*2)+(three*3)+(four*4)+(six*6);
                return totalScore;
    }

    public static void main(String[] args) {
        cricScore obj=new cricScore();
        int result=obj.score(30,8,1,15,4);
        System.out.println("Total Score :"+result);

    }
}
