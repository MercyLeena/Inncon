package org.demoo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends Lenox{
	public Pojo() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@class='login-link btn NEEDS_AUTHENTICATION']")
	private WebElement signin;
	
	

	public WebElement getSignin() {
		return signin;
	}


}
