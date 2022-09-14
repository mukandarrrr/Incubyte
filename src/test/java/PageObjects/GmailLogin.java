package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLogin {
	
	WebDriverWait wait;
	public WebDriver ldriver;

	public GmailLogin(WebDriver rdriver) {
	ldriver = rdriver;
	PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "identifierId")
	WebElement tx_username;

	@FindBy(xpath = "//*[@id=\"identifierNext\"]/div/button")
	WebElement next;

	@FindBy(xpath = "(//*[@class=\"whsOnd zHQkBf\"])[1]")
	WebElement pwd;

	@FindBy(xpath = "//*[@id=\"passwordNext\"]/div/button")
	WebElement next1;

	@FindBy(xpath = "//div[contains(text(),'Compose')]")
	WebElement compose;

	@FindBy(xpath = "//input[contains(@class,'agP aFw')]")
	WebElement toInput;

	@FindBy(xpath = "//input[contains(@class,'aoT')]")
	WebElement subjectText;

	@FindBy(xpath = "//div[contains(@class,'Am Al editable LW-avf tS-tW')]")
	WebElement bodyTextElement;

	@FindBy(id = ":or")
	WebElement sendBtn;

	public void UserName(String username) throws InterruptedException {
	Thread.sleep(2000);
	tx_username.sendKeys(username);

	}

	public void ClickOnButton() throws InterruptedException {
	Thread.sleep(2000);
	next.click();
	}

	public void Password(String Password) throws InterruptedException {
	Thread.sleep(2000);
	pwd.sendKeys(Password);
	}

	public void ClickButton() throws InterruptedException {
	Thread.sleep(2000);
	next1.click();
	}

	public void Compose() throws InterruptedException {
	Thread.sleep(2000);
	compose.click();
	}

	public void Recipient(String receipent) throws InterruptedException {
	Thread.sleep(2000);
	toInput.sendKeys(receipent);
	}

	public void Subject(String subject) throws InterruptedException {
	Thread.sleep(2000);
	subjectText.sendKeys(subject);
	}

	public void Body(String body) throws InterruptedException {
	Thread.sleep(2000);
	bodyTextElement.sendKeys(body);
	}

	public void SendButton() throws InterruptedException {
	Thread.sleep(2000);
	sendBtn.click();
	}
	
	
	}
	
	
	
	
	
	


