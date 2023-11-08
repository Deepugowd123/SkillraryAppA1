package pomPages;

public class LoginPage {
	

	//Declaration
	
	@FindBy(xpath = "//h3[text()='Login'}")
	private WebElement pageHeader;
	
	@FindBy(id ="email")
	private WebElement passwordTF;
	
	@FindBy(name ="login")
	private WebElement loginButton;
	
	//Initialization
	
	public LoginPage (WebDriver driver) {
		pageFactory.iniElements(driver,this);
	}
	
	//utilization
	
	public String getPageHeader() {
		return pageHeader.getText();
		
	}
	public void setEmail(String eamil) {
		emailTF.sendkeys(email);
	}
	public void setpassword(String passord) {
		passwordTF.sendkeys(password);
	}
	public void clickLogin() {
		loginButton.submit();
	}
	
		
		
	}
	
	
	
	

}
