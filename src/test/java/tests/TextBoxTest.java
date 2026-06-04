package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.TextBoxPage;

public class TextBoxTest extends BaseTest{

	@Test
	public void verifyValidFormSubmission()
	{
		TextBoxPage page=new TextBoxPage(driver);
		page.enterFullname("Umamaheshwari");
		page.enterEmail("umasudarsan95@gmail.com");
		page.enterCaddress("A block A1");
		page.enterPaddress("A Block A1");
		page.clickSubmit();
		Assert.assertEquals(page.oname(), "Name:Umamaheshwari");
	}
}
	