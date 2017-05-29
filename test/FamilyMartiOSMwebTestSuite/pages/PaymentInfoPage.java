package FamilyMartiOSMwebTestSuite.pages;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class PaymentInfoPage {
	
	public static Map<String, String> paymentInfoPageElementHash() {
		Map<String, String> element = new HashMap<String, String>();
		element.put("nameFieldName", "fullname");
		element.put("phoneNumberFieldName", "cellphone");
		element.put("selectStoreButtonXpath", "//*[@id='payProcess']/div/div/form[1]/div/div/div[4]/div");
		element.put("emailFieldName", "Email");
		return element;
	}
	
	public static void enterName(IOSDriver<MobileElement> driver, String name) throws InterruptedException {
		Map<String, String> element = paymentInfoPageElementHash();
		driver.findElement(By.name(element.get("nameFieldName"))).clear();
		Thread.sleep(1000);
		driver.findElement(By.name(element.get("nameFieldName"))).sendKeys(name);
		Thread.sleep(2000);
	}
	
	public static void enterPhoneNumber(IOSDriver<MobileElement> driver, String phoneNumber) throws InterruptedException {
		Map<String, String> element = paymentInfoPageElementHash();
		driver.findElement(By.name(element.get("phoneNumberFieldName"))).clear();
		Thread.sleep(1000);
		driver.findElement(By.name(element.get("phoneNumberFieldName"))).sendKeys(phoneNumber);
		Thread.sleep(2000);
	}
	
	public static void selectStore(IOSDriver<MobileElement> driver) throws InterruptedException {
		Map<String, String> element = paymentInfoPageElementHash();
		driver.findElement(By.xpath(element.get("selectStoreButtonXpath"))).click();
		Thread.sleep(2000);
	}
	
	public static void enterEmail(IOSDriver<MobileElement> driver, String email) throws InterruptedException {
		Map<String, String> element = paymentInfoPageElementHash();
		driver.findElement(By.name(element.get("emailFieldName"))).clear();
		Thread.sleep(1000);
		driver.findElement(By.name(element.get("emailFieldName"))).sendKeys(email);
		Thread.sleep(2000);
	}

}
