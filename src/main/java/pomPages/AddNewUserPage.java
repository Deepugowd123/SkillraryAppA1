package pomPages;


public class AddNewUserPage {
	//Declaration
	
	@FindBy(Xpath = "//b[text()='Add New User']")
	private WebElement pageHeader;
	
	
	@FindBy(xpath ="//input[@id='email' and @required]")
	private WebElement emailTF;
	
	@FindBy(xpath ="//input[@id='password' and @required]")
	private WebElement passwordTF;
	
	
	@FindBy(xpath ="//input[@id='firstname' and @required]")
	private WebElement firstnameTF;
	
	
	@FindBy(xpath ="//input[@id='lastname' and @required]")
	private WebElement lastnameTF;
	
	
	@FindBy(xpath ="//textarea[@id='address']")
	private WebElement addressTextArea;
	
	@FindBy(xpath ="//input[@id='contact']")
	private WebElement contactInfoTF;
	
	@FindBy(xpath ="(//input[@id='photo'])[2]")
	private WebElement photo;
	
	@FindBy(xpath ="//button[@name='add']")
	private WebElement saveButton;
	
	// initialization
	
	public AddNewUserPage(WebDriver driver) {
		PageFactory.initElements (driver,this);
	}
	//utilization
	
	public String getPageHeader() {
		return pageHeader.getText();
	}
	public void createNewUser(String email,String password,String firstname,String lastname,String address,String concat,String photoPath) {
		emailTF.sendkeys(email);
		passwordTF.sendkeys(password);
		firstnameTF.sendkeys(firstname);
		lastnameTF.sendkeys(lastname);
		addressTextArea.sendkeys(address);
		contactInfoTF.sendkeys(contact);
		photo.sendkeys(photoPath);
		saveButton.click();
	}
	}


	
	

	


