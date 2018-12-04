import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

public static void main(String[] args) throws IOException {		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
		   
driver.manage().window().maximize();
driver.get("https://www.fb.com");
	
TakesScreenshot ts=(TakesScreenshot)driver;
File file=ts.getScreenshotAs(OutputType.FILE);
org.apache.commons.io.FileUtils.copyFile(file, new File("D:\\zakiya\\screenb.jpeg"));
System.out.println("Saved the screenshot");
driver.close();

}
}	
