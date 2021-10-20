public class Employee extends EmployeeDetails{
    public Employee(String empID)
    {
        this.empID=empID;
    }
    public String returnEmpID()
    {
        return empID;
    }
    public boolean isNull()
    {
        return false;
    }
}
