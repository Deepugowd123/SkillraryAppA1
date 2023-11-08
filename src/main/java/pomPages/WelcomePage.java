package pomPages;


public class WelcomePage {

	//declaration

	@FindBy(xpath = "//a[@class='navbar-brand']")
	private WebElement logo;
	
	@FindBy(xpath ="//a[text()='LOGIN'}")
	private WebElement loginButton;
	
	//Initialization
	
	public WelcomePage(WebDriver driver) {
	  PageFactory.intiElements(driver,this);
		
	}
	//utilization
	
	public String getLogo() {
		return logo.getText();
	}
	public void clickLoginButton() {
		loginButton.click();
	}
	
	

}
