//Package
package QKartWebsite;

//Selenium Imports
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Class Name
public class QKartAutomate {
	
	//Main method
	public static void main(String[] args) throws InterruptedException {
		
		/*
		         Test Case : QKart Website
		 * 1) Launch browser (chrome, firefox,etc..)
		 * 2) Open url :https://crio-qkart-frontend-qa.vercel.app/login
		 * 3) Enter Valid Username
		 * 4) Enter Valid Password
		 * 5) Click on LOGIN TO QKART
		 */
		
		//Launch browser
		WebDriver driver = new ChromeDriver();
		
		// Set browser to maximize
	    driver.manage().window().maximize();
		
		//Opening statement
		System.out.println("Start Test case : QKart Opening.....");
        
		// Open the QKart website
        driver.get("https://crio-qkart-frontend-qa.vercel.app/login");
        Thread.sleep(2000);
        
        //Enter Username in username field
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("sheetalverma55@gmail.com");
        Thread.sleep(1000);
        
        //Enter Password in password field
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("123456@@Sv");
        Thread.sleep(1000);
        
        //Click on LOGIN TO QKART Button 
        WebElement logInToQkartBtn = driver.findElement(By.xpath("//button[contains(text(),'Login to QKart')]"));
        logInToQkartBtn.click();
        Thread.sleep(3000);
        
        //Closing Statement
        System.out.println("End Test Case : QKart Closing.....");
	}
}
