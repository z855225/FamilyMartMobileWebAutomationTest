package FamilyMartiOSMwebTestSuite.pages;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class OfficialRecommendPage {
	
	public static Map<String, String> hotSaleRankingPageElementHash() {
		Map<String, String> element = new HashMap<String, String>();
		element.put("Top1SaleItemXpath", "/html/body/div[2]/div[3]/div[2]/div[1]/div/section[2]/div/div/ul/li[1]/div/a/div");		return element;
	}
	
	public static void goToTop1SalePage(IOSDriver<MobileElement> driver) throws InterruptedException {
		Map<String, String> element = hotSaleRankingPageElementHash();
		driver.findElement(By.xpath(element.get("Top1SaleItemXpath"))).click();
		Thread.sleep(2000);
	}

}
