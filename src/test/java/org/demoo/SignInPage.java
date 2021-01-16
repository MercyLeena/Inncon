package org.demoo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends Lenox{
	public  SignInPage() {
			
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="j_username")
	private WebElement user;
	@FindBy(id="j_password")
	private WebElement pwd;
	@FindBy(id="loginSubmit")
	private WebElement signclk;
	public WebElement getUser() {
		return user;
	}
	public WebElement getPwd() {
		return pwd;
	}
	public WebElement getSignclk() {
		return signclk;
	}
	

}
