import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<String> listOfEmployees=new ArrayList<String>();
        listOfEmployees.add("123B");
        listOfEmployees.add("456C");
        listOfEmployees.add("67890B");
        System.out.println("Enter employee ID");
        String empID=scan.next();
        if(listOfEmployees.contains(empID))
        {
            Employee employee=new Employee(empID);
            System.out.println("Employee "+employee.returnEmpID()+" found!");
            return;
        }
         NoEmployee noEmployee=new NoEmployee();
        System.out.println(noEmployee.returnEmpID());
    }
}
