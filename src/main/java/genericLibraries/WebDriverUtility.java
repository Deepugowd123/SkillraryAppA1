package genericLibraries;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.Set;

/**
 * This class contains all reusable methods to perform web driver actions
 * 
 * 
 */
public class WebDriverUtility {
	private static final String driver = null;
	private static final String FileUtils = null;
	private static final String OutputType = null;
	/**
	 * This method is used to select an element from drop down based on index
	 * @param element
	 * @param index
	 */
	public void handleDropdown(WebElement element,int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	/**
	 *  This method is used to select an element from drop down based on value
	 * @param <WebElement>
	 * @param element
	 * @param value
	 */
		public void handleDropdown(WebElement element,String value) {
			Select select = new Select(element);
			select.selectByValue(value);
		}
		/**
		 *  This method is used to select an element from drop down based on text
		 *  @param text
		 *  @param element
		 */
		public void handleDropdown(String text, WebElement element) {
			Select select = new Select(element);
			select.selectByVisibleText(text);
			
		
	}
		/**
		 * This method is used to switch to frame based on index
		 * @param index
		 */
		public void switchToFrame(int index) {
			driver.switchTo().frame(index);
		}
		/**
		 * This method is used to switch to frame based on id or attribute
		 * @param idOrNmae
		 */
		public void switchToFrame(String idOrName) {
			driver.switchTo().frame(idOrName);
		}
		/**
		 *  This method is used to switch to frame based on frame element reference
		 * @param frameElement
		 */
		public void switchToFrame(WebElement frameElement) {
			driver.switchTo().frame(frameElement);
		}
		/**
		 *  This method is used to switch back from frame
		 */
		public void switchToBackFromFrame() {
			driver.switchTo().defaultContent();
		}
		/**
		 * This ,ethod is used to capture window screenshot
		 * @param driver
		 * @param className
		 * @param jutil
		 */
		public void takeScreenshit(WebDriver driver,String className,JavaUtility jutil) {
			TakesScreenshot ts = (TakeScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshot/"+className+"_"+jutil.getCurrentTime()+".png");
			try {
				FileUtils.copyFile(src,dest);
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		/**
		 * This method is used to scroll till element
		 * @param element
		 */
		public void scrollTillElement(WebElement element) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true"),element);
		}
		/**
		 * this method is used to handle alert
		 * @param
		 */
		public void handleAlert(String status) {
			Alert alert = driver.switchTO().alert();
			if(status.equalsIgnoreCase("ok"))
				alert.accept();
			else
				alert.dismiss();
		}
		/**
		 * this method is used to child browser
		 */
			
		public void switchToChildBrowser() {
			Set<String> set = driver.getWindowHandles();
			for(string window:set){
				driver.switchTo().window(windowID);
			}
		}
		/**
		 * this method returns parent browser address
		 * @return
		 */
		public String getParentWindowID() {
			return driver.getWindowHandle();
				
			}

/**
 * this method  is used to switch to specified window
 * @param windowID
 */
public void switchToWindow(String windowID) {
	driver.switchTo().window(windowID);
}
/**
 * this method is used to close current window
 */
public void closeCurrentWindow() {
	driver.close();
	
	/**
	 * this method is used to close all the windows
	 */
	public void closeAllWindows() {
		driver.quit();
	}
			
		

}
