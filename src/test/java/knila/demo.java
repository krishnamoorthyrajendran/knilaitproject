package knila;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class demo extends base {
	@SuppressWarnings("deprecation")
	@Test
	public void project() throws InterruptedException, IOException, AWTException
	{
		this.driver=intinal();
		driver.get("https://playactio.com/auth/login");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//Enter User Name
		WebElement username=driver.findElement(By.name("userName"));
		username.click();
		username.sendKeys("Admin");
		//Enter Password
		WebElement password=driver.findElement(By.name("password"));
		password.click();
		password.sendKeys("admins");
		//click Master and Venue
		WebElement Login=driver.findElement(By.xpath("//button[@type='button']"));
		Login.click();

		WebElement master=driver.findElement(By.xpath("//a[@class='nav-link ng-tns-c51-4']"));
		master.click();

		WebDriverWait Wait=new WebDriverWait (driver,5);

		WebElement profile=Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='nav-ps-elite']/div/div[1]/div/ul/app-nav-group[1]/app-nav-collapse[4]/li/ul/app-nav-item[2]/li/a")));
		profile.click();

		//Create Venue
		WebElement createvenue=driver.findElement(By.xpath("//button[@class='btn btn-primary float-lg-right']"));
		createvenue.click();
		//Enter VenueName
		WebElement VenueName=driver.findElement(By.name("venue_name"));
		VenueName.click();
		VenueName.sendKeys("krishnamoorthy");
		//Select VenueType
		WebElement VenueType=
				driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-venueadd/div/form/app-card[1]/div/div[2]/div/div[2]/div[1]/div[2]/ng-select/div"));
		VenueType.click();
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();
		//Enter seatingNo
		WebElement seatingNo=driver.findElement(By.name("seating_no"));
		seatingNo.click();
		seatingNo.sendKeys("1000");
		//Enter ChangingRoom
		WebElement ChangingRoom =driver.findElement(By.name("Changing_room"));
		ChangingRoom.click();
		ChangingRoom.sendKeys("500");
		//Enter the address and copy and paste
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.name("address"))).click().sendKeys("New delhi,india").doubleClick().build().perform();
		driver.findElement(By.name("address")).sendKeys(Keys.chord(Keys.CONTROL, "c"));
		driver.findElement(By.name("address1")).click();
		driver.findElement(By.name("address1")).sendKeys(Keys.chord(Keys.CONTROL, "v"));
		//Select The Country
		driver.findElement(By.name("country")).click();
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();
		//Select The State
		driver.findElement(By.name("state")).click();
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();
		//Select The City
		driver.findElement(By.name("city")).click();
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();
		//Enter the latitude
		WebElement latitude=driver.findElement(By.name("latitude"));
		latitude.click();
		latitude.sendKeys("10");
		//Enter the longitude
		WebElement longitude=driver.findElement(By.name("longitude"));
		longitude.click();
		longitude.sendKeys("10");
		//Enter the zipcode
		WebElement zipcode=driver.findElement(By.name("zipcode"));
		zipcode.click();
		zipcode.sendKeys("611111");


		//driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-venueadd/div/form/app-card[1]/div/div[2]/div/div[2]/div[1]/div[13]/div")).click();
		//Runtime.getRuntime().exec("C:\\Users\\krishnamoorthy\\Documents\\check\\file.exe");
		//Thread.sleep(8000);
		//Enter the twowheeler
		WebElement twowheeler=driver.findElement(By.name("twowheeler"));
		twowheeler.click();
		twowheeler.sendKeys("10");
		//Enter the fourwheeler
		WebElement fourwheeler=driver.findElement(By.name("fourwheeler"));
		fourwheeler.click();
		fourwheeler.sendKeys("10");
		//Enter the gentstoilet
		WebElement gentstoilet=driver.findElement(By.name("gentstoilet"));
		gentstoilet.click();
		gentstoilet.sendKeys("10");
		//Enter the ladiestoilet
		WebElement ladiestoilet=driver.findElement(By.name("ladiestoilet"));
		ladiestoilet.click();
		ladiestoilet.sendKeys("10");
		//Select the Drinking Water
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-venueadd/div/form/app-card[1]/div/div[2]/div/div[2]/div[2]/div[5]/ng-select")).click();
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();
		//Select the Snacks
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-venueadd/div/form/app-card[1]/div/div[2]/div/div[2]/div[2]/div[6]/ng-select")).click();
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();
		//select the Beverages
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-venueadd/div/form/app-card[1]/div/div[2]/div/div[2]/div[2]/div[7]/ng-select")).click();
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();

		//Enter the mail Description 
		Actions a1=new Actions(driver);

		driver.switchTo().frame(0);
		a1.moveToElement(driver.findElement(By.xpath("//*[@id='tinymce']"))).click().sendKeys("Play Bold Play Bold Play Bold ").doubleClick().build().perform();
		driver.switchTo().defaultContent();
		//Select the Play Area
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-venueadd/div/form/app-card[2]/div/div[2]/div/div[1]/div/button")).click();
		//Enter the Play Area
		WebElement playarea=driver.findElement(By.name("fieldname"));
		playarea.click();
		playarea.sendKeys("cricket");
		//select the Surface Type 
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-venueadd/div/form/app-card[2]/div/div[2]/div/app-card/div/div[2]/div/form/div[1]/div[1]/div[2]/ng-select")).click();
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();
		//select the Sport Name *
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-venueadd/div/form/app-card[2]/div/div[2]/div/app-card/div/div[2]/div/form/div[1]/div[1]/div[3]/ng-select")).click();
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();



		//driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-venueadd/div/form/app-card[2]/div/div[2]/div/app-card/div/div[2]/div/form/div[1]/div[2]/div[2]/div")).click();
		//Runtime.getRuntime().exec("C:\\Users\\krishnamoorthy\\Documents\\check\\file.exe");

		//Click the save button
		WebDriverWait Wait2=new WebDriverWait (driver,5);
		WebElement profile2=Wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-venueadd/div/form/app-card[2]/div/div[2]/div/app-card/div/div[2]/div/form/div[2]/button[2]")));
		profile2.click();
		
		//Click view more button
		WebDriverWait Wait3=new WebDriverWait (driver,5);
		WebElement profile3=Wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-sm btn-info']")));
		profile3.click();
	
		//close the window for view more
		WebDriverWait Wait4=new WebDriverWait (driver,5);
		WebElement profile4=Wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-venueadd/div/app-ui-modal[1]/div/div/div/div[1]/div/button/span")));
		profile4.click();
	
		//Enter the edit button
		WebDriverWait Wait5=new WebDriverWait (driver,5);
		WebElement profile5=Wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-sm btn-warning']")));
		profile5.click();
	
		//Click the save button
		WebDriverWait Wait6=new WebDriverWait (driver,5);
		WebElement profile6=Wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-info justify-content-center']")));
		profile6.click();
		
		//Add Information
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-venueadd/div/form/app-card[3]/div/div[2]/div/div[1]/div/button")).click();

		//Enter the name
		WebElement name=driver.findElement(By.name("Name"));
		name.click();
		name.sendKeys("krishnamoorthy");
		//Enter the Email
		WebElement emailid=driver.findElement(By.name("emailID"));
		emailid.click();
		emailid.sendKeys("krishnamoorthy980@gmail.com");
		//Enter the MobileNo
		WebElement mobileNo=driver.findElement(By.name("mobileNo"));
		mobileNo.click();
		mobileNo.sendKeys("8015982316");
		//Enter the WenSite
		WebElement Website=driver.findElement(By.name("Website"));
		Website.click();
		Website.sendKeys("www.cricket.com");
		//Enter the Social
		WebElement Social=driver.findElement(By.name("Social"));
		Social.click();
		Social.sendKeys("FaceBook");
		//Click the save Button

		WebDriverWait Wait1=new WebDriverWait (driver,5);

		WebElement profile1=Wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-venueadd/div/form/app-card[3]/div/div[2]/div/app-card/div/div[2]/div/form/div[2]/button[2]")));
		profile1.click();

		//Enter the save button and successfully saved
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-venueadd/div/form/app-card[3]/div/div[2]/div/div[3]/button")).click();
		WebDriverWait Wait7=new WebDriverWait (driver,5);
		WebElement profile7=Wait7.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[3]/button[1]")));
		profile7.click();


		//Click the view button and scroll the page
		WebElement total=driver.findElement(By.xpath("//*[@id='DataTables_Table_1_wrapper']"));
		WebElement row=total.findElement(By.xpath("//*[@id='DataTables_Table_1']/tbody/tr[1]"));
		row.findElement(By.xpath("//*[@id='DataTables_Table_1']/tbody/tr[1]/td[9]/button[1]")).click();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		//Click the back button
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-venueview/div/form/app-card[3]/div/div[2]/div/div[2]/a/button")).click();
		//WebDriverWait Wait8=new WebDriverWait (driver,8);
		//WebElement profile8=Wait8.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-venueview/div/form/app-card[3]/div/div[2]/div/div[2]/a/button")));
		//profile8.click();

		//Click the Edit Button and alter the name and save again
		WebDriverWait Wait9=new WebDriverWait (driver,5);
		WebElement profile9=Wait9.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='DataTables_Table_2']/tbody/tr[1]/td[9]/button[2]")));
		profile9.click();
		WebElement editVenueName =driver.findElement(By.name("venue_name"));
		editVenueName.click();
		editVenueName.sendKeys(" R");
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-venueedit/div/form/app-card[3]/div/div[2]/div/div[3]/button")).click();
		
		WebDriverWait Wait10=new WebDriverWait (driver,1);
		WebElement profile10=Wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[2]/div/div[3]/button[1]")));
		profile10.click();
		
	//	/html/body/app-root/app-admin/div/div/div/div/div/div/app-venueview/div/form/app-card[3]/div/div[2]/div/div[2]/a/button



	}

}
