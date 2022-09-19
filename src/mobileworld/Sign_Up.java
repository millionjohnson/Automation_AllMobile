
	package mobileworld;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;




	public class Sign_Up {
	    @Test
	    
	    public static void sign() throws InterruptedException {
	        // TODO Auto-generated method stub
	         System.setProperty("webdriver.chrome.driver","C:\\Users\\million.johnson\\Downloads\\chromedriver_win32\\chromedriver.exe");
	         WebDriver driver = new ChromeDriver();
	         driver.manage().window().maximize();
	         
	         LandingPage landingpage = new LandingPage(driver);
	         landingpage.goTo();
	       
	     
	         landingpage.signupapplication("Million","Johnson","millionjohnson88@gmail.com","million777" ,"07/11/2000","8453984539","hey!!");Thread.sleep(3000);
	        
	    }
	       
	}




	


