package FamilyMartiOSMwebTestSuite;

import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import FamilyMartiOSMwebTestSuite.common.Actions;
import FamilyMartiOSMwebTestSuite.pages.*;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class iOSMwebCheckoutTest {
	
	public static IOSDriver<MobileElement> driver;
	  public static ExtentReports report;
	  public static ExtentTest test;

	  @BeforeTest
	  public void beforeTest() throws MalformedURLException {

	      report = new ExtentReports("/Users/River_Lin/Documents/workspace/testreport/FamilyMartiOSMwebReport.html", false);
	      test = report.startTest("Checkout Test", "首頁 > 人氣推薦商品 > 第一個產品 > 立即結帳 > 選取超商取貨付款 > 填寫資料，並選取任一個門市");
	    
	      DesiredCapabilities capabilities = new DesiredCapabilities();
		  capabilities.setCapability("platformName", "iOS");
		  capabilities.setCapability("platformVersion", "10.3");
		  capabilities.setCapability("deviceName", "iPhone 7");
		  //capabilities.setCapability("deviceName", "River iPhone");
		  //capabilities.setCapability("udid", "Your UDID");
		  capabilities.setCapability("autoWebview", "true");
		  capabilities.setCapability("browserName", "Safari");
	      driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	      
	      

	  }
		  
	  @Test
	  public void checkout() throws InterruptedException {
	      try {
	    	  
	    	   
	    	  
	    	    driver.get("http://mart.family.com.tw");
	    	  
	    	    HomePage.goToOfficialRecommendPage(driver);
		    	
		    	OfficialRecommendPage.goToTop1SalePage(driver);
		    	
		    	SalePage.immediatelyBuy(driver);
		    	
		    	LoginPage.login(driver, "account", "password");
		    	
		    	ShoppingCartConfirmPage.goToPaymentAndShipmentPage(driver);
		    	
		    	PaymentAndShipmentPage.selectPayAtStore(driver);
		    	PaymentAndShipmentPage.selectShipToFamilyMart(driver);
		    	PaymentAndShipmentPage.goToPaymentInfoPage(driver);
		    	PaymentInfoPage.enterName(driver, "林老師");
		    	PaymentInfoPage.enterPhoneNumber(driver, "0912345678");
		    	PaymentInfoPage.selectStore(driver);
		    	
		    	FamilyMartStorePage.selectStoreByStreet(driver);
		    	
		    	PaymentInfoPage.enterEmail(driver, "rivertest62@gmail.com");
		    	
		    	
		    	test.log(LogStatus.PASS, "The Test Result: PASS");
		        Thread.sleep(1000);
		        String fileDir = Actions.takeScreenShot(driver);
			    test.log(LogStatus.INFO, "image: " +  test.addScreenCapture(fileDir));
	 	  
	      }
	      
	      catch(Exception e) {
	    	  System.out.println("error tset");
	    	  test.log(LogStatus.FAIL, e.getMessage());
	    	  String fileDir = Actions.takeScreenShot(driver);
	    	  test.log(LogStatus.INFO, "error image: " +  test.addScreenCapture(fileDir));	    	 
	      }
		  
	  }

	  @AfterTest
	  public void afterTest() {
		  report.endTest(test);
		  report.flush();
		  report.close();
	      driver.quit();
	  }

}
