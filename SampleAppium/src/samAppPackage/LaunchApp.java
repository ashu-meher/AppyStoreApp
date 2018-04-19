package samAppPackage;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.TakesScreenshot;
import javax.imageio.ImageIO;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

@Test
public class LaunchApp {
	
	private AndroidDriver driver;
	//private String errormessage = "Unable to recognize the email address";
	String destDir;
	DateFormat dateFormat;
	
	 
	 @BeforeTest
	public void setup() throws MalformedURLException {
		
		//Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Neelu Verma");
		caps.setCapability("udid", "32085d4f88db71c1"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "6.0.1");
		caps.setCapability("appPackage", "com.appy.store.lite");
		caps.setCapability("appActivity", "com.appy.store.lite.MainActivity");
		caps.setCapability("noReset", "true");
		
		driver = new AndroidDriver (new URL("http://0.0.0.0:4723/wd/hub"), caps);
		
		System.out.println("App Launch");
	 } 
	
	@Test
	 public void RegPage() throws InterruptedException, Exception {
		 		 
		 //Verify Sub Title on Reg page and Start trail & Login button, link present
		String exptext = "Register your child and start 15 days FREE trial"; 
		String acttext = driver.findElement(By.id("com.appy.store.lite:id/tvSubTitle")).getText();
		
		if(acttext.contains(exptext)){
			System.out.println("Test Pass");
		}
		else
			System.out.println("Test Fail");
		//verify trail button is present
	Boolean 
	trialbutton = driver.findElement(By.id("com.appy.store.lite:id/btnSave")).isDisplayed();
		System.out.println(trialbutton);
	
	//verify Login link is present
	Boolean
	login = driver.findElement(By.id("com.appy.store.lite:id/tvLogin")).isDisplayed();
	System.out.println(login);
	
	
	//Click on Start Trail button without entering any data
	
	driver.findElement(By.id("com.appy.store.lite:id/btnSave")).click();
	Thread.sleep(1000L); 
	//Check for the Error Validation message in Toast & Take Screenshot
	
	TakesScreenshot ts = (TakesScreenshot)driver; 
	File source = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File("./Screenshot/Toastmsg.png"));
	
	Tesseract instance = new Tesseract();
	String result = instance.doOCR(source);
	
	System.out.println(result);
	Assert.assertTrue(result.contains("Please Enter Your Child's Name"), "Please Enter Your Child's Name");
			
	
	//Enter Child Name
	//driver.findElement(By.id("com.appy.store.lite:id/etChildName")).sendKeys("autochild");
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//Tab on Next button
	//((AndroidDriver)driver).sendKeyEvent(66);
	
	
	//driver.findElement(By.id("com.appy.store.lite:id/etChildName")).getAttribute("value");
	Thread.sleep(5000L); 	
	//Set Date
	//driver.findElement(By.id("com.appy.store.lite:id/tvChildDob")).click();
	//System.out.println("Click on DoB option");
	//Thread.sleep(5000L); 
	 
	//driver.findElement(By.id("android:id/content")).isSelected();
		 
	// ((AndroidElement)(driver.findElement(By.xpath("//android.widget.NumberPicker[@index='2']//android.widget.Button[@index=0]")))).tap(1, 5);
	// System.out.println((driver.findElement(By.xpath("//android.widget.NumberPicker[@index='2']//android.widget.Button[@index=0]"))).getText());
	// Thread.sleep(5000L); 
	 
	// ((AndroidElement)(driver.findElement(By.xpath("//android.widget.NumberPicker[@index='1']//android.widget.Button[@index=0]")))).tap(1, 10);
	// System.out.println((driver.findElement(By.xpath("//android.widget.NumberPicker[@index='1']//android.widget.Button[@index=0]"))).getText());
	// Thread.sleep(5000L); 
	 
	// ((AndroidElement)(driver.findElement(By.xpath("//android.widget.NumberPicker[@index='0']//android.widget.Button[@index=0]")))).tap(1, 5);
	// System.out.println((driver.findElement(By.xpath("//android.widget.NumberPicker[@index='0']//android.widget.Button[@index=0]"))).getText());
	// Thread.sleep(5000L); 
	 
	// driver.findElement(By.id("android:id/button1")).click();
	// Thread.sleep(5000L); 
	 
	//TouchAction touch = new TouchAction (driver);
	
	//enter child name
	//driver.findElement(By.id("com.appy.store.lite:id/etChildName")).sendKeys("autochild");
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//Tab on Next button
	//((AndroidDriver)driver).sendKeyEvent(66);
	
	//driver.findElement(By.id("com.appy.store.lite:id/etChildName")).getAttribute("value");
		
	//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	
	//driver.findElement(By.id("com.appy.store.lite:id/tvChildDob")).getText();
	//System.out.println("Click on DoB option");
	
	//CLick on Login link from Registration page
	
	//driver.findElement(By.id("com.appy.store.lite:id/tvLogin")).click();
	//Thread.sleep(5000L);
	
	
			//String exptext1 = "Please enter your registered email address"; 
			//String acttext2 = driver.findElement(By.id("com.appy.store.lite:id/tvSubTitle")).getText();
			
			//if(acttext2.contains(exptext1)){
				//System.out.println("Test Pass");
			//}
			//else
			//	System.out.println("Test Fail");
			//Clicked on Close button of Login form
			//driver.findElement(By.id("com.appy.store.lite:id/ivClose")).click();
			//Thread.sleep(5000L);
			//driver.findElement(By.id("com.appy.store.lite:id/tvLogin")).click();
			
			//Boolean 
			//loginbutton = driver.findElement(By.id("com.appy.store.lite:id/btnLogin")).isDisplayed();
				//System.out.println(loginbutton);
			
			//verify Register link is present
			//Boolean
			//registerlink = driver.findElement(By.id("com.appy.store.lite:id/tvRegister")).isDisplayed();
			//System.out.println(registerlink);
			
			//WebElement loginfield = driver.findElement(By.id(("com.appy.store.lite:id/etEnterEmail")));
			
			//System.out.println("Trying to enter value ");
			//System.out.println("login " + loginfield );
			//loginfield.sendKeys("abc@gmail.com");
			//System.out.println("Trying to send key");
			//((AndroidDriver)driver).sendKeyEvent(4);
			//System.out.println("send key done");
			
			//driver.findElement(By.id("com.appy.store.lite:id/etEnterEmail")).getAttribute("value");
			//System.out.println("Vaule enter" + loginfield);
			//driver.findElement(By.id("com.appy.store.lite:id/btnLogin")).click();
			//System.out.println("Clicked on Login");
			
									
			//try{
				//WebElement errormsg = driver.findElement(By.id("com.appy.store.lite:id/tvLoginError"));
				//assertEquals(errormsg.getText(), errormessage);
				//System.out.println("login failed - error present");
			//}catch(NoSuchElementException e){
				//System.out.println("login success - error not present");
			}
			
			
	
	 
	 private Object image(AndroidDriver driver2) {
		// TODO Auto-generated method stub
		return null;
	}

	@AfterTest
	 public void End() {
	  driver.quit();
	  
	}
}

