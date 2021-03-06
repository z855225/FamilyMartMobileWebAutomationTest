package FamilyMartiOSMwebTestSuite.pages;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class ShoppingCartConfirmPage {
	
	public static Map<String, String> shoppingCartConfirmPageElementHash() {
		Map<String, String> element = new HashMap<String, String>();
		element.put("nextButtonClassName", "next-step-btn");
		return element;
	}
	
	public static void goToPaymentAndShipmentPage(IOSDriver<MobileElement> driver) throws InterruptedException {
		Map<String, String> element = shoppingCartConfirmPageElementHash();
		WebElement target = driver.findElement(By.className(element.get("nextButtonClassName")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", target);
		Thread.sleep(2000);
		
		driver.findElement(By.className(element.get("nextButtonClassName"))).click();
		Thread.sleep(2000);
	}

}
