package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBoxPage {
WebDriver driver;

public TextBoxPage(WebDriver driver)
{
	this.driver=driver;
}

By fullname=By.id("userName");
By email=By.id("userEmail");
By Caddress=By.id("currentAddress");
By Paddress=By.id("permanentAddress");
By submit=By.id("submit");
By outputname=By.id("name");

public void enterFullname(String name)
{
	driver.findElement(fullname).sendKeys(name);
}

public void enterEmail(String mailid)
{
	driver.findElement(email).sendKeys(mailid);
}

public void enterCaddress(String cadd)
{
	driver.findElement(Caddress).sendKeys(cadd);
}

public void enterPaddress(String padd)
{
	driver.findElement(Paddress).sendKeys(padd);
}

public void clickSubmit()
{
	driver.findElement(submit).click();
}
public String oname()
{
	return driver.findElement(outputname).getText();
}



}
																																																																																																																																																																																																																																																																																																																																			