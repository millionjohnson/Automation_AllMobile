package mobileworld;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;





public class signin {
@Test
public void sign() throws InterruptedException {
    
     System.setProperty("webdriver.chrome.driver","C:\\Users\\million.johnson\\Downloads\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         
         //driver.get(" https://mobileworld.banyanpro.com/");
         driver.manage().window().maximize();
         LandingPage landingpage = new LandingPage(driver);
         landingpage.goTo();
         landingpage.signinapplication("Million","MJ711");Thread.sleep(1000);
         landingpage.signinapplication("mj", "mj789");
          
       
    }
}
	