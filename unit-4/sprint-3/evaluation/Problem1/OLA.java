package Problem1;

public class OLA {

    public Car bookCar(int numberOfPassenger, int numberOfKMs){
        if(numberOfPassenger<=3){
            Car hatchback=new HatchBack();
            return  hatchback;
        }
        Car sadan=new Sedan();
        return sadan;

    }

    public int calculateBill(Car car){

       int numberOfKms= car.getNumberOfPassenger();
        int farePerKm=car.getNumberOfKms();
        int totalFare=numberOfKms*farePerKm;
       return totalFare;

    }
}
