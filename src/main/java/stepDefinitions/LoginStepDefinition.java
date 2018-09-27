package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class LoginStepDefinition {

    WebDriver driver;


    @Given("^User is on Google Search Page$")
    public void user_is_on_Google_Search_Page() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.freecrm.com/index.html");
    }


    @When("^title of  page is \"(.*)\"$")
    public void title_of_page(String pTitle) {
        String title = driver.getTitle();
        System.out.println(title);
    }

    //Reg Exp:
    //1. \"([^\"]*)\"
    //2. \"(.*)\"

    @Then("^user enters \"(.*)\"$")
    public void user_enters_username_and_password(String keyword) {
        driver.findElement(By.name("q")).sendKeys(keyword);
    }

    @Then("^user clicks on search button$")
    public void user_clicks_on_login_button() {
        try {
            Thread.sleep(2000);
        } catch (Exception e){

        }
    }


    @Then("^Close the browser$")
    public void close_the_browser() {
        driver.quit();
    }


}
