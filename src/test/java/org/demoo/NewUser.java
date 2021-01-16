package org.demoo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewUser extends Lenox {
	public NewUser() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[@class='signedin-user']")
	private WebElement name;
	@FindBy(id="logout_id")
	private WebElement logout;
	public WebElement getName() {
		return name;
	}
	public WebElement getLogout() {
		return logout;
	}
	

}
