package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

    WebDriver driver;
    @Given("^Open the Firefox and launch the application$")
    public void open_the_Firefox_and_launch_the_application() throws Throwable {
        System.out.println("This Step open the Firefox and launch the application.");
        System.setProperty("webdriver.gecko.driver", "/Users/thucphan/Downloads/geckodriver");
        driver= new FirefoxDriver();
        //driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/v4");
    }
    
    //@When("^Enter the Username \"(.*)\" and Password \"(.*)\"$")
    @When("^Enter the Username (.*)and Password (.*)$")
    public void enter_the_Username_and_Password(String username, String password) throws Throwable {
        System.out.println("This step enter the Username and Password on the login page.");
        driver.findElement(By.name("uid")).sendKeys(username);
        System.out.println("id text:" + driver.findElement(By.name("uid")).getAttribute("value"));
        driver.findElement(By.name("password")).sendKeys(password);
        System.out.println("password text:" + driver.findElement(By.name("password")).getAttribute("value"));
    }
    
    @Then("^Reset the credential$")
    public void reset_the_credential() throws Throwable {
        System.out.println("This step click on the Reset button.");
        //driver.findElement(By.name("btnReset")).click();
    }
}
 