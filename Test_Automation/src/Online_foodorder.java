import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Online_foodorder {
	
WebDriver driver=new ChromeDriver();


	@BeforeTest
	
	public void Admin_Login() throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver.manage().window().maximize();
	
		driver.get("https://www.demo.iscripts.com/netmenus/mrml/admin");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			    
// Enter Admin E-mail Address
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
//Password
		driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("admin");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
//button
		driver.findElement(By.xpath("//button[@value='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				
	}
			
	@Test(priority=0)
			public void create_restaurant() throws InterruptedException, IOException {
			
//Restaurant details Module on the left pane Window
// Click on Restaurant
			driver.findElement(By.xpath("//a[@href='https://www.demo.iscripts.com/netmenus/mrml/cms?section=restaurant']")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			
//Scroll down to Add a Restaurant
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(200,500)");
			System.out.println("scrolled Down");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
		

//Add Record (Restaurant)
			driver.findElement(By.xpath("//a[@class='addrecord btn btn-info']")).click();
			
//Scroll down to Enter the Restaurant details
			JavascriptExecutor js1=(JavascriptExecutor)driver;
			js1.executeScript("window.scrollBy(300,500)");
			System.out.println("scrolled Down");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			
//Restaurant Name
			driver.findElement(By.xpath("//input[@id='venue_name']")).sendKeys("Brew Point");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			
//Description
			driver.findElement(By.xpath("//textarea[@id='venue_description']")).sendKeys("Description");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			
//Address
			driver.findElement(By.xpath("//input[@id='venue_address_by_user']")).sendKeys("Kalburagi");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			
//Zip
			driver.findElement(By.xpath("//input[@id='zip_code']")).sendKeys("585102");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			
//Phone
			driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9876543210");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
//Site URL
			driver.findElement(By.xpath("//input[@id='site_url']")).sendKeys("http://www.brewpoint.com");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
//Slogan
			driver.findElement(By.xpath("//input[@id='slogan']")).sendKeys("Coffee cafe");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
//Cuisines
			driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("Chinese");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
//Payment Option
			driver.findElement(By.xpath("//input[@value='0']")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
//Take out
			driver.findElement(By.xpath("//input[@id='takout']")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
//Home Delivery
			driver.findElement(By.xpath("//input[@id='delivery']")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
//Reservation
			driver.findElement(By.xpath("//input[@id='reservation']")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
//Catering
			driver.findElement(By.xpath("//input[@id='catering']")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
//Restaurant Owner
			driver.findElement(By.xpath("//select[@id='created_by']")).click();
			driver.findElement(By.xpath("//select[@id='created_by']/option[3]")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			
//Manager
			driver.findElement(By.xpath("//input[@id='store_manager']")).sendKeys("Robert$$");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
//Manager Email
			driver.findElement(By.xpath("//input[@id='store_manager_email']")).sendKeys("Rbrt$$@gmail.com");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
//Minimum Order Amount
			driver.findElement(By.xpath("//input[@id='min_order_amount']")).sendKeys("1000");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
//Sales Tax(%)
			driver.findElement(By.xpath("//input[@id='sales_tax']")).sendKeys("1");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
//Delivery Fee Type
			driver.findElement(By.xpath("//select[@id='delivery_fee_type']")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
//Delivery Fee(%)
			driver.findElement(By.xpath("//input[@id='delivery_fee']")).sendKeys("50");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
//Delivery Area Description
			driver.findElement(By.xpath("//textarea[@id='delivery_area_desc']")).sendKeys("Description");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
//Rate of commission(%)
			driver.findElement(By.xpath("//input[@id='commission']")).sendKeys("2");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
//Meta Tags(Keywords in comma)
			driver.findElement(By.xpath("//textarea[@id='meta_tags']")).sendKeys("This is meta tags");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
//Save
			driver.findElement(By.xpath("//input[@id='jqSubmitForm']")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
//Publish
			driver.findElement(By.xpath("//button[contains(text(),'Publish')]")).click();
			
		// To Enter the Restaurant Images
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[5]/a[1]")).click();
			
	   //Add Record
			driver.findElement(By.xpath("//a[@class='addrecord btn btn-info']")).click();
			
			WebElement upload=driver.findElement(By.xpath("//input[@id='photo_id']"));
			upload.sendKeys("E:\\r2.jpg");
			driver.findElement(By.xpath("//input[@id='is_cover_photo']")).click();
			driver.findElement(By.xpath("//input[@id='jqSubmitForm']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[contains(text(),'Publish')]")).click();
			
	  //Click on Restaurant Module
			driver.findElement(By.xpath("//a[@href='https://www.demo.iscripts.com/netmenus/mrml/cms?section=restaurant']")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			
			
	// To Add the Menu
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[6]/a[1]")).click();
			
	//Add Record (Menu Items)
			driver.findElement(By.xpath("//a[@class='addrecord btn btn-info']")).click();
			
			
	//Add Menu Item
			
	//Menu Name
			driver.findElement(By.xpath("//input[@id='class_name']")).sendKeys("Breakfast");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
	//Start Time
			driver.findElement(By.xpath("//select[@id='start_time']")).click();
			driver.findElement(By.xpath("//select[@id='start_time']/option[18]")).click();
			
	//End Time
			driver.findElement(By.xpath("//select[@id='end_time']")).click();
			driver.findElement(By.xpath("//select[@id='end_time']/option[20]")).click();
			
	//Save
			driver.findElement(By.xpath("//input[@id='jqSubmitForm']")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
	//Publish
			driver.findElement(By.xpath("//button[contains(text(),'Publish')]")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
			// Click on Restaurant Module
			driver.findElement(By.xpath("//a[@href='https://www.demo.iscripts.com/netmenus/mrml/cms?section=restaurant']")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
						
			// Click on Manage Food Items to Add
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[8]/a[1]")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
			//Add Food Item
			driver.findElement(By.xpath("//a[@id='additem']")).click();
			
			//Food Item
			driver.findElement(By.xpath("//input[@id='activities_id']")).sendKeys("Idli");
			
			//Food Item Type
			driver.findElement(By.xpath("//input[@id='main']")).click();
			
			//Food Description
			driver.findElement(By.xpath("//textarea[contains(@placeholder,'Food Item Description*')]")).sendKeys("South Indian Breakfast");
			
			//Add to Menu
			driver.findElement(By.xpath("//input[@id='menus']")).click();
			
			//Food Item Price
			
			//Multiple Price
			driver.findElement(By.xpath("//input[@id='price_option']")).click();
			
			//Size
			driver.findElement(By.xpath("//input[@id='activity_size1']")).sendKeys("Small");
			
			//Price
			driver.findElement(By.xpath("//input[@id='activity_price1']")).sendKeys("$50");
			
		
			//Discount Type
			driver.findElement(By.xpath("//select[@id='activity_discount_type']")).click();
			driver.findElement(By.xpath("//select[@id='activity_discount_type']/option[2]")).click();
			driver.findElement(By.xpath("//input[@id='activity_discount']")).sendKeys("$5");
		
			driver.findElement(By.xpath("//input[@id='token-input-food_category']")).sendKeys("pizza");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@id='token-input-food_category']")).sendKeys(Keys.ENTER);
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
			//Save
			driver.findElement(By.xpath("//input[@value='Save']")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
									
			// Click on Restaurant Module
			driver.findElement(By.xpath("//a[@href='https://www.demo.iscripts.com/netmenus/mrml/cms?section=restaurant']")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
			
			//Operations
			/*//View
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[9]/a[1]/img[1]")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;

			//close
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[3]/a[1]")).click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;*/
			//Edit the restaurant details
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[9]/a[2]/img[1]")).click();
			driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS) ;
			
			//Zip
				driver.findElement(By.xpath("//input[@id='zip_code']")).sendKeys("585103");
				driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS) ;
				
			//Phone
				driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9988874563");
				driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS) ;
				//Scroll down to save changes
						JavascriptExecutor js111=(JavascriptExecutor)driver;
						js111.executeScript("window.scrollBy(300,500)");
						System.out.println("scrolled Down");
						driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
						//Save
						driver.findElement(By.xpath("//input[@id='jqSubmitForm']")).click();
						driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
						
					//Delete the restaurant
					driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[9]/a[3]/img[1]")).click(); 
					driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
					
					//Alerts
					driver.switchTo().alert().accept();
	}

//End User
	
	@Test(priority=1)
	public void search_restaurant() throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	
	driver.manage().window().maximize();
	
	driver.get("https://www.demo.iscripts.com/netmenus/mrml");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
//Login
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/nav[1]/div[1]/div[2]/div[2]/a[1]")).click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
// Enter the User E-mail Address
	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("user@netmenus.com");
//Password
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("pass");
//button
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
//Enter the Values to Search the Restaurant
	
//Enter street address, city, zip code
	driver.findElement(By.xpath("//input[@class='textfield ui-autocomplete-input']")).sendKeys("Chicago");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
//Enter Restaurant name, cuisine, food name, food category
	driver.findElement(By.xpath("//div[@class='col-md-6']//input[@id='search_keyword']")).sendKeys("Brew");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
//Click on Search
	driver.findElement(By.xpath("//input[@id='Submit']")).click();
	driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
	
	
//Big Basket Restaurant
	driver.findElement(By.xpath("//a[@href='https://www.demo.iscripts.com/netmenus/mrml/Lulugmailcom']")).click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	
//Add Menu Item
	driver.findElement(By.xpath("//div[@id='123']//div[2]//div[1]//div[1]//div[2]//div[1]//div[2]//div[1]//a[1]//img[1]")).click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
//Add to Order
	driver.findElement(By.xpath("//div[@id='fade_123_304']//div[@id='divskip']")).click();
	
//Proceed to Check Out
	driver.findElement(By.xpath("//a[@id='jQOrderFn']")).click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
//Delivery Address
	driver.findElement(By.xpath("//span[contains(text(),'Delivery Address')]")).click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
//Shipping Address
//First name
	driver.findElement(By.xpath("//form[@id='frmcheckout']//div[1]//div[1]//input[1]")).sendKeys("");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
//Last name
	driver.findElement(By.xpath("//form[@id='frmcheckout']//div[1]//div[1]//input[2]")).sendKeys("");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
//Scroll down to enter email
	JavascriptExecutor js11=(JavascriptExecutor)driver;
	js11.executeScript("window.scrollBy(200,400)");
	System.out.println("scrolled Down");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
//Email
	driver.findElement(By.xpath("//form[@id='frmcheckout']//div[1]//div[1]//input[3]")).sendKeys("");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
//Phone
	driver.findElement(By.xpath("//form[@id='frmcheckout']//div[1]//div[1]//input[4]")).sendKeys("9876543210");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
//Billing Address
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
//Save
	driver.findElement(By.xpath("//input[@value='Continue']")).click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
//Reviews Order
	
//Scroll down to order
	JavascriptExecutor js111=(JavascriptExecutor)driver;
	js111.executeScript("window.scrollBy(200,700)");
	System.out.println("scrolled Down");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
//Order Now
	driver.findElement(By.xpath("//input[@value='Order now']")).click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
//Back to Home
	driver.findElement(By.xpath("//a[contains(text(),'Back to Home')]")).click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
//Logout
	driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
}
	
//Admin View Order
	
	@Test(priority=2)
	public void view_order() throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	
	driver.manage().window().maximize();

	driver.get("https://www.demo.iscripts.com/netmenus/mrml/admin");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	    
//Enter E-mail
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
//Password
		driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("admin");
//button
		driver.findElement(By.xpath("//button[@value='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
//Restaurant details
// Click on Restaurant module
		driver.findElement(By.xpath("//a[@href='https://www.demo.iscripts.com/netmenus/mrml/cms?section=restaurant']")).click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
		
//Orders
		driver.findElement(By.xpath("//a[@href='https://www.demo.iscripts.com/netmenus/mrml/cms?parent_section=restaurant&parent_id=23&section=bookings']")).click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
			
//Ordered Items
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[7]/a[1]")).click();
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
		
//Back
		driver.findElement(By.xpath("//a[@class='jhistoryBack']")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
// Click on Restaurant module
		driver.findElement(By.xpath("//a[@href='https://www.demo.iscripts.com/netmenus/mrml/cms?section=restaurant']")).click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS) ;
		
//Logout
		driver.findElement(By.xpath("//a[@class='icon_logout']")).click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
		
	
}
	
	@AfterTest 
    public void close() {
    	driver.close();
    	
    	
    }
}

	
