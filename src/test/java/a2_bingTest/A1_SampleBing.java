package a2_bingTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1_SampleBing {

	@Test
	public void loginBingTest() throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com/");
		WebElement element = wd.findElement(By.name("q"));
		element.sendKeys("chennai");
		element.submit();
		System.out.println(wd.getTitle());
		wd.navigate().back();
		System.out.println(wd.getTitle());
		wd.navigate().forward();
		System.out.println(wd.getTitle());
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:/vcentry coding/eclipse/K3_GitTest/screenshot/bing.png"));
		wd.quit();

	}
}
