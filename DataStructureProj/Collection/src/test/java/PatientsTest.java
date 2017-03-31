import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by L.z Double E on 3/31/2017.
 */
public class PatientsTest {
    Patients firstPatient;
    Patients secondPatient;
    Patients thirdPatient;

    @Before
    public void setUp() throws Exception
    {
        firstPatient = new Patients("Dave Thompson", "dysthymia");
        secondPatient = new Patients("Anathi Mpongo", "Anxiety");
        thirdPatient = new Patients("Olwethu Sanda", "bipolar");
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void testStudentList() throws Exception
    {
        List patientList = new ArrayList();

        patientList.add(firstPatient.getName());
        patientList.add(secondPatient.getName());
        patientList.add(thirdPatient.getName() + "\n");

        System.out.print("Patients admitted: " + patientList + "\n");
        System.out.print("The number of admitted patients is: " + patientList.size() + "\n");

        patientList.remove(0);
        System.out.print("Patients admitted after one patient is discharged: " + patientList);
        System.out.print("The number of admitted patients now is: " + patientList.size());

        Assert.assertEquals("Dave Thompson", firstPatient.getName());
    }
}
