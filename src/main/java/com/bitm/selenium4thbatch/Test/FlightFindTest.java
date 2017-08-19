package com.bitm.selenium4thbatch.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bitm.selenium4thbatch.DTO.FlightFinderDTO;
import com.bitm.selenium4thbatch.DataProvider.FlightFinderDataProvider;
import com.bitm.selenium4thbatch.Utils.Drivermanager;
import com.bitm.selenium4thbatch.Utils.UrlTextUtils;
import com.bitm.selenium4thbatch.Utils.XpathUtils;

public class FlightFindTest {
	
private WebDriver driver=null;
	
	@Test(priority=1)
	public void checkFlightFindPageTitle()  {
		driver=Drivermanager.driver;
		//driver.get(UrlTextUtils.FlightFind_URL);
		//WebDriverWait wait = new WebDriverWait(driver, 40);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//WebElement element_web = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.FlightFind.Dropdown_passenger_no)));
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.FlightFind_TITLE);
		
		System.out.println("Flight Find Page Title Verified !!!");
	}
	
	@Test(priority = 2,dataProvider="flightfinderdataprovider",dataProviderClass=FlightFinderDataProvider.class)
	public void flightfindTest(List<FlightFinderDTO>ffs) throws InterruptedException{
		
		for(FlightFinderDTO ffexcel:ffs){
			
		//	navigate("http://newtours.demoaut.com/mercuryreservation.php");
			System.out.println("Flight Find Test Execution started --- ");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//driver.get(UrlTextUtils.BASE_URL);
			driver.findElement(By.xpath(XpathUtils.FlightFind.RoundTrip_BTN)).click();
			//driver.findElement(By.xpath(XpathUtils.FlightFind.Dropdown_passenger_no)).sendKeys(ffexcel.getPassenger_no());
			Select passengers= new Select(driver.findElement(By.xpath(XpathUtils.FlightFind.Dropdown_passenger_no)));
			passengers.selectByValue(ffexcel.getPassenger_no());
			//driver.findElement(By.xpath(XpathUtils.FlightFind.Dropdown_depart_from)).sendKeys(ffexcel.getDepart_from());
			Select depart_from= new Select(driver.findElement(By.xpath(XpathUtils.FlightFind.Dropdown_depart_from)));
			depart_from.selectByValue(ffexcel.getDepart_from());
			//driver.findElement(By.xpath(XpathUtils.FlightFind.Dropdown_depart_month)).sendKeys(ffexcel.getOn_month());
			Select on_month= new Select(driver.findElement(By.xpath(XpathUtils.FlightFind.Dropdown_depart_month)));
			on_month.selectByValue(ffexcel.getOn_month());
			//driver.findElement(By.xpath(XpathUtils.FlightFind.Dropdown_depart_date)).sendKeys(ffexcel.getOn_date());
			Select on_date= new Select(driver.findElement(By.xpath(XpathUtils.FlightFind.Dropdown_depart_date)));
			on_date.selectByValue(ffexcel.getOn_date());
			//driver.findElement(By.xpath(XpathUtils.FlightFind.Dropdown_arrive_in)).sendKeys(ffexcel.getArrive_in());
			Select arrive_in= new Select(driver.findElement(By.xpath(XpathUtils.FlightFind.Dropdown_arrive_in)));
			arrive_in.selectByValue(ffexcel.getArrive_in());
			//driver.findElement(By.xpath(XpathUtils.FlightFind.Dropdown_arrive_month)).sendKeys(ffexcel.getReturn_month());
			Select return_month= new Select(driver.findElement(By.xpath(XpathUtils.FlightFind.Dropdown_arrive_month)));
			return_month.selectByValue(ffexcel.getReturn_month());
			//driver.findElement(By.xpath(XpathUtils.FlightFind.Dropdown_arrive_date)).sendKeys(ffexcel.getReturn_date());
			Select return_date= new Select(driver.findElement(By.xpath(XpathUtils.FlightFind.Dropdown_arrive_date)));
			return_date.selectByValue(ffexcel.getReturn_date());
			driver.findElement(By.xpath(XpathUtils.FlightFind.ServiceBusiness_BTN)).click();
			//driver.findElement(By.xpath(XpathUtils.FlightFind.Dropdown_airline)).sendKeys(ffexcel.getAirline());
			Select airline= new Select(driver.findElement(By.xpath(XpathUtils.FlightFind.Dropdown_airline)));
			airline.selectByValue(ffexcel.getAirline());
			driver.findElement(By.xpath(XpathUtils.FlightFind.Submit_BTN)).click();
			
	        System.out.println("Flight Find Test Successful !!!");
		}
		
	}

}
