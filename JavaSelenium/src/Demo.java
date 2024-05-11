import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	System.out.println(driver.getTitle());	
	System.out.println(driver.getCurrentUrl());
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://mail.google.com/mail/u/0/#inbox");
	//Thread.sleep(4000);
	driver.close();
	driver.quit();
	}

}
