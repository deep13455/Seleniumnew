package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_definition {
	public WebDriver driver;

	@Given("open the application and enter the url")
	public void open_the_application_and_enter_the_url() {
		driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.facebook.com");
	}

	@When("enter the valid username and password and click on login button")
	public void enter_the_valid_username_and_password_and_click_on_login_button() {
		driver.findElement(By.name("email")).sendKeys("same same");
		driver.findElement(By.name("pass")).sendKeys("2551545");
		driver.findElement(By.name("login")).click();
	}

	@Then("Home page should be displayed")
	public void home_page_should_be_displayed() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Then("Verify the Title")
	public void verify_the_title() {
		System.out.println("Homepage is verified");
	}

}
