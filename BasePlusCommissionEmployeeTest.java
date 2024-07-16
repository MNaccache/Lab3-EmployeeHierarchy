package Lab3;

public class BasePlusCommissionEmployeeTest {
    public static void main (String[] args) {

        String firstName = "Hue"; //Just establishing my variables to give to the Employee
        String lastName = "Man";
        String ssn = "192381";
        double grossSales = 100;
        double commissionRate = 0.5;
        double baseSalary = 100;

        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(firstName, lastName, 
                                                                            ssn, 
                                                                            grossSales, commissionRate, 
                                                                            baseSalary); //giving the variables to the employee
        
        System.out.println(employee.toString()); //prints out the contents of employee.toStringto the console
        
    }//method end
}//class end
