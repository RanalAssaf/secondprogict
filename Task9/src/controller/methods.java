package controller;

import org.openqa.selenium.WebDriver;

import POM.selectors;

public class methods {
	

	public static void usernamesendkey(WebDriver driver,String r) throws InterruptedException {

		selectors.username(driver).sendKeys(r);

		}
	
	public static void passwordsendkey(WebDriver driver,String p) throws InterruptedException {

		selectors.password(driver).sendKeys(p);

		}
	
	public static void loginclick(WebDriver driver) throws InterruptedException {

		selectors.login(driver).click();

		}
	
	
	public static void pimclick(WebDriver driver) throws InterruptedException {

		selectors.pim(driver).click();

		}
	
	
	
	public static void addnewempclick(WebDriver driver) throws InterruptedException {

		selectors.addnewemp(driver).click();

		}
	
	
	public static void fnamesendkey(WebDriver driver,String f) throws InterruptedException {

		selectors.fname(driver).sendKeys(f);

		}
	
	
	public static void mnamesendkey(WebDriver driver,String m) throws InterruptedException {

		selectors.mname(driver).sendKeys(m);

		}
	
	
	public static void lnamesendkey(WebDriver driver,String l) throws InterruptedException {

		selectors.lname(driver).sendKeys(l);

		}
	
	
	public static void idsendkey(WebDriver driver,String i) throws InterruptedException {

		selectors.id(driver).clear();
		selectors.id(driver).sendKeys(i);

		}
	
	
	public static void saveclick(WebDriver driver) throws InterruptedException {

		selectors.save(driver).click();

		}
	
	
	public static void listclick(WebDriver driver) throws InterruptedException {

		selectors.list(driver).click();

		}
	
	
	public static void searchsendkey(WebDriver driver,String fn,String mn,String ln) throws InterruptedException {

		String fullname=fn+" "+mn+" "+ln;
		selectors.search(driver).sendKeys(fullname);

		}
	
	
	public static void bsearchclick(WebDriver driver) throws InterruptedException {

		selectors.bsearch(driver).click();

		}
	
	
	public static String RecordFoundclick(WebDriver driver) throws InterruptedException {

		return  selectors.RecordFound(driver).getText();

		}
	
	public static void homeclick(WebDriver driver) throws InterruptedException {

		selectors.home(driver).click();

		}
	
	
	public static void lclick(WebDriver driver) throws InterruptedException {

		selectors.l(driver).click();

		}
	
	
	public static void logoutclick(WebDriver driver) throws InterruptedException {

		selectors.logout(driver).click();

		}
}
