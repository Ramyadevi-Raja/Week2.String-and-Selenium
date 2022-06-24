package week2.Day2;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class CreateLead {
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			
			WebElement usernameElement = driver.findElement(By.id("username"));
			usernameElement.sendKeys("Demosalesmanager");
			
			WebElement passwordElement = driver.findElement(By.id("password"));
			passwordElement.sendKeys("crmsfa");
			
			WebElement submitbutton = driver.findElement(By.className("decorativeSubmit"));
			submitbutton.click();
			
			WebElement elementcrmsfa = driver.findElement(By.linkText("CRM/SFA"));
			elementcrmsfa.click();
			
			WebElement elementLead = driver.findElement(By.linkText("Leads"));
			elementLead.click();
			
			WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
			elementCreateLead.click();
			
			WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
			elementCompanyName.sendKeys("Amazon");
			
			WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
			elementFirstName.sendKeys("Ramya");
			
			WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
			elementLastName.sendKeys("R");
			
			WebElement elementFirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
			elementFirstNameLocal.sendKeys("Ramya Raja");
			
			WebElement elementdepartmentName = driver.findElement(By.id("createLeadForm_departmentName"));
			elementdepartmentName.sendKeys("IT");
			
			WebElement elementdescription = driver.findElement(By.id("createLeadForm_description"));
			elementdescription.sendKeys("i am a software tester");
			
			WebElement elementEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
			elementEmail.sendKeys("mail2ramyabca@gmail.com");
			
			WebElement elementState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			//elementState.sendKeys("California");
			Select cc = new Select(elementState);
			cc.selectByIndex(8);
			
			WebElement elementSourceDropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
			//elementSourceDropDown.sendKeys("Existing Customer");
			
			Select dd = new Select(elementSourceDropDown);
			dd.selectByIndex(5);
			
			WebElement elementCreateLeadButton = driver.findElement(By.className("smallSubmit"));
			elementCreateLeadButton.click();
			
			String title = driver.getTitle();
			System.out.println(title);

		}

	}
