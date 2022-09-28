package stepdefinition;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSteps {
	WebDriver driver = null;

	
	@Before(order = 1)
	public void beforeScenario3()
	{
		System.out.println("1111111111111111111111111");
	}
	
	@After(order = 1)
	public void afterScenrio3() {
		System.out.println("333333333333333333333");
	}
	
	@Before(order = 2)
	public void beforeScenario2()
	{
		System.out.println("22222222222222222222222222222222222");
	}
	
	@After(order = 2)
	public void afterScenrio2() {
		System.out.println("4444444444444444444444444444444444");
	}

	@BeforeStep
	public void beforeStep()
	{
		System.out.println("-------------------------------------------------");
	}
	
	@AfterStep
	public void afterStep() {
		System.out.println("..................................................");
	}
	
	@Before("@regression")
	public void beforeScenario1()
	{
		System.out.println("************%%%%%%%%%%%%*************");
	}
	
	@After("@regression")
	public void afterScenrio1() {
		System.out.println("##############%%%%%%%%%%%%%%%%%%%-----------######################");
	}
	
	
	@Before("@regression and @sut")
	public void beforeScenario5()
	{
		System.out.println("************Regression and sut*************");
	}
	
	@After("@regression and @sut")
	public void afterScenrio5() {
		System.out.println("############## Regression and sut-----------######################");
	}
	
	
	
	
	@Given("user is on google page")
	public void user_is_on_google_page() {
	  
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Assert.assertEquals("Google", driver.getTitle());
	}
	@When("user enter(s) {} in searchbox")
	public void user_enter_synechron_in_searchbox(String company) throws InterruptedException {
		
	    driver.findElement(By.name("q")).sendKeys(company);
	    Thread.sleep(5000);
	}
	@When("click on search")
	public void click_on_search() {

	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	//	WebElement serachButton = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']"))));
	//	serachButton.click();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	}
	@Then("user print all the hyperlinks")
	public void user_print_all_the_hyperlinks() {
	   
	  List<WebElement> hyperlinks = driver.findElements(By.tagName("h3"));
	  for (WebElement hyperlink : hyperlinks) 
	  {
		System.out.println(hyperlink.getText());
	  }
	}
	@Then("user print all/no autosuggetions")
	public void user_print_all_the_autosuggetions() {
	    
		//ul[@role='listbox']/li
		List<WebElement> autoSuggetions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		//java 8 feature
		autoSuggetions.forEach(sugg -> System.out.println(sugg.getText()));
	}

	@Then("close the browser")
	public void close_the_browser() {
	  //  driver.close();
	   // driver = null;
	}


}
