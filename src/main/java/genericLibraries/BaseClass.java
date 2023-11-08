package genericLibraries;

import pomPages.AddNewCoursePage;
import pomPages.AddNewUserPage;
import pomPages.AdminHomePage;
import pomPages.CategoryPage;
import pomPages.CourseListPage;
import pomPages.LoginPage;
import pomPages.UsersPage;
import pomPages.WelcomePage;

public class BaseClass {
	//@BeforeSuites
	//@BeforeTest
	
	protected  PropertiesUtility property;
	protected ExcelUtility  excel;
	protected JavaUtility jutil;
	protected WebDriverUtility webutil;
	protected WebDriver driver;
	
	
	public static WebDriver sdriver;
	public static JavaUtility sjutil;
	
	protected WelcomePage  welcome;
	protected LoginPage  Login;
	protected AdminHomePage home; 
	protected UsersPage users;
	protected CourseListPage course;
	protected AddNewUserPage category;
	protected AddNewCoursePage adduser;
	protected AddNewCoursePage addcourse;
	protected AddNewCategoryPage addcategory;
	
	
	@BeforeClass
	public void classcONFI() {
		property = new PropertiesUtility();
		excel = new ExcelUtility();
		jutil = new JavaUtility();
		webutil = new WebDriverUtility();
		
		property.propertiesInitialization(IConstantPath.PROPERTIES_PATH);
		driver = webutil.launchBrowser(property.readFromProperties("browser"));
		
sdriver = driver;
		sjutil = jutil;
	}
	@BeforeMethod
	public void methodConfig() {
		excel.excelInitialization(IConstantPath.EXCEL_PATH );
		 welcome = new WelcomePage(driver);
	  Login = new LoginPage(driver);
	home = new AdminHomePage(drier); 
users = new UsersPage(driver);
course = new CourseListPage(driver);
category = new AddNewUserPage(driver);
adduser = new AddNewCoursePage(driver);
addcourse = new AddNewCoursePage (driver);
addcategory = new AddNewCategoryPage(driver); 
webutil.navigateToApp(property.readFromProperties("url"));
long time = Long.parseLong(property.readFromProperties("timeouts"));
webutil.waitTillElementFound(time);
welcome.clickLoginButton();
Login.setEmail(property.readFromProperties("username"));
Login.setpassword(property.readFromProperties("password"));
Login.clickLogin();

	}
	@Aftermethod 
	public void methodTeardown() {
		excel.closeExcel();
		home.signOutofApp();
	}
	@AfterClass
	public void classTeardown() {
		webutil.classAllWindows();
	}
		
	//@AfterTest
	//@AfterSuite
	}
	
	
	
	


