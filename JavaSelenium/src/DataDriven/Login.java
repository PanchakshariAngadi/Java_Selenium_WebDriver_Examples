package DataDriven;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
 
	@Test
    public void loginTest()
    {
        WebDriver driver = new ChromeDriver(); 
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");
        
        driver.findElement(By.id("login-username")).sendKeys("admin");
		driver.findElement(By.id("login-password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();

    }
}
