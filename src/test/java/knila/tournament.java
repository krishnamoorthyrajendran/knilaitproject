package knila;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class tournament extends base {
	@Test
	public void tour() 
	{
		this.driver=intinal();
		driver.get("https://playactio.com/auth/login");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
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
		
		driver.findElement(By.xpath("//a[@class='nav-link ng-tns-c51-4']")).click();
		//WebDriverWait Wait=new WebDriverWait (driver,10);
	//	WebElement profile=Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='nav-link ng-tns-c51-4']")));
	//	profile.click();
		
		
		driver.findElement(By.xpath("//*[@id='nav-ps-elite']/div/div[1]/div/ul/app-nav-group[1]/app-nav-collapse[4]/li/ul/app-nav-item[1]/li/a")).click();
		//Click the Create Tournament
		driver.findElement(By.xpath("//button[@class='btn btn-primary float-lg-right']")).click();
		//Click the TournamentName
		WebElement TournamentName=driver.findElement(By.name("tourname"));
		TournamentName.click();
		TournamentName.sendKeys("cricket");
		//select the county list
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-tournamentadd/div/div[2]/app-card[1]/div/div[2]/div/form/div[2]/div[1]/div[2]/ng-select")).click();
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();
		///Selet the state
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-tournamentadd/div/div[2]/app-card[1]/div/div[2]/div/form/div[2]/div[1]/div[3]/ng-select")).click();
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();

		//Select the city
		
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-tournamentadd/div/div[2]/app-card[1]/div/div[2]/div/form/div[2]/div[1]/div[4]/ng-select")).click();
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();

		//select the Venue
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-tournamentadd/div/div[2]/app-card[1]/div/div[2]/div/form/div[2]/div[1]/div[5]/ng-select")).click();
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();

		//select tournment type
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-tournamentadd/div/div[2]/app-card[1]/div/div[2]/div/form/div[2]/div[2]/div[1]/ng-select")).click();
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();
		//select tournmant start date
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-tournamentadd/div/div[2]/app-card[1]/div/div[2]/div/form/div[2]/div[2]/div[2]/div/div[1]/div/div")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-tournamentadd/div/div[2]/app-card[1]/div/div[2]/div/form/div[2]/div[2]/div[2]/div/div[1]/div/ngb-datepicker/div[2]/div/ngb-datepicker-month/div[4]/div[4]")).click();
		//select tournment end date
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-tournamentadd/div/div[2]/app-card[1]/div/div[2]/div/form/div[2]/div[2]/div[2]/div/div[2]/div/div/span")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-tournamentadd/div/div[2]/app-card[1]/div/div[2]/div/form/div[2]/div[2]/div[2]/div/div[2]/div/ngb-datepicker/div[2]/div/ngb-datepicker-month/div[6]/div[6]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-tournamentadd/div/div[2]/app-card[1]/div/div[2]/div/form/div[2]/div[2]/div[3]/div/div[1]/input")).click();

		//Select tournment start time
		driver.findElement(By.xpath("//button[@id='timepicker-item-id-12']")).click();
		driver.findElement(By.xpath("//button[@id='timepicker-item-id-10']")).click();
		driver.findElement(By.xpath("//*[@id='time-picker']/div[3]/button[2]")).click();
		//Select Tournment end time
		driver.findElement(By.xpath("//input[@name='tournamentEndTime']")).click();
		driver.findElement(By.xpath("//*[@id='timepicker-item-id-12']")).click();
		driver.findElement(By.xpath("//*[@id='time-picker']/div[1]/div[2]/div[2]")).click();
		driver.findElement(By.xpath("//button[@id='timepicker-item-id-5']")).click();
		driver.findElement(By.xpath("//*[@id='time-picker']/div[3]/button[2]")).click();
		//Select Registration open date
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-tournamentadd/div/div[2]/app-card[1]/div/div[2]/div/form/div[2]/div[2]/div[4]/div/div[1]/div/div")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-tournamentadd/div/div[2]/app-card[1]/div/div[2]/div/form/div[2]/div[2]/div[4]/div/div[1]/div/ngb-datepicker/div[2]/div/ngb-datepicker-month/div[3]/div[4]")).click();
		//Select Registration close date
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-tournamentadd/div/div[2]/app-card[1]/div/div[2]/div/form/div[2]/div[2]/div[4]/div/div[2]/div/div")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-tournamentadd/div/div[2]/app-card[1]/div/div[2]/div/form/div[2]/div[2]/div[4]/div/div[2]/div/ngb-datepicker/div[2]/div/ngb-datepicker-month/div[3]/div[6]")).click();

		//Select fee type
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-tournamentadd/div/div[2]/app-card[1]/div/div[2]/div/form/div[2]/div[2]/div[5]/ng-select")).click();
		driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted']")).click();
		//Enter Registration Fee
		WebElement RegistrationFee= driver.findElement(By.name("registrationFee"));
		RegistrationFee.click();
		RegistrationFee.sendKeys("5000");
		//Select Early bird lase date
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-tournamentadd/div/div[2]/app-card[1]/div/div[2]/div/form/app-card/div/div[2]/div/div/div[2]/div/div/div")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-tournamentadd/div/div[2]/app-card[1]/div/div[2]/div/form/app-card/div/div[2]/div/div/div[2]/div/div/ngb-datepicker/div[2]/div/ngb-datepicker-month/div[3]/div[6]")).click();

		//Enter the Early bird discount
		WebElement bdiscount= driver.findElement(By.name("bdiscount"));
		bdiscount.click();
		bdiscount.sendKeys("500");

		Actions tour=new Actions(driver);

		driver.switchTo().frame(0);
		tour.moveToElement(driver.findElement(By.xpath("//*[@id='tinymce']"))).click().sendKeys("Play Bold Play Bold Play Bold ").doubleClick().build().perform();
		driver.switchTo().defaultContent();
		//Click Add Affiliate
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-tournamentadd/div/div[2]/app-card[2]/div/div[2]/div/div[1]/div/button")).click();
		//Enter name

		WebElement Affname= driver.findElement(By.name("Affname"));
		Affname.click();
		Affname.sendKeys("dhoni");
		//Click save button
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-tournamentadd/div/div[2]/app-card[2]/div/div[2]/div/app-card/div/div[2]/div/form/div[2]/button[2]")).click();
		//click add sponser
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-tournamentadd/div/div[2]/app-card[3]/div/div[2]/div/div[1]/div/button")).click();
		//Enter Name 
		WebElement Sponsername=driver.findElement(By.name("Sponsername"));
		Sponsername.click();
		Sponsername.sendKeys("sachin");
		//Click save button
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-tournamentadd/div/div[2]/app-card[3]/div/div[2]/div/app-card/div/div[2]/div/form/div[2]/button[2]")).click();
		//Enter Subscriber ID
		WebElement Subscriber=driver.findElement(By.name("manager_id"));
		Subscriber.click();
		Subscriber.sendKeys("120727");
		//Click search Button

		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-tournamentadd/div/div[2]/app-card[4]/div/div[2]/div/form/div[1]/div/div/div/div/button")).click();

		//Click add button
		WebDriverWait Wait7=new WebDriverWait (driver,6);
		WebElement profile7=Wait7.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-tournamentadd/div/div[2]/app-card[4]/div/div[2]/div/form/app-card/div/div[2]/div/div/table/tbody/tr/td[5]/button")));
		profile7.click();
		
		WebDriverWait Wait8=new WebDriverWait (driver,6);
		WebElement profile8=Wait8.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-tournamentadd/div/div[2]/app-card[4]/div/div[2]/div/div/button[2]")));
		profile8.click();
		
		WebDriverWait Wait1=new WebDriverWait (driver,6);
		WebElement profile1=Wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[3]/button[1]")));
		profile1.click();


		WebDriverWait Wait2=new WebDriverWait (driver,10);
		WebElement profile2=Wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='dataTables_wrapper no-footer']/div[2]/label/input")));
		profile2.click();
		driver.findElement(By.xpath("//div[@class='dataTables_wrapper no-footer']/div[2]/label/input")).sendKeys("15");

		WebElement total=driver.findElement(By.xpath("//div[@class='dataTables_wrapper no-footer']"));
		WebElement row=total.findElement(By.xpath("//tr[@class='ng-star-inserted odd']"));
		row.findElement(By.xpath("//tr[@class='ng-star-inserted odd']/td[7]/button[1]")).click();

		WebDriverWait Wait3=new WebDriverWait (driver,10);
		WebElement profile3=Wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-tournamentview/div/div[2]/app-card[4]/div/div[2]/div/div/a/button")));
		profile3.click();
	
		WebDriverWait Wait4=new WebDriverWait (driver,10);
		WebElement profile4=Wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='dataTables_wrapper no-footer']/div[2]/label/input")));
		profile4.click();
		driver.findElement(By.xpath("//div[@class='dataTables_wrapper no-footer']/div[2]/label/input")).sendKeys("15");
		WebElement total2=driver.findElement(By.xpath("//div[@class='dataTables_wrapper no-footer']"));
		WebElement row1=total2.findElement(By.xpath("//tr[@class='ng-star-inserted odd']"));
		row1.findElement(By.xpath("//tr[@class='ng-star-inserted odd']/td[7]/button[2]")).click();

		WebDriverWait Wait6=new WebDriverWait (driver,10);
		WebElement profile6=Wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-tournamentedit/div/div[2]/app-card[4]/div/div[2]/div/div[2]/button[2]")));
		profile6.click();
				
		WebDriverWait Wait5=new WebDriverWait (driver,10);
		WebElement profile5=Wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[3]/button[1]")));
		profile5.click();
	
	}

}
