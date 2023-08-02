package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v112.browser.Browser;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.LoginPage;

public class BaseClass {
public WebDriver driver;
@Parameters("browser")
@BeforeClass
public void openBrowser(String browser)
{
	Reporter.log("openBrowser",true);
	if(browser.equals("chrome"))
		driver = new ChromeDriver();
	else if(browser.equals("edge"))
		driver = new EdgeDriver();	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@BeforeMethod
public void login() throws IOException
{
	Reporter.log("login",true);
	FileLib f=new FileLib();
	String url = f.getPropertyData("url");
	String un = f.getPropertyData("username");
	String pw = f.getPropertyData("password");
	driver.get(url);
	LoginPage l=new LoginPage(driver);
	l.setLogin(un, pw);
	
}

@AfterMethod
public void logOut()
{
	Reporter.log("logOut",true);
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	e.setLogout();
}

@AfterClass
public void closeBrowser()
{
	Reporter.log("closeBrowser",true);
	driver.close();
}

}
