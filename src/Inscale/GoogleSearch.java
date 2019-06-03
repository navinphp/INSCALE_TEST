package Inscale;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Topdanmark\n");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[@href='https://www.topdanmark.dk/']")).click();
		driver.quit();

	}

}
