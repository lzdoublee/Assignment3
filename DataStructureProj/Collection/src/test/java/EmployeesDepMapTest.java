import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by L.z Double E on 3/31/2017.
 */
public class EmployeesDepMapTest {

    EmployeeDepMap dep1;
    EmployeeDepMap dep2;
    EmployeeDepMap dep3;

    @Before
    public void setUp() throws Exception
    {
        dep1 = new EmployeeDepMap("0302", "Cardiology");
        dep2 = new EmployeeDepMap("0408", "Critical care");
        dep3 = new EmployeeDepMap("0601", "Chaplaincy");
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void testEmpsHashMaps() throws Exception
    {
        HashMap<String, String> empDepartment = new HashMap<String, String>();

        empDepartment.put(dep1.getDepartment(), dep1.getCode());
        empDepartment.put(dep2.getDepartment(), dep2.getCode());
        empDepartment.put(dep3.getDepartment(), dep3.getCode());

        System.out.print("Department names " + empDepartment + "\n");
        System.out.print("The number of departments is: " + empDepartment.size() + "\n");

        empDepartment.remove("0302");
        System.out.print("List of employees after removing 'Cardiology' " + empDepartment + "\n");
        System.out.print("The number of departments is now: " + empDepartment.size() + "\n");

        empDepartment.clear();
        System.out.print("When all departments are removed: " + empDepartment + "\n");
        System.out.print("The number of departments is now: " + empDepartment.size() + "\n");

        Assert.assertEquals("0408", dep2.getCode());
    }
}
