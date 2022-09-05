public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.Name="Ramesh";
        employee.Age=22;
        employee.Phone_number="9139998734";
        employee.Address="Ranchi";
        employee.Salary=450000;
        employee.print();
        employee.printSalary();

        Manager manager=new Manager();
        manager.Name="Gautam Deo prasad";
        manager.Age=22;
        manager.Phone_number="9039998734";
        manager.Address="Ramgarh";
        manager.Salary=550000;
        manager.print();
        manager.printSalary();


    }
}
