package org.demoo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Lenox{
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='gor-navigation pull-left gor-menu-container v2-hmaburger-menu-container']")
	private WebElement search;
	@FindBy(xpath="//a[text()='Sales Tools']")
	private WebElement sales;
	@FindBy(xpath="//a[text()='Build a Proposal']")
	private WebElement build;
	@FindAll({
	@FindBy(xpath="(//a[@class='button button-default create-lead-btn'])[2]"),
	@FindBy(xpath="//a[text()='SELECT LEAD']")
	
	})
	private WebElement lead;
	public WebElement getLead() {
		return lead;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getSales() {
		return sales;
	}
	public WebElement getBuild() {
		return build;
	}

}
