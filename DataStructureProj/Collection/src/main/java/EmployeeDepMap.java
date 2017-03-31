/**
 * Created by L.z Double E on 3/30/2017.
 */
public class EmployeeDepMap {
    private  String department;
    private  String empCode;


    public EmployeeDepMap(String code, String dep)
    {
        this.department = dep;
        this.empCode = code;
    }

    public void setCode(String code)
    {
        this.empCode = code;
    }

    public void setDepartment(String dep)
    {
        this.department = dep;
    }

    public String getCode()
    {
        return empCode;
    }

    public String getDepartment()
    {
        return department;
    }



    @Override
    public String toString() {
        return "Employee Details{" +
                "Employee Code: '" + empCode + '\'' +
                ",Employee Department: '" + department + '\'' +
                '}';    }
}
