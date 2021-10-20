public class NoEmployee extends EmployeeDetails{

    public String returnEmpID()
    {
        return "Employee not found!";
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
