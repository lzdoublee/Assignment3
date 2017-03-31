import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by L.z Double E on 3/31/2017.
 */
public class BenzGClassSetTest {

    BenzGClassSet benzType;

    @Before
    public void setUp() throws Exception
    {
        benzType = new BenzGClassSet("Benz");
    }

    @Test
    public void testBenzSet() throws Exception
    {
        Set<String> classSet = new HashSet<String>();

        classSet.add("G-Class Professional");
        classSet.add("G550");
        classSet.add("G63");
        classSet.add(benzType.getType());

        System.out.print("G-Class set list: " + classSet + "\n" );
        System.out.print("Number of G - Class types in the set is: " + classSet.size() + "\n");

        classSet.remove("G63");
        System.out.print("G-Class set after removing a G63: " + classSet + "\n");
        System.out.print("current number of types is: " + classSet.size());

        Assert.assertEquals("Benz", benzType.getType());
    }
}
