package stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;

public class GSMArena extends BaseClass
{

	HomePage gsmHomePage = null;
	@Before(order = 1)
	public void createDriver() {
		super.createDriver();
	}
	
	@Before("@pom")
	public void initialzePages() {
		gsmHomePage = new HomePage(driver);
		
		
	}
	@After
	public void closeDriver() {
		super.closeDriver();
	}
	@After("@pom")
	public void closePages() {
		driver = null;
		gsmHomePage = null;
	}

	
	@When("pomuser select {string}")
	public void pomuser_select(String string) {
	   gsmHomePage.clickOnApple();
	   Assert.assertEquals("All "+string+" phones", driver.getTitle());
	}
	@Then("pomuser will print all the phone names which has {int} in it")
	public void pomuser_will_print_all_the_phone_names_which_has_in_it(Integer int1) {
		//gsmHomePage.printAlliPhone14();
		gsmHomePage.printAllRequestedPhone(int1);
	   
	}
	@Then("pomuser will print all the watchs with series {int}")
	public void pomuser_will_print_all_the_watchs_with_series(Integer int1) {
	  //  gsmHomePage.printAllSeries8Watches();
		gsmHomePage.printAllReauestedSeriesWatches(6);
	   
	}


	
	
	
	@Given("user is on gsmarena application")
	public void user_is_on_gsmarena_application() {
	   driver.get("https://www.gsmarena.com/");
	   
	   
	}
	@When("user select {string}")
	public void user_select(String string) {
		
	    driver.findElement(By.xpath("//a[text()='Apple']")).click();
	    String actualTitle = driver.getTitle();
	   
	    Assert.assertEquals("All "+string+" phones", actualTitle);
	}
	@Then("user will print all the phone names which has {int} in it")
	public void user_will_print_all_the_phone_names_which_has_in_it(Integer num) {
	    List<WebElement> requiredPhones = driver.findElements(By.xpath("//span[contains(text(),'"+ num +"')]"));
	   
	    requiredPhones.forEach(ele -> System.out.println(ele.getText()));
	}
	@Then("user will print all the watchs with series {int}")
	public void user_will_print_all_the_watchs_with_series(Integer int1) {
		List<WebElement> requiredWatches = driver.findElements
				(By.xpath("//span[contains(text(),'"+int1+"') and contains(text(),'Watch')]"));
		   
		requiredWatches.forEach(ele -> System.out.println(ele.getText()));
	   
	}

	
	@Then("user click on {string}")
	public void user_click_on(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@Then("user will print the camera details of the phone")
	public void user_will_print_the_camera_details_of_the_phone() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	
	@Then("user select the phone and print camera details")
	public void user_select_the_phone_and_print_camera_details(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	   
	}


}
