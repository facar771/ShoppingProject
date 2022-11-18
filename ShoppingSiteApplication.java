package projects.shoppingSite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@SpringBootApplication
public class ShoppingSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingSiteApplication.class, args);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hepsiburada.com/");
		String title = driver.getTitle();
		System.out.println(title);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        
        //Using the ID
        driver.switchTo().frame("buttonframe");

        //Or using the name instead
        driver.switchTo().frame("myframe");

        //Now we can click the button
        driver.findElement(By.tagName("button")).click();
        

        driver.quit();
		
		
		
	}
}
