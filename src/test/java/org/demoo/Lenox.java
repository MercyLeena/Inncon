package org.demoo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.internal.AbstractParallelWorker.Arguments;

public class Lenox {
	public static WebDriver driver;

	public static String name = "";

	public static WebDriver launch(String key, String value) {
		System.setProperty(key, value);
		driver = new ChromeDriver();
		return driver;
	}

	public static void url(String url) {
		driver.get(url);

	}

	public static void max() {
		driver.manage().window().maximize();

	}

	public static void time() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	public void webWait(WebElement element) {
		WebDriverWait wt=new WebDriverWait(driver,20);
		wt.until(ExpectedConditions.elementToBeSelected(element));

	}

	public static void clk(WebElement ele) {
		
			try {
				ele.click();
			} catch (Exception e) {
				ele.submit();
				
			}
			
		

	}
	public void sele(WebElement webbele,String text) {
		Select s=new Select(webbele);
		s.selectByVisibleText(text);

	}
	public void jsclk(WebElement eleref) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",eleref);

	}

	public static void type(WebElement web, String name) {

		web.sendKeys(name);

	}
	public void tshot(String link) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File ref=ts.getScreenshotAs(OutputType.FILE);
		File f=new File(link);
		FileUtils.copyFile(ref, f);
		
	}

	public static String excel(int i, int j) throws IOException {

		File f = new File(
				"C:\\Users\\Navin Vishal M\\Downloads\\Abara's\\eclipse\\configuration\\LenoxUsingData\\excel\\Book2.xlsx");
		FileInputStream fo = new FileInputStream(f);
		Workbook bk = new XSSFWorkbook(fo);
		Sheet s = bk.getSheet("data");
		Row r = s.getRow(i);
		Cell c = r.getCell(j);
		int typ = c.getCellType();
		if (typ == 1) {
			name = c.getStringCellValue();
		} else if (typ == 0) {
			DateUtil.isCellDateFormatted(c);
			Date dt = c.getDateCellValue();
			SimpleDateFormat date = new SimpleDateFormat("dd-mm-yyyy");
			name = date.format(dt);
		} else {
			double d = c.getNumericCellValue();
			long lo = (long) d;
			name = String.valueOf(lo);
		}
		return name;
		
	}

	
	}

