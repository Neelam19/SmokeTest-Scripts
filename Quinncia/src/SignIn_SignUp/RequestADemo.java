package SignIn_SignUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RequestADemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neela\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://quinncia.io/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[text()='Request a demo']")).click();
		Thread.sleep(1000);

		//Filling Page 
		driver.findElement(By.name("firstName")).sendKeys("Neelam");
		driver.findElement(By.name("lastName")).sendKeys("Test");
		driver.findElement(By.name("institution")).sendKeys("Test Institution");
		driver.findElement(By.name("position")).sendKeys("QA Position");
		driver.findElement(By.name("email")).sendKeys("neelam@quinncia.io");
		driver.findElement(By.name("phone")).sendKeys("123456789");
		driver.findElement(By.name("message")).sendKeys("This is a dummy test for automation script");
		driver.findElement(By.xpath("//button[text()='Request Demo']")).click();
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
