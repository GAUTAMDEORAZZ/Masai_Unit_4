import java.util.Scanner;

public class Ticket {
    int ticketid;
    int price;
    static int availableTicket;
    public  int calculateTicketCost(int nooftickets){
         availableTicket=availableTicket-nooftickets;

        int ticketCost=nooftickets*this.price;
        return ticketCost;

    }
}
   class Main{
    public static void main(String[] args) {
        Ticket obj=new Ticket();
        Scanner input =new Scanner(System.in);

        System.out.println("Enter no of booking ");
        int book=input.nextInt();
        for (int i = 0; i <book ; i++) {
            System.out.println("Enter the available ticket");
            obj.availableTicket=input.nextInt();

            System.out.println("Enter the ticketid");
            obj.ticketid=input.nextInt();
            System.out.println("Enter the price");
            obj.price=input.nextInt();
            System.out.println("Enter the number of ticket");
            int num=input.nextInt();
            System.out.println(obj.availableTicket);
            int totalAmount= obj.calculateTicketCost(num);
            System.out.println("Total amount :"+totalAmount);
            System.out.println(obj.availableTicket);

        }


    }
}