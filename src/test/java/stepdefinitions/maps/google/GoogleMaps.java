package stepdefinitions.maps.google;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class GoogleMaps {

    private WebDriver driver;

    @Before
    public void beforeScenario() {
        driver = new ChromeDriver();
    }

    @After
    public void afterScenario() {
        driver.close();
    }

    @Given("^I am on maps\\.google\\.com$")
    public void i_am_on_www_maps_google_com() throws Throwable {
        driver.get("http://maps.google.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @When("^I search for Berlin Germany$")
    public void i_search_for_Berlin_Germany() throws Throwable {
        driver.findElement(By.id("searchboxinput")).sendKeys("Berlin, Germany"+ Keys.ENTER);

    }

    @Then("^I should see Berlin on the map$")
    public void i_should_see_Berlin_on_the_map() throws Throwable {
        driver.findElement(By.xpath("//h1/span[contains(text(),'Berlin')]"));
        Thread.sleep(4000);
    }

    @When("^I search for pizza in Berlin$")
    public void iSearchForPizzaInBerlin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see pizza restaurant on the map$")
    public void iShouldSeePizzaRestaurantOnTheMap() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
