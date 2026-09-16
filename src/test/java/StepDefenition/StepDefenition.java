package StepDefenition;

import java.net.MalformedURLException;

import org.junit.Assert;

import Appium.BaseClass;
import Appium.PomClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefenition extends BaseClass {
	PomClass pc = new PomClass(driver);

	@Given("the swag labs application launched")
	public void the_swag_labs_application_launched() throws MalformedURLException {
		// BrowserLaunch();
	}

	@When("the user enter username {string}")
	public void the_user_enter_username(String string) {
		sendKeys(pc.username, string);
	}

	@When("the user enter password {string}")
	public void the_user_enter_password(String string) {
		sendKeys(pc.password, string);

	}

	@When("the user click on login button")
	public void the_user_click_on_login_button() {
		click(pc.loginbtn);

	}

	@Then("the user redirected the home page {string}")
	public void the_user_redirected_the_home_page(String HomePage) {

		switch (HomePage) {
		case "invalidcre":

			String actual = gettext(pc.invalidCre);
			Assert.assertEquals("Username and password do not match any user in this service.".trim(), actual);
			System.out.println(actual);

			break;
		case "emptyuser":
			String actual1 = gettext(pc.emptyUser);
			Assert.assertEquals("Username is required", actual1);
			System.out.println(pc.emptyUser);
			break;
		case "emptypass":
			String actual2 = gettext(pc.emptypass);
			Assert.assertEquals("Password is required", actual2);
			System.out.println(pc.emptypass);
			break;
		case "valid":
			String actual3 = gettext(pc.swagLabs);
			Assert.assertEquals("PRODUCTS", actual3);
			System.out.println(actual3);
			break;
		}

	}

	@Given("the user click on sort button")
	public void the_user_click_on_sort_button() {
		click(pc.sort);
	}

	@When("the user click on price high to low")
	public void the_user_click_on_price_high_to_low() {
		click(pc.rangeClick);
	}

	@Then("the user should be validtate the price")
	public void the_user_should_be_validtate_the_price() {
		String actual = gettext(pc.price);
		Assert.assertEquals("$49.99", actual);
		System.out.println(actual);
	}

	@Given("the user click on add to cart button")
	public void the_user_click_on_add_to_cart_button() {
		click(pc.addtocart);
	}

	@When("the user click on cart button")
	public void the_user_click_on_cart_button() {
		click(pc.cart);
	}

	@Then("the user should be validate the cart page")
	public void the_user_should_be_validate_the_cart_page() {
		String actual = gettext(pc.cartPage);
		Assert.assertEquals("YOUR CART", actual);
		System.out.println(actual);
	}

	@Given("the user click on checkout button")
	public void the_user_click_on_checkout_button() {
		// ScrollDown();
		scrollToElementByText("CHECKOUT");
		click(pc.checkout);
	}

	@Then("the user validate the checkoutpage")
	public void the_user_validate_the_checkoutpage() {
		Assert.assertTrue(pc.checkoutPage.isDisplayed());
	}

	@Given("the user enter firstName {string}")
	public void the_user_enter_first_name(String string) {
		sendKeys(pc.firstname, string);
	}

	@When("the user enter LastName {string}")
	public void the_user_enter_last_name(String string) {
		sendKeys(pc.lastname, string);
	}

	@When("the user enter Zipcode {string}")
	public void the_user_enter_zipcode(String string) {
		sendKeys(pc.zipcode, string);
	}

	@When("the user clikc on continue button")
	public void the_user_clikc_on_continue_button() {
		click(pc.contine);
	}

	@Then("the user should be validate the checkout page")
	public void the_user_should_be_validate_the_checkout_page() {
		String actual = gettext(pc.checkOverview);
		Assert.assertEquals("CHECKOUT: OVERVIEW", actual);
		System.out.println(actual);
	}

	@Then("the user click on finish button")
	public void the_user_click_on_finish_button() {
		scrollToElementByText("FINISH");
		click(pc.finish);
	}

	@Then("the user should be validate the complete order")
	public void the_user_should_be_validate_the_complete_order() {
		String actual = gettext(pc.complete);
		Assert.assertTrue(actual.contains("THANK YOU FOR"));
		System.out.println(actual);
	}

	@Then("the user click on back to home")
	public void the_user_click_on_back_to_home() {
		scrollToElementByText("BACK HOME");
		click(pc.home);
	}

	@Given("the user click on grid")
	public void the_user_click_on_grid() {
		click(pc.grid);
	}

	@When("validate the grid page")
	public void validate_the_grid_page() {
		String actual = gettext(pc.gridPage);
		Assert.assertTrue(actual.contains("Sauce Labs Backpack"));
		System.out.println(actual);
	}

	@When("the user click on addtocart btn")
	public void the_user_click_on_addtocart_btn() {
		click(pc.tocart);
	}

	@When("the user click on cart btn")
	public void the_user_click_on_cart_btn() {
		click(pc.cart);
	}

	@When("the user validate the cart page")
	public void the_user_validate_the_cart_page() {
		String actual = gettext(pc.cartPage);
		Assert.assertEquals("YOUR CART", actual);
		System.out.println(actual);

	}

	@When("the user click on checkout btn")
	public void the_user_click_on_checkout_btn() {
		scrollToElementByText("CHECKOUT");
		click(pc.checkout);
	}

	@When("the user enter firstname {string}")
	public void the_user_enter_firstname(String string) {
		sendKeys(pc.firstname, string);
	}

	@When("the user enter Lastname {string}")
	public void the_user_enter_lastname(String string) {
		sendKeys(pc.lastname, string);
	}

	@When("the user enter pincode {string}")
	public void the_user_enter_pincode(String string) {
		sendKeys(pc.zipcode, string);
	}

	@When("the user click on continue btn")
	public void the_user_click_on_continue_btn() {
		click(pc.contine);
	}

	@When("the  user should see validate the checkout page")
	public void the_user_should_see_validate_the_checkout_page() {
		String actual = gettext(pc.checkOverview);
		Assert.assertEquals("CHECKOUT: OVERVIEW", actual);
		System.out.println(actual);
	}

	@When("the user click on finish btn")
	public void the_user_click_on_finish_btn() {
		scrollToElementByText("FINISH");
		click(pc.finish);
	}

	@Then("the user should  validate the complete order")
	public void the_user_should_validate_the_complete_order() {
		String actual = gettext(pc.complete);
		Assert.assertTrue(actual.contains("THANK YOU FOR"));
		System.out.println(actual);
	}

	@Then("the user should click on back to home")
	public void the_user_should_click_on_back_to_home() {
		scrollToElementByText("BACK HOME");
		click(pc.home);
	}

	@Given("the user click on menu button")
	public void the_user_click_on_menu_button() {
		click(pc.menu);
	}

	@When("the user click on all items")
	public void the_user_click_on_all_items() {
		click(pc.allitems);
	}

	@When("the user should be validate the items")
	public void the_user_should_be_validate_the_items() {
		String actual = gettext(pc.itemsvalid);
		Assert.assertTrue(actual.contains("Sauce Labs Backpack"));
	}

	@When("the user click on cart butn")
	public void the_user_click_on_cart_butn() {
		click(pc.itemcart);
	}

	@When("the user click on menu")
	public void the_user_click_on_menu() {
		click(pc.menu);
	}

	@When("the user click on webview")
	public void the_user_click_on_webview() {
		click(pc.webview);
	}

	@When("the user enter url {string}")
	public void the_user_enter_url(String string) {
		sendKeys(pc.url, string);
	}

	@When("the user click on go to site")
	public void the_user_click_on_go_to_site() {
		click(pc.gotosite);
	}

	@When("the user validate the webpage")
	public void the_user_validate_the_webpage() {
		Assert.assertTrue(pc.urlvalid);
	}

	@When("the user click on Qr code scanner")
	public void the_user_click_on_qr_code_scanner() {
		click(pc.qrcode);
	}

	@When("the user click on geo location")
	public void the_user_click_on_geo_location() {
		click(pc.geolocation);
	}

	@When("the user validate the geo location page")
	public void the_user_validate_the_geo_location_page() {
		String actual = gettext(pc.geo);
		Assert.assertEquals("GEO LOCATION", actual);
	}

}
