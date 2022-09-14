package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.GmailLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepDefinition {
	

	public WebDriver driver;
	public GmailLogin go;
	
	
	

@Given("User launch chrome browser")
public void user_launch_chrome_browser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	go = new GmailLogin(driver);
}

@When("User can open URL with {string}")
public void user_can_open_url_with(String url) {
	driver.get(url);
	driver.manage().window().maximize();
}

@When("User enters username as {string}")
public void user_enters_username_as(String username) throws InterruptedException {
	go.UserName(username);
}

@When("Click On Next button")
public void click_on_next_button() throws InterruptedException {
	go.ClickOnButton();
}

@When("User entrs password {string}")
public void user_entrs_password(String Password) throws InterruptedException {
	go.Password(Password);
}

@When("Click On Second page Next button")
public void click_on_second_page_next_button() throws InterruptedException {
	go.ClickButton();
}

@When("Click on Compose Button")
public void click_on_compose_button() throws InterruptedException {
	go.Compose();
	}

@When("Add receipent As {string}")
	public void add_receipent_as(String recepient) throws InterruptedException {
	go.Recipient(recepient);
}

@When("Write subject As {string}")
public void write_subject_as(String subject) throws InterruptedException {
	go.Subject(subject);
}

@When("Write body As {string}")
public void write_body_as(String body) throws InterruptedException {
	go.Body(body);
}

@Then("Mail Should be sended")
public void mail_should_be_sended1() throws InterruptedException {
	go.SendButton();
}



	


}
