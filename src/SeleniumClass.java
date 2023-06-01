import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumClass {

	public static void main(String[] args) {
		
		// ChromeDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Jyoti\\Desktop\\SeleniumProject\\chromedriver113\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://kite.zerodha.com");
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	   
	    driver.close();
	  
	    WebDriver driver1 = new ChromeDriver();
	    driver1.get("https://kite.zerodha.com");
	    
	}

}
