package clicking.mous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClicking {
	static WebDriver dr;

	public static void main(String[] args) {
		dr=openB();
		dr.get("http://www.facebokk.com");
		WebElement el=dr.findElement(By.xpath("//*[@id=\"email\"]"));
		Actions ma=new Actions(dr);
		ma.contextClick(el).perform();
		
	}
public static WebDriver openB() {
	System.setProperty("webdriver.chrome.driver", "/Users/mdobaidulla/Desktop/chromedriver");
	dr=new ChromeDriver();
	return dr;
}
}
