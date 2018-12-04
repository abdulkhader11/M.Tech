import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdown1 {
	

	public static void main(String[] args)  throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			   
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in");	
//MouseHover functions
		   Actions action=new Actions(driver);
		   action.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-yourAccount']"))).build().perform();
		   Thread.sleep(3000);
	      driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]")).click();
	      Thread.sleep(3000);
		  driver.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys("mani20994@gmail.com");
		   driver.findElement(By.xpath(".//*[@id='continue']")).click();
		   driver.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys("swty1234");
		   driver.findElement(By.xpath(".//*[@id='signInSubmit']")).click();
		   
		
		   //Dropdown
		 driver.findElement(By.xpath(".//*[@id='searchDropdownBox']")).click();
		 driver.findElement(By.xpath(".//*[@id='searchDropdownBox']/option[13]")).click();  
}
}