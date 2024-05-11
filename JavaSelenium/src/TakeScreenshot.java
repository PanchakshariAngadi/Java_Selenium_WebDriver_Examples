import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot{
	public static void main(String[] args) {		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://the-internet.herokuapp.com/login");
			
			driver.findElement(By.id("username")).sendKeys("tomsmith");
			driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
			driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();

			TakesScreenshot ts= (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			String timestamp = new SimpleDateFormat("yyyyddmm_hhmmss").format (new Date());
			String file = "Img-" +timestamp+".png";
			//FileUtils.CopyFile(src, new File ("D\\data\\" + file));
			
			
	}

}
