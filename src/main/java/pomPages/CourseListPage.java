package pomPages;

import java.util.List;

public class CourseListPage {
	//Declaration
	@FindBy(xpath = "//h1[normalize-space(text())='Course List']")
	
	private WebElement pageHeader;
	
@FindBy(xpath = "//a[text()='New']")
	
	private WebElement newButton;

@FindBy(xpath = "//table/tbody/tr/td[1]")

private List <WebElement> courseList; 

@FindBy(xpath = "//h4[text()='Success!']")

private WebElement SuccessMessage;

private String deletePath = "//td[text()=%s]/following-sibling::td/button[text()=='Delete']";

@FindBy(xpath = "//button[@name='delete'}")
private WebElement deleteButton;

//initialization

public CourseListPage(WebDriver driver) {
	pageFactory.initElemnets(driver,this);
}
//Utilization

public String getPgeHeader() {
	return pageHeader.getText();
}
public void clickNewButton() {
	newButton.click();
}
public List<WebElement> getCourseList(){
	return courseList;
}
public String getSuccessMessage() {
	return successMessage.getText();
}
public void clickDeleteButton() {
	String requiredPath = String.format(deletePath, courseName);
	driver.findElement(By.xpath(requiredPath)).click();
}
public void clickDelete() {
	deleteButton.click();
}
}

