package pomPages;

import java.util.List;

public class CategoryPage {
//Declaration
	@FindBy(xpath ="//h1[normalize-space(text())='category']")
	private WebElement pageHeader;
	
	@FindBy(xpath ="//a[text()='New']")
	private WebElement newButton;
	
	@FindBy(xpath ="//table/tbody/tr/td[1]")
	private List <WebElement> categoryList;
	
	private String deletepath ="//td[text()=5s]/following-sibling::td/button[text()='Delete']";
	
	@FindBy(xpath ="//h4[text()=' Success!']")
	private WebElement successMessage;
	
	@FindBy(xpath ="//button[@name='delete']")
	private WebElement  deleteButton;


//Initialization
public CategoryPage(WedDriver driver) {
	PageFactory.intiElements(driver,this);
}
//utilization


public String getPageHeader() {
	return pageHeader.getText();
}
public void clickNewButton() {
	newButton.click();
}
public List<WebElement> getCategoryList(){
	return categoryList;
}
public String getSuccessMessage() {
	return successMessage.getText();
	}
public void clickDeleteButton(String courseName,WebDriver driver) {
	String requiredPath =String.format(deletepath, courseName);
	driver.findElement(By.xpath(requiredPath)).click();
}
public void clickDelete() {
	deleteButton.click();
}


	
}
