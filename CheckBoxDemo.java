import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class CheckBoxDemo {
	
			@Test
			public void loginTest() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://the-internet.herokuapp.com/login");
			
			driver.findElement(By.id("username")).sendKeys("tomsmith");
			driver.findElement(By.id("password")).sendKeys("SuperSecretPasswor!");  //given the wrong p/w 
			//correct p/w is SuperSecretPassword!
			driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
			
			String expected = "https://the-internet.herokuapp.com/secure";
			String actual ="";
			try {
				 actual = driver.getCurrentUrl();
			}
			catch(Exception e) {
				
			}
			System.out.println(expected);
			System.out.println(actual);
			Assert.assertEquals("invalid password ", expected, actual);
			}

}
