package pomPages;

public class UsersPage {
	//Declaration
	@FindBy(xpath = "//h1[normalize-space(text())='Users']")
	private WebElement pageHeader;
	
	@FindBy(xpath = "//a[(text())='New']")
	private WebElement plusNewButton;
	
	
	@FindBy(xpath = "//u1[@class='pagination']/li[last()-1]/a")
	private WebElement usersListLastPage;
	
	@FindBy(xpath = "//table/tbody/tr[last()]td[3]")
	private WebElement lastUser;
	
	//Initialization
	
	public UsersPage(WebDriver driver) {
		PageFactory.initiElements(driver,this);
	}
	
	//Utilization
	
	public  String getPageHeader() {
		return pageHeader.getText();
	}
	public void clickNewButton() {
		plusNewButton.click();
	}
	public void clickUserListLastPage() {
		usersListLastPage.click();
	}
	public String getLastUserName() {
		return lastUser.getText();
	}
		
	
	}
	


