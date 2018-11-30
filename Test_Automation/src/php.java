import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


	public class php {
		
		WebDriver driver=new ChromeDriver();
       @BeforeTest
				public void main() throws InterruptedException, IOException {
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				
				driver.manage().window().maximize();
				
				driver.get("https://www.phptravels.net/admin");
			
				//email
				driver.findElement(By.xpath("//form[@class='form-signin form-horizontal wow fadeIn animated animated']//input[@placeholder='Email']")).sendKeys("admin@phptravels.com");
				//passwrd
				driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("demoadmin");
				//button
				driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
		
		@Test(priority=0)
				public void adminlogin() throws IOException{
				//flights
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			    driver.findElement(By.xpath("//a[@href='#Flights']")).click();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				
				//airport -sub
				driver.findElement(By.xpath("//a[contains(text(),'Airports')]")).click();
				
				//add
				driver.findElement(By.xpath("//a[@class='btn btn-success xcrud-action']")).click();
				
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				
				//code
				driver.findElement(By.xpath("//input[@name='cHRfZmxpZ2h0c19haXJwb3J0cy5jb2Rl']")).sendKeys("BZW");
				
				//name
				driver.findElement(By.xpath("//input[@name='cHRfZmxpZ2h0c19haXJwb3J0cy5uYW1l']")).sendKeys("BEI WEI Arpt");
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				//citycode
				driver.findElement(By.xpath("//input[@name='cHRfZmxpZ2h0c19haXJwb3J0cy5jaXR5Q29kZQ--']")).sendKeys("BZW");
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				//cityname
				driver.findElement(By.xpath("//input[@name='cHRfZmxpZ2h0c19haXJwb3J0cy5jaXR5TmFtZQ--']")).sendKeys("Beijing");
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				//countryname
				driver.findElement(By.xpath("//input[@name='cHRfZmxpZ2h0c19haXJwb3J0cy5jb3VudHJ5TmFtZQ--']")).sendKeys("China");
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				//countrycode
				driver.findElement(By.xpath("//input[@name='cHRfZmxpZ2h0c19haXJwb3J0cy5jb3VudHJ5Q29kZQ--']")).sendKeys("CN");
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				//timezone
				driver.findElement(By.xpath("//input[@name='cHRfZmxpZ2h0c19haXJwb3J0cy50aW1lem9uZQ--']")).sendKeys("8");
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				//lat
				driver.findElement(By.xpath("//input[@name='cHRfZmxpZ2h0c19haXJwb3J0cy5sYXQ-']")).sendKeys("22.639258");
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				//lon
				driver.findElement(By.xpath("//input[@name='cHRfZmxpZ2h0c19haXJwb3J0cy5sb24-']")).sendKeys("113.810664");
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				//city
				driver.findElement(By.xpath("//input[@name='cHRfZmxpZ2h0c19haXJwb3J0cy5jaXR5']")).sendKeys("true");
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				//save and return
				driver.findElement(By.xpath("//a[@class='btn btn-primary xcrud-action']")).click();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				//search
				driver.findElement(By.xpath("//a[@class='xcrud-search-toggle btn btn-default']")).click();
				//enter search values
				driver.findElement(By.xpath("//input[@name='phrase']")).sendKeys("BZW");
				//click on GO
				driver.findElement(By.xpath("//a[@class='xcrud-action btn btn-primary']")).click();
			
				//logout
				driver.findElement(By.xpath("//a[@class='btn btn-danger btn-sm btn-block']")).click();
				
				
				driver.close();
	
	}
	
		@Test (priority=1)
		public void userlogin() throws InterruptedException{
			WebDriver driver=new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			
			driver.manage().window().maximize();
			driver.get("https://www.phptravels.net");
			Thread.sleep(5000);
			

			driver.findElement(By.xpath("//a[@title='Flights']")).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//tbody//tr[1]//td[1]//div[2]//p[1]//button[1]")).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mickey");
        	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Mouse");
        	driver.findElement(By.xpath("//div[@class='col-md-5 col-xs-12']//input[@placeholder='Email']")).sendKeys("abc@gmail.com");
        	driver.findElement(By.xpath("//input[@placeholder='Confirm Email']")).sendKeys("abc@gmail.com");
        	driver.findElement(By.xpath("//input[@placeholder='Contact Number']")).sendKeys("9876543210");
        	driver.findElement(By.xpath("//input[@placeholder='Address']")).sendKeys("xyzz");
        	driver.findElement(By.xpath("//a[@class='select2-choice']")).sendKeys("India");
        	driver.findElement(By.xpath("//button[@name='guest']")).click();
			
			
			
		}
		
        @AfterTest 
        public void close() {
        	
        	driver.quit();
        	
        	
        }
        
}