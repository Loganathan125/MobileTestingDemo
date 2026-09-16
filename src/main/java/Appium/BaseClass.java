package Appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseClass {

	public static AndroidDriver driver;
	public static WebDriverWait wait;

	public static AndroidDriver BrowserLaunch() throws MalformedURLException {
		UiAutomator2Options opt = new UiAutomator2Options();
		opt.setPlatformName("Andriod");
		opt.setAutomationName("UiAutomator2");
		opt.setDeviceName("Pixel_Emulator");
		opt.setUdid("emulator-5554");
		// opt.setApp("C:\\saucelab\\Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
		opt.setAppPackage("com.swaglabsmobileapp");
		opt.setAppActivity("com.swaglabsmobileapp.MainActivity");
		URL url = new URL("http://127.0.0.1:4723");
		driver = new AndroidDriver(url, opt);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		System.out.println("Browser Launched");
		return driver;

		// standard_user
		// secret_sauce
	}

	public static void closeApp() {
		if (driver != null)
			driver.quit();
	}

	public void click(WebElement element) {
//		wait.until(ExpectedConditions.elementToBeClickable(element));
//		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();

	}

	public void sendKeys(WebElement element, String value) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(Keys.chord(Keys.CONTROL + "a"));
		element.sendKeys(Keys.chord(Keys.BACK_SPACE));
		element.sendKeys(value);
	}

	public String gettext(WebElement element) {
		// wait.until(ExpectedConditions.visibilityOf(element));
		return element.getText();

	}

	public void scrollDown() {
		try {
			// "direction: down" moves the content up to show items below
			driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
		} catch (Exception e) {
			System.err.println("Scroll failed: " + e.getMessage());
		}
	}

	public void ScrollDown() {
		driver.executeScript("mobile: scrollGesture",
				Map.of("left", 110, "top", 200, "width", 850, "height", 1300, "direction", "down", "percent",0.5));
		
	}
	public void scrollToElementByText(String text) {
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				
		       + ".scrollIntoView(new UiSelector().text(\"" + text + "\"))"));
		}
	public void jsClick(WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", element);
	

	}

}
