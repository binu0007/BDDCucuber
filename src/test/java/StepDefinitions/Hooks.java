package StepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks
{
	@Before
	public void setUp()
	{
		System.out.println("Executed Before Scenarios");
	}
	
	@After
	public void tearDown()
	{
		System.out.println("Executed After Scenarios");
	}

}
