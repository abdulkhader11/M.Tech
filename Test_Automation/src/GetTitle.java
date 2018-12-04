import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		   
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		/*Get Title*/
		String actualtitle=driver.getTitle();
		System.out.println("The title of the page is:"+actualtitle);


	}
}
