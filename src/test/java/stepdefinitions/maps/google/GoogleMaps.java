package stepdefinitions.maps.google;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.codehaus.plexus.logging.Logger;
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

    @When("^I search for (.*?)$")
    public void i_search_for_pattern(String pattern) throws Throwable {
        driver.findElement(By.id("searchboxinput")).sendKeys(pattern + Keys.ENTER);

    }

    @Then("^I should see (.*?) on the map$")
    public void i_should_see_city_on_the_map(String city) throws Throwable {
        driver.findElement(By.xpath("//h1/span[contains(text(),'"+city+"')]"));

    }

    @Then("^I should see (.*?) restaurants$")
    public void iShouldSeePatternRestaurantTheMap(String pattern) throws Throwable {
        driver.findElement(By.xpath("//span[@class='section-result-details'][contains(text(),'"+pattern+"')]"));
        System.out.println(pattern);
        Thread.sleep(4000);
    }
}
