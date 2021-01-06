package knila;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class createevent extends base {

	@Test
	public void event() throws InterruptedException, IOException, AWTException
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

		driver.findElement(By.xpath("//*[@id='nav-ps-elite']/div/div[1]/div/ul/app-nav-group[1]/app-nav-collapse[2]/li/a")).click();
		@SuppressWarnings("deprecation")
		WebDriverWait Wait=new WebDriverWait (driver,5);
		WebElement profile=Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='nav-ps-elite']/div/div[1]/div/ul/app-nav-group[1]/app-nav-collapse[2]/li/ul/app-nav-item[1]/li/a")));
		profile.click();

		WebElement tour=driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-eventcreate/div/div[2]/app-card/div/div[2]/div/form/div[2]/div[1]/div[1]/select"));
		Select select=new Select(tour);
		select.selectByValue("329");

		WebElement event_fees=driver.findElement(By.name("event_fees"));
		event_fees.click();
		event_fees.sendKeys("50000");

		WebElement EventName=driver.findElement(By.name("event_name"));
		EventName.click();
		EventName.sendKeys("cricket");

		WebElement discount=driver.findElement(By.name("discount"));
		discount.click();
		discount.sendKeys("100");

		WebElement EventSport =driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-eventcreate/div/div[2]/app-card/div/div[2]/div/form/div[2]/div[1]/div[3]/select"));
		Select select1=new Select(EventSport);
		select1.selectByValue("1");

		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-eventcreate/div/div[2]/app-card/div/div[2]/div/form/div[2]/div[2]/div[3]/div/div")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-eventcreate/div/div[2]/app-card/div/div[2]/div/form/div[2]/div[2]/div[3]/div/ngb-datepicker/div[2]/div/ngb-datepicker-month/div[3]/div[6]")).click();

		WebElement event_type =driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-eventcreate/div/div[2]/app-card/div/div[2]/div/form/div[2]/div[1]/div[4]/select"));
		Select select2=new Select(event_type);
		select2.selectByValue("1");

		WebElement no_of_teams=driver.findElement(By.name("no_of_teams"));
		no_of_teams.click();
		no_of_teams.sendKeys("5");

		WebElement player_type =driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-eventcreate/div/div[2]/app-card/div/div[2]/div/form/div[2]/div[1]/div[5]/select"));
		Select select3=new Select(player_type);
		select3.selectByValue("1");

		WebElement min_age_group =driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-eventcreate/div/div[2]/app-card/div/div[2]/div/form/div[2]/div[2]/div[6]/div/div[1]/select"));
		Select select4=new Select(min_age_group);
		select4.selectByValue("10");

		WebElement max_age_group =driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-eventcreate/div/div[2]/app-card/div/div[2]/div/form/div[2]/div[2]/div[6]/div/div[2]/select"));
		Select select5=new Select(max_age_group);
		select5.selectByValue("15");

		WebElement venue =driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-eventcreate/div/div[2]/app-card/div/div[2]/div/form/div[2]/div[2]/div[7]/select"));
		Select select6=new Select(venue);
		select6.selectByValue("175");

		WebElement event_status =driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-eventcreate/div/div[2]/app-card/div/div[2]/div/form/div[2]/div[2]/div[8]/select"));
		Select select7=new Select(event_status);
		select7.selectByIndex(1);

		Actions a1=new Actions(driver);

		driver.switchTo().frame(0);
		a1.moveToElement(driver.findElement(By.xpath("//*[@id='tinymce']"))).click().sendKeys("Play Bold Play Bold Play Bold ").doubleClick().build().perform();
		driver.switchTo().defaultContent();

		WebElement Subscriber =driver.findElement(By.name("manager_id"));
		Subscriber.click();
		Subscriber.sendKeys("120727");

		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-eventcreate/div/div[2]/app-card/div/div[2]/div/form/app-card/div/div[2]/div/div/div[1]/div/div/div/div/button")).click();

		driver.findElement(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-eventcreate/div/div[2]/app-card/div/div[2]/div/form/app-card/div/div[2]/div/div/div[2]/table/tbody/tr/td[6]/button")).click();

		WebDriverWait a=new WebDriverWait (driver,5);

		WebElement profile1=a.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-admin/div/div/div/div/div/div/app-eventcreate/div/div[2]/app-card/div/div[2]/div/form/div[5]/button[2]")));
		profile1.click();


		WebDriverWait a2=new WebDriverWait (driver,5);

		WebElement profile2=a2.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[3]/button[1]")));
		profile2.click();
		

	}}
