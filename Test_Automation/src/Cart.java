import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Cart {

	@Test
	public static void main() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 
		//url
		driver.get("http://automationpractice.com/");

		//maximize 
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		//login
		driver.findElement(By.xpath(".//a[@class='login']")).click();
		driver.findElement(By.xpath(".//input[@id='email']")).sendKeys("ap.math90@gmail.com");
		driver.findElement(By.xpath(".//input[@id='passwd']")).sendKeys("pqu772_90");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(".//button[@id='SubmitLogin']")).click();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		//next page 
		driver.findElement(By.xpath(".//a[@title='Women']")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//input[@id='layered_category_4']")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//div[@class='right-block']//a[contains(@title,'Faded Short Sleeve T-shirts')]")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//p[@id='add_to_cart']//button[@name='Submit']")).click();
		Thread.sleep(1000);
		
		//scroll down
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(100,500)");
		System.out.println("scrolled Down");
		Thread.sleep(5000);
		
		//mouse hover
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span"))).build().perform();
		Thread.sleep(3000);

		driver.findElement(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(".//*[@id='center_column']/p[2]/a[1]/span")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//button[@name='processAddress']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(".//input[@id='cgv']")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath(".//button[@name='processCarrier']")).click();
		Thread.sleep(1000);
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//a[contains(@title,'Pay by bank wire')]")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath(".//*[@id='cart_navigation']/button")).click();
		
		driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/a")).click();
	
		driver.findElement(By.xpath(".//*[@id='selectProductSort']/option[3]")).click();
		
		System.out.println("clicked on highest first");
		
		Thread.sleep(2000);
		
		//sign out
		driver.findElement(By.xpath("//a[@title='Log me out']")).click();
		Thread.sleep(8000);
		driver.close();
		
		
		
	}
	
}
