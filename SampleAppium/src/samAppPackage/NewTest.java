
  
//R&D 4
	//for (int i=0; i<=20; i++)
	//{
		//try {
		//	driver.findElement(By.name("20")).click();
		//}
		//catch (Exception e){
			
		//}
	//}
	
//org.openqa.selenium.Dimension dim = driver.manage().window().getSize();
	
	//int height = dim.getHeight();
	//int width = dim.getWidth();
	
	//int x = width/2;
	//int starty = (int) (height*0.08);
	//int endy = (int) (height*0.02);

	//driver.swipe(x, starty, x, endy, 500);

	//System.out.println(driver.findElement(By.id("android:id/numberpicker_input")).getText());
	//driver.findElement(By.id("android:id/numberpicker_input")).sendKeys("05");
	//driver.findElement(By.xpath("//*[@class='android.widget.EditText' and @bounds='[612,494][804,638]']")).getText();
	//System.out.println(driver.findElement(By.xpath("//*[@class='android.widget.EditText' and @bounds='[612,494][804,638]']")));
	//driver.findElement(By.xpath("//*[@class='android.widget.EditText' and @bounds='[612,494][804,638]']")).sendKeys("05");
	
	//R&D 2
	
	//System.out.println(driver.findElements(By.className("android.widget.NumberPicker")).get(0).getAttribute("value"));
	//driver.findElements(By.className("android.widget.NumberPicker")).get(0).sendKeys("05");
	//driver.findElements(By.className("android.widget.NumberPicker")).get(1).sendKeys("Aug");
	//System.out.println(driver.findElements(By.className("android.widget.NumberPicker")).get(0).getAttribute("value"));
	
	//R&D 3
	
	//List<WebElement> datePickerBox = driver.findElements(By.className("android.widget.EditText"));

	//WebElement day = datePickerBox.get(0);
	//WebElement month = datePickerBox.get(1);
	//WebElement year = datePickerBox.get(2);

//	day.click();
	//day.sendKeys("05");
	//year.sendKeys("2017");
	//month.sendKeys("Aug");
	
	//System.out.println("xx : " + day.getText());
	//System.out.println("xx : " + month.getText());
	//System.out.println("xx : " + year.getText());
	
	//driver.findElement(By.id("android:id/button1")).click();
	
	//driver.findElement(By.id("com.appy.store.lite:id/tvChildDob")).getAttribute("value");
	
	/*month.click();
	month.sendKeys("Feb");

	year.click();
	year.sendKeys("2017");*/
	
	//R&D code
	//driver.findElement(By.xpath("//android.widget.NumberPicker[@index='2']")).sendKeys("2016"); 
	//driver.findElement(By.xpath("//android:id/numberpicker_input[@index='1']")).sendKeys("04");
	//String mont = driver.findElement(By.xpath("android:id/numberpicker_input[@index='0']")).getText();
	//String x = driver.findElement(By.xpath("android:id/numberpicker_input[@index='1']")).getText();
	
	//System.out.println("details mo " + mont + "| x " + x );
	
	//driver.findElement(By.xpath("//android.widget.NumberPicker[@index='1']")).sendKeys("Aug");
	 	 

	//driver.findElement(By.xpath("//android.widget.NumberPicker[@index='1']")).sendKeys("Aug");
	//driver.findElement(By.xpath("//android.widget.NumberPicker[@index='2']")).sendKeys("2016");

  //driver.pressKeyCode (AndroidKeyCode.HOME);
 
  // IMP NOTE:
  // Import Artur Spirin >> Appium Video on Youtube
  
   
  //Touch functionality for Mobile App
//TouchAction touch = new TouchAction (driver);
  //TouchAction eye1 = new TouchAction(driver);
  //TouchAction eye2 = new TouchAction(driver);
  
  //Wait Command
 // WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds: 10);
  //Check till the Condition is meet
 // WebElement title = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("title"))));
  
  /* Screenshot of full page
   import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.selenium.Eyes;

private Eyes eyes = new Eyes ();
private WebDriver driver;
private static String applitoolsKey = "your_applitools-key";

@Before
public void setUp() throws Exception {
eyes.setApiKey(applitoolsKey);
BatchInfo batch = new BatchInfo( name: "XXX");
eyes.setBatch(batch);

@Test


eyes.open(driver, appName: "XXX", testName: "Native Page");
eyes.checkWindow(tag: "Test");
eyes.close();

   */
  
  
/* For selecting Day, Month & Year from Date Picker Loop function
 List<WebElement> dd = driver.findElements(By.className("android.widget.textView"));

for (int i=0,i<dd.size();i++){
System.out.println(dd.get(i).getText());

if(dd.get(i).getText().equalsIgnoreCase("Dailer")){

dd.get(i).click();


}
*/ 

