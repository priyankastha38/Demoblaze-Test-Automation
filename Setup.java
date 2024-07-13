
	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeSuite;
	//import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Setup {
		public static WebDriver driver;
		public static String url = "https://www.demoblaze.com/index.html";
		
		@BeforeSuite
		public static void setUp() {


		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
		/* public void setImplicitWait() {
		        // Set an implicit wait of 10 seconds
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    }*/

}
