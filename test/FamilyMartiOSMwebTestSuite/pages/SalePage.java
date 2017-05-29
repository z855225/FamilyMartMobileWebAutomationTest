package FamilyMartiOSMwebTestSuite.pages;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class SalePage {
	
	public static Map<String, String> salePageElementHash() {
		Map<String, String> element = new HashMap<String, String>();
		element.put("immediatelyBuyButtonXpath", "//*[@id='SalePageIndexController']/div/section[6]/div/button[2]");
		return element;
	}
	
	public static void immediatelyBuy(IOSDriver<MobileElement> driver) throws InterruptedException {
		Map<String, String> element = salePageElementHash();
		driver.findElement(By.xpath(element.get("immediatelyBuyButtonXpath"))).click();
	}

}
