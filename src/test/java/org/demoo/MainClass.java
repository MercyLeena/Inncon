package org.demoo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MainClass extends Lenox{
	@BeforeClass
	public static void browser(){
	launch("webdriver.chrome.driver", "C:\\Users\\Navin Vishal M\\Downloads\\Abara's\\eclipse\\configuration\\LenoxUsingData\\driver\\chromedriver.exe");
	url("https://www.liidaveqa.com/");
	max();		
	}
	@Test
	public void sign() throws IOException, InterruptedException {
		
		Pojo pj= new Pojo();
		clk(pj.getSignin());
		time();
		tshot("C:\\Users\\Navin Vishal M\\Downloads\\Abara's\\eclipse\\configuration\\LenoxUsingData\\Shoot\\shoot.png");
		SignInPage s=new SignInPage();
		type(s.getUser(),excel(0, 0));
		type(s.getPwd(),excel(1, 0));
		tshot("C:\\Users\\Navin Vishal M\\Downloads\\Abara's\\eclipse\\configuration\\LenoxUsingData\\Shoot\\shoot1.png");
		clk(s.getSignclk());
		time();
		HomePage h=new HomePage();
		clk(h.getSearch());
		tshot("C:\\Users\\Navin Vishal M\\Downloads\\Abara's\\eclipse\\configuration\\LenoxUsingData\\Shoot\\shoot2.png");
		clk(h.getSales());
	tshot("C:\\Users\\Navin Vishal M\\Downloads\\Abara's\\eclipse\\configuration\\LenoxUsingData\\Shoot\\shoot3.png");
		clk(h.getBuild());
		tshot("C:\\Users\\Navin Vishal M\\Downloads\\Abara's\\eclipse\\configuration\\LenoxUsingData\\Shoot\\shoot4.png");
		jsclk(h.getLead());
		AddLead ad=new AddLead();
		clk(ad.getAdd());
		DetailsPage dd=new DetailsPage();
		tshot("C:\\Users\\Navin Vishal M\\Downloads\\Abara's\\\\eclipse\\configuration\\LenoxUsingData\\Shoot\\shoot5.png");
		type(dd.getFrst(),excel(0, 2));
		type(dd.getLst(),excel(1,2));
		type(dd.getEmail(),excel(2,2));
		type(dd.getPhn(),excel(3, 2));
		tshot("C:\\Users\\Navin Vishal M\\Downloads\\Abara's\\\\eclipse\\configuration\\LenoxUsingData\\Shoot\\shoot6.png");
			sele(dd.getState(),"AK");
		clk(dd.getDate1());
		clk(dd.getDate11());
		clk(dd.getDate2());
		clk(dd.getDate22());
		tshot("C:\\Users\\Navin Vishal M\\Downloads\\Abara's\\eclipse\\configuration\\LenoxUsingData\\Shoot\\shoot7.png");
		clk(dd.getDoc());
			AddDocImg adi=new AddDocImg();
				sele(adi.getDocument(), "SIGNED PROPOSAL");
	//	jsclk(adi.getAdddocument());
		//adi.getAdddocument().sendKeys("C:\\Users\\Navin Vishal M\\Downloads\\Informatica Tutorial");
		//clk(dd.getImg());
		clk(dd.getSave());
				tshot("C:\\Users\\Navin Vishal M\\Downloads\\Abara's\\eclipse\\configuration\\LenoxUsingData\\Shoot\\shootlast1.png");
	NewUser nw=new NewUser();
	clk(nw.getName());
	clk(nw.getLogout());
	}
	@Test
	private void sign1() throws IOException {
		Pojo pj= new Pojo();
		clk(pj.getSignin());
		time();
		SignInPage s=new SignInPage();
		type(s.getUser(),excel(0, 0));
		type(s.getPwd(),excel(1, 0));
		clk(s.getSignclk());
		time();
		HomePage h=new HomePage();
		clk(h.getSearch());
		clk(h.getSales());
		clk(h.getBuild());
		jsclk(h.getLead());
		AddLead ad=new AddLead();
		clk(ad.getAdd());
		DetailsPage dd=new DetailsPage();
				type(dd.getFrst(),excel(0, 4));
		type(dd.getLst(),excel(1,4));
		type(dd.getEmail(),excel(2,4));
		type(dd.getPhn(),excel(3, 4));
		sele(dd.getState(),"AK");
		clk(dd.getDate1());
		clk(dd.getDate11());
		clk(dd.getDate2());
		clk(dd.getDate22());
		clk(dd.getDoc());
		AddDocImg adi=new AddDocImg();
			sele(adi.getDocument(), "SIGNED PROPOSAL");
			clk(dd.getSave());
			tshot("C:\\Users\\Navin Vishal M\\Downloads\\Abara's\\eclipse\\configuration\\LenoxUsingData\\shoot2\\shoot2.png");
			NewUser nw=new NewUser();
			clk(nw.getName());
			clk(nw.getLogout());

	}
	@Test
	private void sign3() throws IOException {
		Pojo pj= new Pojo();
		clk(pj.getSignin());
		time();
		SignInPage s=new SignInPage();
		type(s.getUser(),excel(0, 0));
		type(s.getPwd(),excel(1, 0));
		clk(s.getSignclk());
		time();
		HomePage h=new HomePage();
		clk(h.getSearch());
		clk(h.getSales());
		clk(h.getBuild());
		jsclk(h.getLead());
		AddLead ad=new AddLead();
		clk(ad.getAdd());
		DetailsPage dd=new DetailsPage();
				type(dd.getFrst(),excel(0, 6));
		type(dd.getLst(),excel(1,6));
		type(dd.getEmail(),excel(2,6));
		type(dd.getPhn(),excel(3, 6));
		sele(dd.getState(),"AK");
		clk(dd.getDate1());
		clk(dd.getDate11());
		clk(dd.getDate2());
		clk(dd.getDate22());
		clk(dd.getDoc());
		AddDocImg adi=new AddDocImg();
			sele(adi.getDocument(), "SIGNED PROPOSAL");
			clk(dd.getSave());
			tshot("C:\\Users\\Navin Vishal M\\Downloads\\Abara's\\eclipse\\configuration\\LenoxUsingData\\shoot3\\shoot3.png");
			NewUser nw=new NewUser();
			clk(nw.getName());
			clk(nw.getLogout());
		

	}
	
	
	@AfterClass
	private void quit() {
		driver.quit();

	}
	
}
