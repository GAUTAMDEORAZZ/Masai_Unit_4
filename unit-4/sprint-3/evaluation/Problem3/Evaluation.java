package Problem3;

public abstract class Evaluation {
    private final int numberOfQuestions=20;
    abstract void evaluationTiming();
    void printNoOfQuestion(){
        System.out.println("No of quetion in Evaluation is" +numberOfQuestions);
    }
    public Evaluation(){

    }
}
