package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver ;
	
	@FindBy(xpath = "//a[text()='Apple']")
	WebElement applePhone;
	
	@FindBy(xpath = "//span[contains(text(),'14')]")
	List<WebElement> iphone14list;
	
	@FindBy(xpath = "//span[contains(text(),'8') and contains(text(),'Watch')]")
	List<WebElement> watches8Serieslist;
	
	
	
	public void clickOnApple()
	{
		applePhone.click();
	}
	
	
	public void printAlliPhone14()
	{
		iphone14list.forEach(ele -> System.out.println(ele.getText()));
	}
	
	public void printAllRequestedPhone(int phone)
	{
	  List<WebElement> requiredPhones = driver.findElements(By.xpath("//span[contains(text(),'"+ phone +"')]"));
		  
	  	requiredPhones.forEach(ele -> System.out.println(ele.getText()));
	}
	
	public void printAllSeries8Watches()
	{
		watches8Serieslist.forEach(ele -> System.out.println(ele.getText()));
	}
	
	
	public void printAllReauestedSeriesWatches(int series)
	{
		List<WebElement> requiredWatches = driver.findElements
				(By.xpath("//span[contains(text(),'"+series+"') and contains(text(),'Watch')]"));
	
		requiredWatches.forEach(ele -> System.out.println(ele.getText()));
	}
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
}
