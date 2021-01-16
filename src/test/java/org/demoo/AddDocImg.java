package org.demoo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddDocImg extends Lenox {
	public AddDocImg() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//select[@class='styled-select documents'])[2]")
	private WebElement document;
	@FindBy(xpath="//input[@id='multipleFileSelect-1']")
	private WebElement adddocument;
	@FindBy(className="close close-doc-upload")
	private WebElement close;
	
	public WebElement getAdddocument() {
		return adddocument;
	}

	public WebElement getDocument() {
		return document;
	}
	
	public WebElement getClose() {
		return close;
	}
}
