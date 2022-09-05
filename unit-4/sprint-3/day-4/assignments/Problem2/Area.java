package Problem2;

public class Area extends Shape{

    @Override
    public int rectangleArea(int length,int breath){

        return length*breath;
    }
    @Override
    public int squareArea(int side){
        return side*side;

    }
    @Override
    public int circleArea(int radius){
        return radius*radius;
    }
}
