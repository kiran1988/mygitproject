package demopackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class democlass {
	@Test
	public void test()
	{
		System.out.println("welcome");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
	}

}
