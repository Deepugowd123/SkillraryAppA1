package pomPages;

import genericLibraries.WebDriverUtility;

public class AddNewCoursePage {
	
	//Declaration
	
	@FindBy(xpath = "//b[text()='Add New Course']" )
	private WebElement pageHeader;
	
	@FindBy(xpath ="//input[@id='name']")
	private WebElement nameTF;
	
	@FindBy(id="category" )
	private WebElement categoryDropdown;
	
	@FindBy(id= "price")
	private WebElement priceTF;
	
	@FindBy(xpath = "(//input[@id='photo'])[2]" )
	private WebElement photoButton;

	@FindBy(xpath = "//button[@name='add']") )
	private WebElement savebButton;
	
	@FindBy(xpath = "//html/body/p" )
	private WebElement descriptionTextArea;
	
	@FindBy(xpath = "//iframe[@title='Rich Text Editor,editor1']")
	private WebElement descriptionFrame;

	//initialization
	public AddNewCoursePage(WebDriver driver) {
		pageFactory.initElements(driver,this);
	}
	//utilization
	public String getPageHeader() {
		return pageHeader.getText();
		
	}
	public void setName(String courseName) {
		nameTF.sendkeys(courseName);
	}
	public void selectCategory(WebDriverUtility web,String category) {
		web.handleDropdown(category, categoryDropdown);
	}
	public void setprice(String price) {
		priceTF.sendkeys(price);
	}
	public void uploadPhoto(String photopath) {
		photoButton.sendkeys(photopath);
	}
	public void setDescription(WebDriverUtility web,String text) {
		web.switchToFrame(descriptionFrame);
		descriptionTextArea.sendkeys(text);
		web.switchToBackFromFrame();
	}
	public void clickSaveButton() {
		saveButton.click();	
		

}

}
