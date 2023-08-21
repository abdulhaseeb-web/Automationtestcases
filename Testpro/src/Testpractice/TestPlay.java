package Testpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

 

public class TestPlay {
			 WebDriver driver;  
			  
			 
			 By username = By.xpath("//*[@id=\"txtUsername\"]");
			 By Password = By.xpath("//*[@id=\"txtPassword\"]");
			 By Submitbtn = By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/div[3]/div[1]/button");
			 By Setting = By.xpath("/html/body/header/div[1]/div/div/div[2]/div/div[1]/button");
			 By logout = By.xpath("/html/body/header/div[1]/div/div/div[2]/div/div[1]/ul/li[2]/a");
			 By Verify = By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[2]/h1");
			/* By Search = By.xpath("//*[@id=\"menu-item-417\"]/a");
			 By SMNLN = By.xpath("/html/body/div[1]/div[2]/div/div[2]/div[2]/div[1]/button[1]");
			 By userLn = By.id("username");
			 By passLn = By.id("password");
			 By SubmitLn = By.xpath("//*[@id=\"app__container\"]/main/div[2]/form/div[3]/button");
			 By Myaccount = By.xpath("//*[@id=\"careerfy-header\"]/div/div/div/div/div[2]/div/ul/li[2]");
			 By Dasboard = By.xpath("//*[@id=\"careerfy-header\"]/div/div/div/div/div[2]/div/ul/li[2]/ul/li[1]/a");
			 By Logout = By.xpath("//*[@id=\"careerfy-header\"]/div/div/div/div/div[2]/div/ul/li[2]/ul/li[8]/a");
			 By Muser = By.id("txtUsername");
			 By Mpass = By.id("txtPassword");
			 By msubmit = By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/div[3]/div[1]/button");
			 By jobsnew = By.xpath("//*[@id=\"menuJobs\"]"); 
			 By dasboard = By.xpath("/html/body/header/div[2]/div/ul[2]/li[2]/a");*/
			 
			 public TestPlay(WebDriver driver)
			    {
			    	this.driver=driver;
			    }
			 public void username1()
			    {
			         driver.findElement(username).sendKeys("kunal.kashyap");
			    }
			 public void password1()
			    {
			         driver.findElement(Password).sendKeys("Aadhyam@123");
			    }
			 public void submit1()
			    {
			         driver.findElement(Submitbtn).click();
			    }
			 public void Setting1()
			    {
			         driver.findElement(Setting).click();
			    }
			 public void Logout1()
			    {
			         driver.findElement(logout).click();
			    }
			 public void verifytext()
			 {
			           if(driver.getPageSource().contains("Find #GreatPeopleToWorkWith"))
			           {
			        	   System.out.println("Text is present (Passed)");
			           }
			           else{
			        	   System.out.println("Text is absent (FAILED)");
			           }
			    }
	}


