package POM;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selectors {
	//public static String xpath_for_login_btn = "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button";

	public static WebElement username(WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
	}
	
    public static WebElement password (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
	}
    
    public static WebElement login (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
    	//return driver.findElement(By.xpath(xpath_for_login_btn));
    }
    
    
    
    public static WebElement log_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")));
    }
    
    
    
    
    public static WebElement pim (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a"));
	}
    
    
    public static WebElement pim_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")));
    }


public static WebElement addnewemp (WebDriver driver) {
	
	return driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a"));
}


public static WebElement add_wait(WebDriver driver) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30)); // Timeout of 10 seconds
    return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")));
}

public static WebElement fname (WebDriver driver) {
	
	return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input"));
}

public static WebElement f_wait(WebDriver driver) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30)); // Timeout of 10 seconds
    return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input")));
}


public static WebElement mname (WebDriver driver) {
	
	return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input"));
}


public static WebElement lname (WebDriver driver) {
	
	return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input"));
}


public static WebElement id (WebDriver driver) {
	
	return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input"));
}



public static WebElement save (WebDriver driver) {
	
	return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
}


public static WebElement save_wait(WebDriver driver) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20)); // Timeout of 10 seconds
    return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")));
}


public static WebElement list (WebDriver driver) {
	
	return driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a"));
}



public static WebElement list_wait(WebDriver driver) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20)); // Timeout of 10 seconds
    return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a")));
}



public static WebElement search (WebDriver driver) {
	
	return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"));
}


public static WebElement search_wait(WebDriver driver) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20)); // Timeout of 10 seconds
    return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")));
}


public static WebElement bsearch (WebDriver driver) {
	
	return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"));
}

public static WebElement bsearch_wait(WebDriver driver) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20)); // Timeout of 10 seconds
    return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")));
}


public static WebElement RecordFound (WebDriver driver) {
	
	return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span"));
}


public static WebElement R_wait(WebDriver driver) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)); // Timeout of 10 seconds
    return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span")));
}



public static WebElement home (WebDriver driver) {
	
	return driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a/span"));
}


public static WebElement h_wait(WebDriver driver) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)); // Timeout of 10 seconds
    return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a/span")));
}


public static WebElement l (WebDriver driver) {
	
	return driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span"));
}


public static WebElement l_wait(WebDriver driver) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)); // Timeout of 10 seconds
    return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")));
}


public static WebElement logout (WebDriver driver) {
	
	return driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a"));
}


public static WebElement lo_wait(WebDriver driver) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)); // Timeout of 10 seconds
    return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")));
}


 

}
