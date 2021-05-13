package elementsavailableinthewebpage_Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import elementsavailableinthewebpage.BaseClass;

public class Elementsavailableinthewebpage_Test1 extends BaseClass{

	@Test
	public void Flipkart() throws Exception{

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement cross = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		js.executeScript("arguments[0].click();", cross);

		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("mobiles");
		searchBox.submit();
		Thread.sleep(3000);
		List<WebElement> count = driver.findElements(By.xpath("//*/img[@class='_396cs4 _3exPp9']"));
		int size = count.size()-5;
		System.out.println(size);

	}

}
