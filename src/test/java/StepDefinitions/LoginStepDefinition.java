package StepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	}

	@Given("^The brower is launched$")
	public void the_brower_is_launched() {
		driver = new ChromeDriver();

	}

	@Given("^The Apllication is loaded$")
	public void The_apllication_is_loaded() {
		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
	}

	@When("^The user Enters the valid user name$")
	public void The_user_enters_the_valid_user_name() throws Throwable {
		driver.findElement(By.id("ap_email")).sendKeys("kanuparthichandrasekharreddy7@gmail.com");
		Thread.sleep(4000);
	}

	@When("The user click on continue button")
	public void the_user_click_on_continue_button() throws InterruptedException {
		driver.findElement(By.id("continue")).click();
		Thread.sleep(4000);
	}

	@When("^The user Enter the valid password$")
	public void The_user_enter_the_valid_password() throws InterruptedException {
		driver.findElement(By.id("ap_password")).sendKeys("9966051900");
	}

	@When("^The user Click on Login button$")
	public void The_user_click_on_login_button() {
		driver.findElement(By.id("signInSubmit")).click();

	}

	@Then("^Dashbord will Display$")
	public void Dashbord_will_display() throws InterruptedException {
		String HomePage = driver.findElement(By.xpath("//h2[text()='Top picks for you']")).getText();
		System.out.println("Welcome to home page :" + HomePage);
	}

	@When("user search the product")
	public void user_search_the_product() throws InterruptedException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		Thread.sleep(4000);
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

	@When("select a product to purchess")
	public void select_a_product_to_purchess() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,3000)");
		

		String product = "Apple iPhone 12 (64GB) - Green";
		driver.findElement(By.xpath("(//div[@aria-label='" + product.toLowerCase() + "'])[1]")).click();
		
	//	driver.findElement(By.linkText("Apple iPhone 12 (64GB) - Green")).click();
		Thread.sleep(2000);
		Set<String> childWindow = driver.getWindowHandles();
		System.out.println("child window id:" + childWindow);
		Thread.sleep(4000);
		// driver.switchTo().window("[CDwindow-18D09AC8B7DB9EF5E5CD3BE8B7AB41EA]");
	}

	@When("add the product into cart")
	public void add_the_product_into_cart() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(3000);
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String eachHandle : allWindows) {
			if (!eachHandle.equals(parentWindow)) {
				driver.switchTo().window(eachHandle);
			}
		}
		WebElement element = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
		jse.executeScript("arguments[0].scrollIntoView();", element);
		Thread.sleep(2000);// Please correct it
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-checkout-button\"]/span/input")).click();
		Thread.sleep(3000);
		driver.switchTo().window(parentWindow);
	}

	@When("add address to delivery the iphone")
	public void add_address_to_delivery_the_iphone() throws InterruptedException {
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent window:" + parentWindow);
		Thread.sleep(3000);
		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[3]/div[1]/a/div/div/div/div[2]/h2")).click();
		driver.findElement(By.xpath("//h2[text()='Add address']")).click();
		driver.findElement(By.id("address-ui-widgets-enterAddressFullName")).sendKeys("TRUGlobal");
		Thread.sleep(3000);
		driver.findElement(By.id("address-ui-widgets-enterAddressPhoneNumber")).sendKeys("9988776655");
		Thread.sleep(3000);
		driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("address-ui-widgets-enterAddressPostalCode")).sendKeys("560059");
		Thread.sleep(3000);
		driver.findElement(By.id("address-ui-widgets-enterAddressLine1")).sendKeys("108");
		Thread.sleep(3000);
		driver.findElement(By.id("address-ui-widgets-enterAddressLine2")).sendKeys("Trinity metro");
		Thread.sleep(3000);
		driver.findElement(By.id("address-ui-widgets-landmark")).sendKeys("Happy Goaa");
		driver.findElement(By.id("address-ui-widgets-enterAddressCity")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("address-ui-widgets-enterAddressCity")).sendKeys("Bangalore");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1500)");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		Thread.sleep(3000);

	}
}
