package com.testcases;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.base.TestBase;
import com.pages.telaDocPage;
public class telaDocTests extends TestBase {

	public telaDocPage teleDocPage = new telaDocPage();
	public String filepath = System.getProperty("user.dir");
	
	@BeforeClass
	public void initialization() {
		TestBase.init("Chrome");
		teleDocPage.gotToURL();
	}

	@Test
	public void addUserTest() throws Exception {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		teleDocPage.clickOnAddUser();
		teleDocPage.enterFirstName("test_shireesha");
		teleDocPage.enterLastName("test_shireesha");
		teleDocPage.enterUserName("test_shireesha");
		teleDocPage.enterPassword("test_shireesha");
		teleDocPage.selectCustomer();
		teleDocPage.selectRole("1");
		teleDocPage.enterEmail("test_shireesha@gmail.com");
		teleDocPage.enterCellPhone("99900990090");
		teleDocPage.save();
		
		String value =teleDocPage.getFirstRow();
		Assert.assertEquals(value, "test_shireesha");
					
	}
	
	@Test
	public void deleteUserTest() {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		teleDocPage.clickDeleteButtonForUser("Novak");
		int value = teleDocPage.verifyUserDeleted("Novak");
		Assert.assertEquals(value, 0);
	}
	
	@AfterTest
	public void quit() {
		TestBase.driver.quit();
	}

}