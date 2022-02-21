package StepDefinitions;

import io.cucumber.java.en.Given;

public class tagsDemoStepDefinition
{
	@Given("Executing Scenario_One")
	public void executing_scenario_one() 
	{
	   System.out.println("Executed Scenario -1");
	}
	
	@Given("Executing Scenario_Two")
	public void executing_scenario_two() 
	{
		 System.out.println("Executed Scenario -2");
	}
	
	@Given("Executing Scenario_Three")
	public void executing_scenario_three() 
	{ 
		System.out.println("Executed Scenario -3");
	}
	
	@Given("Executing Scenario_Four")
	public void executing_scenario_four() 
	{
		 System.out.println("Executed Scenario -4");
	}
	
	@Given("Executing Scenario_Five")
	public void executing_scenario_five() 
	{
		 System.out.println("Executed Scenario -5");
	}
	
	@Given("Executing Scenario_Six")
	public void executing_scenario_six() 
	{

		 System.out.println("Executed Scenario -6");
	}

}
