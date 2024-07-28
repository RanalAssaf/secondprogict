import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import POM.selectors;
import configreader9.configreadcode;
import controller.methods;

public class maintest {

	public static void main(String[] args) throws InterruptedException {
		int num;
        Random random=new Random();
        num=random.nextInt(1000);
        
        String[] st={"reeem","shaima","qaisi","jska","rere","soso"};
        Random random1=new Random();
        int randomIndex = random1.nextInt(st.length);
        
        
        String[] mname={"mohmd","ahmd","asad","rami","fnfn","koko"};
        Random random2=new Random();
        int randomIndex2 = random2.nextInt(st.length);
        
        
        String[] lname={"kqk","safi","kmal","qdr","sami","gege"};
        Random random3=new Random();
        int randomIndex3 = random3.nextInt(st.length);
        

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    configreadcode crc=new configreadcode();
     	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
     	
     try {
     		 
		 driver.manage().window().maximize();
     	 driver.get(crc.geturl());
     	//wait.until(ExpectedConditions.visibilityOfElementLocated(methods.usernamesendkey(driver)));
     	 //Thread.sleep(5000);
     	selectors.log_wait(driver);
     	 //xpath_for_login_btn
     	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selectors.xpath_for_login_btn)));
        // wait.until(ExpectedConditions.invisibilityOfElementLocated(methods.usernamesendkey(driver,crc.getusername())));
         
     	methods.usernamesendkey(driver,crc.getusername());
         methods.passwordsendkey(driver,crc.getpassword());
         methods.loginclick(driver);
         Thread.sleep(5000);
         //Thread.sleep(5000);
        // selectors.log_wait(driver);
         methods.pimclick(driver);
         selectors.pim_wait(driver);
         //Thread.sleep(5000);
         selectors.add_wait(driver);
         methods.addnewempclick(driver);
         //Thread.sleep(10000);
         selectors.f_wait(driver);
         methods.fnamesendkey(driver,st[randomIndex]);
         System.out.println(st[randomIndex]);
         //selectors.f_wait(driver);
         methods.mnamesendkey(driver,mname[randomIndex2]);
         System.out.println(mname[randomIndex2]);
         methods.lnamesendkey(driver,lname[randomIndex3]);
         System.out.println(lname[randomIndex3]);
//         methods.idsendkey(driver,crc.getid());
          methods.idsendkey(driver,String.valueOf(num));
         System.out.println(String.valueOf(num));
         
         Thread.sleep(10000);
         selectors.save_wait(driver);
         methods.saveclick(driver);
         Thread.sleep(5000);
         selectors.list_wait(driver);
         methods.listclick(driver);
        // Thread.sleep(10000);
         selectors.search_wait(driver);
         methods.searchsendkey(driver,st[randomIndex],mname[randomIndex2],lname[randomIndex3]);
         selectors.search_wait(driver);
         //Thread.sleep(5000);
         selectors.bsearch_wait(driver);
         methods.bsearchclick(driver);
         //Thread.sleep(5000);
         selectors.R_wait(driver);
         String Found=methods.RecordFoundclick(driver);
         if(!(Found.contains("(0)") || Found.contains("No"))) {
     		System.out.println("Passed");
     	 }
     	 else {
     		System.out.println("Failed");
     	 }
         selectors.R_wait(driver);

     	 //Thread.sleep(5000);
     	 selectors.h_wait(driver);
     	 methods.homeclick(driver);
     	 //Thread.sleep(5000);
     	 selectors.l_wait(driver);
     	 methods.lclick(driver);
     	 //Thread.sleep(5000);
     	 selectors.lo_wait(driver);
     	 methods.logoutclick(driver);
     	 //Thread.sleep(5000);
     	 
     	 
     	 
     	} catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
	}

}
