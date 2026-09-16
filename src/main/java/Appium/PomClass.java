package Appium;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en.And;

public class PomClass {

	public AndroidDriver driver;

	public PomClass(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
	}

	@AndroidFindBy(accessibility = "test-Username")
	public WebElement username;

	@AndroidFindBy(accessibility = "test-Password")
	public WebElement password;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"LOGIN\"]")
	public WebElement loginbtn;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PRODUCTS\"]")
	public WebElement swagLabs;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Username and password do not match any user in this service.\"]")
	public WebElement invalidCre;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Username is required\"]")
	public WebElement emptyUser;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Password is required\"]")
	public WebElement emptypass;

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Modal Selector Button\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")
	public WebElement sort;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Price (high to low)\"]")
	public WebElement rangeClick;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"test-Price\" and @text=\"$49.99\"]")
	public WebElement price;
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"ADD TO CART\"])[1]")
	public WebElement addtocart;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"1\"]")
	public WebElement cart;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"YOUR CART\")")
	public WebElement cartPage;
	
	@AndroidFindBy(accessibility = "test-CHECKOUT")
	public WebElement checkout;
	
	@AndroidFindBy(xpath    = "//android.widget.TextView[@text=\"CHECKOUT: INFORMATION\"]")
	public WebElement checkoutPage;
	
	@AndroidFindBy(accessibility = "test-First Name")
	public WebElement firstname;
	
	@AndroidFindBy(accessibility = "test-Last Name")
	public WebElement lastname;
	
	@AndroidFindBy(accessibility = "test-Zip/Postal Code")
	public WebElement zipcode;
	
	@AndroidFindBy(accessibility = "test-CONTINUE")
	public WebElement contine;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"CHECKOUT: OVERVIEW\"]")
	public WebElement checkOverview;
	
	@AndroidFindBy(accessibility = "test-FINISH")
	public WebElement finish;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"THANK YOU FOR YOU ORDER\"]")
	public WebElement complete;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"BACK HOME\"]")
	public WebElement home;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Toggle\"]/android.widget.ImageView")
	public WebElement grid;
	
	@AndroidFindBy(uiAutomator  = "new UiSelector().text(\"Sauce Labs Backpack\")")
	public WebElement gridPage;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"+\").instance(0)")
	public WebElement tocart;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Menu\"]/android.view.ViewGroup/android.widget.ImageView")
	public WebElement menu;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PRODUCTS\"]")
	public WebElement allitems;
	
	@AndroidFindBy(uiAutomator  = "new UiSelector().text(\"Sauce Labs Backpack\")")
	public WebElement itemsvalid;
	
	@AndroidFindBy(xpath = "new UiSelector().text(\"ADD TO CART\").instance(0)")
	public WebElement itemcart;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"WEBVIEW\")")
	public WebElement webview;
	
	@AndroidFindBy(accessibility = "test-enter a https url here...")
	public WebElement url;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"GO TO SITE\")")
	public WebElement gotosite;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout")
	public boolean urlvalid;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"QR CODE SCANNER\"]")
	public WebElement qrcode;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_one_time_button\"]")
	public WebElement onlythis;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"GEO LOCATION\"]")
	public WebElement geolocation;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_one_time_button\"]")
	public WebElement usingthisapp;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"GEO LOCATION\")")
	public WebElement geo;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
