package p2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import p1.Pagepgm2;

public class Testprgm2 {
	WebDriver driver;
	  @BeforeTest
	  public void setup()
	  {
	    driver=new ChromeDriver();
	    driver.get("https://naveenautomationlabs.com/opencart/");
	  }
	  @Test
	  public void testing() throws InterruptedException
	  {
	    Pagepgm2 ob=new Pagepgm2(driver);
	    ob.account();
	    Thread.sleep(3000);
	    ob.register();
	    Thread.sleep(3000);
	    ob.details("sarang", "m", "sarang410@gmail.com", "8967543212");
	    Thread.sleep(3000);
	    ob.details1("Parum#1998", "Parum#1998");
	    Thread.sleep(3000);
	    ob.radio();
	    Thread.sleep(3000);
	    ob.check();
	    Thread.sleep(3000);
	    ob.continue1();
	    Thread.sleep(3000);
	    ob.con1();
	    Thread.sleep(3000);
	    ob.logout();
	  }
}
