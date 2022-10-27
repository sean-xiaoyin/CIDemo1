package edu.utsa.cs;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	private App app;

	@Before
	public void setUp(){
		app = new App(0);
	}
	
	@Test
	public void testAddPositive(){
		int sum = app.add(5);
		Assert.assertEquals("Sum of adding a positive value 5", 5, sum);
	}
	
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
