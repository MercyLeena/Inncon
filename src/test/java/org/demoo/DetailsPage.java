package org.demoo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsPage extends Lenox{
	public DetailsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="firstName")
	private WebElement frst;
	@FindBy(id="lastName")
	private WebElement lst;
	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="phNo")
	private WebElement phn;
	@FindBy(id="regionIso")
	private WebElement state;
	@FindBy(id="calender1")
	private WebElement date1;
	@FindBy(xpath="//a[text()='28']")
	private WebElement date11;
	@FindBy(id="calender2")
	private WebElement date2;
	@FindBy(xpath="//a[text()='31']")
	private WebElement date22;
	@FindBy(xpath="//p[text()='Add Document']")
	private WebElement doc;
	@FindBy(xpath="//p[text()='Choose image']")
	private WebElement img;
	@FindBy(xpath="//button[@id='btn-addLeadsForm']")
	private WebElement save;

	public WebElement getFrst() {
		return frst;
	}
	public WebElement getLst() {
		return lst;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPhn() {
		return phn;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getDate1() {
		return date1;
	}
	public WebElement getDate11() {
		return date11;
	}
	public WebElement getDate2() {
		return date2;
	}
	public WebElement getDate22() {
		return date22;
	}
	public WebElement getDoc() {
		return doc;
	}
	public WebElement getImg() {
		return img;
	}
	public WebElement getSave() {
		return save;
	}
}
