package stepdefinition;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdditionSteps {

	int result ; 
	
	@Given("user has {int} and {int}")
	public void add(Integer a, Integer b) {
		System.out.println("User Entered " + a + " and " + b);
		result = a + b;
	}
	
	@Given("user has two numbers")
	public void user_has_two_numbers() {

	}

	@Then("user get sum of two numbers")
	public void user_get_sum_of_two_numbers() {

	}
	@When("user perform addition")
	public void user_perform_addition() {
		System.out.println(" Addition Result : " + result);
	}

	@Then("user get sum of two numbers as {int}")
	public void user_get_sum_of_two_numbers_as(int int1) {
		Assert.assertEquals(int1, result);
		
	}
}
