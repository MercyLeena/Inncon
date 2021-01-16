package org.demoo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddLead extends Lenox{
	public AddLead() {
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getAdd() {
		return add;
	}
	@FindBy(xpath="//a[@class='btn btn-primary hide-mobile introjs-l-9 introjs-l-83']")
	private WebElement add;

}
