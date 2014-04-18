package calculate.web.app;

import java.util.HashSet;
import java.util.Set;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CalculateTest extends TestCase {

    /**
     * constructor of class CalculateTest
     * @param testName the name of test
     */
    public CalculateTest(String testName) {
	super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( CalculateTest.class );
    }

    /**
     * test is calculating multiplication table
     */
    public void testCalculatingAll() {
	Set<Integer> set1 = new HashSet<Integer>();
	Set<Integer> set2 = new HashSet<Integer>();
	for (int i = 1; i <= 9; i++) {
	    for (int j = 1; j <= 9; j++) {
		set1.add(i * j);
	    }
	}
	for (int i = 1; i <= 9; i++) {
	    for (int j = 1; j <= 9; j++) {
		set2.add(Calculate.getResult(i, j));
	    }
	}
	assertEquals(set1, set2);
    }
    /**
     * test is calculating random data
     */
    public void testCalculatingRandom() {
	Integer set1 = new Integer((int) (Math.random()*10));
	Integer set2 = new Integer((int) (Math.random()*10));
	assertEquals((int)set1*set2, (int)Calculate.getResult(set1, set2));
    }
}
