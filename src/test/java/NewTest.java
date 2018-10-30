import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class NewTest {
  @Test
  public void f() {
	  
	  System.out.println("Hello Jyotsna");
	  WebDriver driver;
	  
		System.setProperty("webdriver.chrome.driver", "C:\\JyotsnaPatil\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://Google.com");
	
	}
  }

