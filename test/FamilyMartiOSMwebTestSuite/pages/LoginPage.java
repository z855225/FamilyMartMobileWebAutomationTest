package FamilyMartiOSMwebTestSuite.pages;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class LoginPage {
	
	public static Map<String, String> loginPageElementHash() {
		Map<String, String> element = new HashMap<String, String>();
		element.put("accountFieldXpath", "//*[@id='member']/div/form/div/div[1]/div[1]/div[1]/input");
		element.put("passwordFieldXpath", "//*[@id='member']/div/form/div/div[1]/div[2]/div[1]/ns-password-input/input");
		element.put("loginButtonName", "submit-btn");
		return element;
	}
	
	public static void login(IOSDriver<MobileElement> driver, String account, String password) throws InterruptedException {
		Map<String, String> element = loginPageElementHash();
		driver.findElement(By.xpath(element.get("accountFieldXpath"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(element.get("accountFieldXpath"))).sendKeys(account);
		
		driver.findElement(By.xpath(element.get("passwordFieldXpath"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(element.get("passwordFieldXpath"))).sendKeys(password);
		
		driver.findElement(By.name(element.get("loginButtonName"))).click();
		Thread.sleep(10000);
	}

}
