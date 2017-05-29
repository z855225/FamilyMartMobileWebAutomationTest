package FamilyMartiOSMwebTestSuite.pages;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class HomePage {
	
	public static Map<String, String> homePageElementHash() {
		Map<String, String> element = new HashMap<String, String>();
		element.put("officialRecommendButtonLinkText", "人氣推薦");
		return element;
	}
	
	public static void goToOfficialRecommendPage(IOSDriver<MobileElement> driver) throws InterruptedException {
		Map<String, String> element = homePageElementHash();
		driver.findElement(By.linkText(element.get("officialRecommendButtonLinkText"))).click();
	}

}
