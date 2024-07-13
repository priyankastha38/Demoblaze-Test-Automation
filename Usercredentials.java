import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;

public class Usercredentials extends Setup {
    private WebDriverWait wait;

	
	@Test (priority = 1)
	public void testsignup(){
		driver.findElement(By.xpath("//a[@id='signin2']")).click();
		driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys("Priyank");
		driver.findElement(By.xpath("//input[@id='sign-password']")).sendKeys("asdfg123");
		driver.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();
				
	}
	
	@Test (priority = 1)
	public void testlogin(){
		driver.findElement(By.xpath("//a[@id='login2']")).click();
		driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("Priyank");
		driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("asdfg123");
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
				
	}
	
	@Test (priority = 2)
	public void monitorcategory(){
		driver.findElement(By.xpath("//a[contains(text(),'Monitors')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Monitors')]")).click();
		//WebElement phone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".card-block")));
       // assert phone.isDisplayed();
				
	}
	
	@Test (priority = 3)
	public void addproduct(){
		
		driver.findElement(By.xpath("//a[contains(text(),'Samsung galaxy s6')]")).click();
		//additemtocart
		driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
		
		
	}
	
		
	@Test (priority = 4)
	public void viewcart(){
		driver.findElement(By.xpath("//a[@id='cartur']")).click();
		
	}
	
	
	@Test (priority = 5)
	public void deleteproduct(){
		viewcart();
		driver.findElement(By.linkText("Delete")).click();
	}
	
	
	
	@Test (priority = 6)
	public void checkout(){
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Priyank");
		driver.findElement(By.xpath("//input[@id='country']")).sendKeys("Nepal");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Pokhara");
		driver.findElement(By.xpath("//input[@id='card']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='month']")).sendKeys("Jan");
		driver.findElement(By.xpath("//input[@id='year']")).sendKeys("2024");
		driver.findElement(By.xpath("//button[contains(text(),'Purchase')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		driver.findElement(By.xpath("//body/div[@id='orderModal']/div[1]/div[1]/div[3]/button[1]")).click();



	}
	
	@Test (priority = 7)
	public void contact(){
		driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
		driver.findElement(By.xpath("//input[@id='recipient-email']")).sendKeys("Priyank@gmail.com");
		driver.findElement(By.xpath("//input[@id='recipient-name']")).sendKeys("Priyank");
		driver.findElement(By.xpath("//textarea[@id='message-text']")).sendKeys("My name is priyank");
		driver.findElement(By.xpath("//button[contains(text(),'Send message')]")).click();
		
				
	}
	
	@Test (priority = 8)
	public void logout(){
		driver.findElement(By.xpath("//a[@id='logout2']")).click();
						
	}
			
	@Test (priority = 9)
	public void aboutpage(){
		driver.findElement(By.xpath("//a[contains(text(),'About us')]")).click();
		driver.findElement(By.cssSelector(".vjs-big-play-button")).click();
						
	}
	
	
	
		

}
