package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.TestBase;

public class telaDocPage extends TestBase {

	String url = "https://www.way2automation.com/angularjs-protractor/webtables/";
	By adduser = By.xpath("//button[contains(text(),'Add User')]");
	By firstname = By.xpath("//input[@name = 'FirstName']");
	By lastname = By.xpath("//input[@name = 'LastName']");
	By username = By.xpath("//input[@name = 'UserName']");
	By password = By.xpath("//input[@name = 'Password']");
	By role = By.xpath("//select[@name='RoleId']");
	By customer = By.xpath("//input[@name ='optionsRadios']  [@value='15']");
	By email = By.xpath("//input[@name = 'Email']");
	By cellPhone = By.xpath("//input[@name = 'Mobilephone']");
	By save = By.xpath("//button[@class='btn btn-success']");
	By tableRow = By.xpath("//tbody/tr[@class='smart-table-data-row ng-scope'][1]/td[1]");

	public telaDocPage() {
		PageFactory.initElements(driver, this);
	}

	public void gotToURL() {
		driver.get(url);
	}

	public static String getCurrentURL() {
		return driver.getCurrentUrl();
	}

	public void clickOnAddUser() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(adduser)));
		driver.findElement(adduser).click();
	}

	public void enterFirstName(String value) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(firstname)));
		driver.findElement(firstname).sendKeys(value);
	}

	public void enterLastName(String value) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(lastname)));
		driver.findElement(lastname).sendKeys(value);
	}

	public void enterUserName(String value) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(username)));
		driver.findElement(username).sendKeys(value);
	}

	public void enterPassword(String value) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(password)));
		driver.findElement(password).sendKeys(value);
	}

	public void selectCustomer() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(customer)));
		driver.findElement(customer).click();
	}

	public void enterEmail(String value) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(email)));
		driver.findElement(email).sendKeys(value);
	}

	public void enterCellPhone(String value) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(cellPhone)));
		driver.findElement(cellPhone).sendKeys(value);
	}

	public void selectRole(String value) {
		Select select = new Select(driver.findElement(By.xpath("//select[@name='RoleId']")));

		select.selectByValue(value);

	}

	public void save() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(customer)));
		driver.findElement(save).click();
	}

	public String getFirstRow() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(tableRow)));

		return driver.findElement(tableRow).getText();
	}

	public void clickDeleteButtonForUser(String username) {
		driver.findElement(By.xpath("//td[text()=" + "'"+ username + "'"+"]/ancestor::tr//button/i[@class='icon icon-remove']")).click();
		driver.findElement(By.xpath("//button[text()='OK']")).click();
	}

	public int verifyUserDeleted(String username) {
		List<WebElement> ele = new ArrayList<>();
		ele = driver.findElements(By.xpath("//td[text()="+ "'"+ username + "'"+"]"));
		System.out.println(ele.size());
		int size=ele.size();
		return size;
		
	}

}