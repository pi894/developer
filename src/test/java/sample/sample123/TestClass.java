package sample.sample123;

/*import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;*/
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
/*import pageObjectsPackage.LoginPage;
import pageObjectsPackage.NewUserRegistrationPage;*/
import java.util.concurrent.TimeUnit;


public class TestClass {
//	public static WebElement element = null;
	//String baseUrl;
	//WebDriver driver;
	
	
	@BeforeMethod
	public void SetUp() {
		
	}

	
//*****************************************************************************************************	
	/*
	 * Test cases based on User story-007:- 
	 * As a user concerned about security and interested in personal finance, 
	 * user can registered in order to have access to the expense tracker functionalities.
	 
	
	@Test(dataProvider="newUserData", dataProviderClass=DataProviderClass.class)
	public void testcase1_create_new_user(String username, String password, String confirmpassword) {
			NewUserRegistrationPage.newUserRegistration(driver, username, password, confirmpassword);		
	}
	
	
	
//*****************************************************************************************************	
	
	 * Test cases based on User story-006:- 
	 * As a user concerned about security, user can access to all functionalities 
	 * related to expense tracking if he/she is a registered user and logged in.
	 
	
	@Test(dataProvider="loginData", dataProviderClass=DataProviderClass.class)
	public void testcase2_login_to_tracker(String username, String password) {
		LoginPage.loginToExpenseTracker(driver, username, password);
	}
*/
//*****************************************************************************************************	

	
	@AfterMethod
	public void tearDown() {
	//	driver.quit();
	}
}

