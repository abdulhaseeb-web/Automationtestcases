package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Testpractice.TestPlay;



public class Testsignin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\UpdateSelenium\\Testpro\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
    	driver.get("https://thework.life/");
    	TestPlay CSM = new TestPlay(driver);
	  
	 	CSM.username1();
	 	Thread.sleep(2000);
	 	CSM.password1();
	 	Thread.sleep(2000);
	 	CSM.submit1();
	 	Thread.sleep(2000);
	 	CSM.Setting1();
	 	Thread.sleep(2000);
	 	CSM.Logout1();
	 	Thread.sleep(6000);
	 	CSM.verifytext();
	 	driver.close();
	}

}
