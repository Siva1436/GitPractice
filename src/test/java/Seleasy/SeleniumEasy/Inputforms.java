package Seleasy.SeleniumEasy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Inputforms {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\satya\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	//driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		
	/*	//input Fields
		driver.findElement(By.id("user-message")).sendKeys("Tetsing");
		driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();
		String MSG = driver.findElement(By.id("display")).getText();
		System.out.println(MSG);
		
		driver.findElement(By.id("sum1")).sendKeys("10");
		driver.findElement(By.id("sum2")).sendKeys("20");
		driver.findElement(By.xpath("//button[contains(text(),'Get Total')]")).click();
		String MSG1 = driver.findElement(By.id("displayvalue")).getText();
		System.out.println(MSG1);
		
		//Mutiple Check Boxes
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		List<WebElement> chkbox = driver.findElements(By.xpath("//input[@type='checkbox' and @class='cb1-element']"));
		for (WebElement el : chkbox )
			if(!el.isSelected()){
				el.click();
				System.out.println("clicked:"+el);
			}
		String buttonname =driver.findElement(By.id("check1")).getAttribute("value");
		System.out.println("Once all boxes checked:"+buttonname);
		Assert.assertEquals(buttonname , "Uncheck All");
		driver.findElement(By.xpath("(//input[@class='cb1-element'])[4]")).click();
		String buttonname1 =driver.findElement(By.id("check1")).getAttribute("value");
		System.out.println("One uncheked:"+buttonname1);
		Assert.assertEquals(buttonname1, "Check All");*/
		
		/*dropdown list
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		Select drpdwn = new Select (driver.findElement(By.id("select-demo")));
		drpdwn.selectByIndex(1);
		drpdwn.selectByValue("Thursday");
		drpdwn.selectByVisibleText("Friday");
		
		Select txtbox = new Select(driver.findElement(By.id("multi-select")));
		List<WebElement> options = txtbox.getOptions();
		 for (WebElement option : options) {
		 System.out.println(option.getText()); 
		 }
		 Actions builder = new Actions(driver);
		 builder.keyDown(Keys.CONTROL)
		 .click(txtbox.getOptions().get(2))
		 .click(txtbox.getOptions().get(3))
		 .click(txtbox.getOptions().get(4))
		 .click(txtbox.getOptions().get(5))
		 .keyUp(Keys.CONTROL);
		 builder.build().perform();
		 driver.findElement(By.id("printMe")).click();
		 String firststselected =driver.findElement(By.xpath("//p[@class='getall-selected']")).getText();
		 System.out.println("1stselected cntry:"+ firststselected);
		 Assert.assertEquals(firststselected, "First selected option is : New York");
		 driver.findElement(By.id("printAll")).click();
		 String getall =driver.findElement(By.xpath("//p[@class='getall-selected']")).getText();
		 System.out.println("All cntry:"+ getall);
		 Assert.assertEquals(getall, "Options selected are : New Jersey,New York,Ohio,Texas");*/
		 
		// Ajax form Submission
		 driver.get("https://www.seleniumeasy.com/test/ajax-form-submit-demo.html");
		 driver.findElement(By.id("title")).sendKeys("Test");
		 driver.findElement(By.id("description")).sendKeys("Test comment");
		 driver.findElement(By.id("btn-submit")).click();
		System.out.println( driver.findElement(By.id("submit-control")).getText());
		Thread.sleep(1000);
		System.out.println( driver.findElement(By.id("submit-control")).getText());
		
		 
		
		

	}

}
