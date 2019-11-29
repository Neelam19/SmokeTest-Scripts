package SignIn_SignUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignIn {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neela\\Downloads\\Jars\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://staging.quinncia.io/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[text()='SIGN IN / SIGN UP']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("neelam3@quinncia.io");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Test1234");
		driver.findElement(By.xpath("//button[@type='submit' and text()='Continue']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='navbar-link']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(3000);
		driver.close();
		driver.quit();


	}

}
