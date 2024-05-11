import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {
	public static void main(String args[]) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://stock.scriptinglogic.org/");
		driver.findElement(By.id("login-username")).sendKeys("admin");
		driver.findElement(By.id("login-password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.linkText("Add Customer")).click();
		
		driver.findElement(By.name("name")).sendKeys("pavan");
		driver.findElement(By.name("contact1")).sendKeys("3q4394r5r");
		driver.findElement(By.name("address")).sendKeys("bhubli");
		driver.findElement(By.name("contact2")).sendKeys("123434rqr");
		driver.findElement(By.name("Submit")).click();		
	}

}
