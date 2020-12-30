package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import pageObjectModel.weatherPOM;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class NDTVweatherUI {
    public WebDriver driver;
    public static Logger log = Logger.getLogger(NDTVweatherUI.class.getName());
    public weatherPOM weatherPage;
//    public APIDataFetch apiData;

    @Given("^Open \"([^\"]*)\" Browser$")
    public void open_Browser(String browsername) {

// Launch desired browser by calling browser method
        LaunchBrowser browser = new LaunchBrowser();
        driver = browser.browser(browsername);
        weatherPage = new weatherPOM(driver);

// Log file path is set as current date and time format
        Date d = new Date();
        System.setProperty("current.date", d.toString().replace(":", "_").replace(" ", "_"));
        PropertyConfigurator.configure("./src/test/resources/properties/log4j.properties");

        log.info(browsername +" Browser is opened successfully");
    }

    @When("^Launch \"([^\"]*)\" with expected page title \"([^\"]*)\"$")
    public void enter_URL(String url, String pageTitle) {

//  Automation Testing : web page is entered on opened browser
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        weatherPage.verifypagetitle("Main Page",pageTitle);
        log.info("Application is opened successfully");
    }

    @Then("^Click on \"([^\"]*)\" tab with expected page title \"([^\"]*)\"$")
    public void clickTab(String tabname, String expectedPageTitle)
    {
        weatherPage.clickmenutab(tabname);
        weatherPage.verifypagetitle(tabname,expectedPageTitle);
    }
    @Then("^Search \"([^\"]*)\" city and check the checkbox$")
    public void searchAndCheckCity(String cityname){
        weatherPage.selectcity(cityname);
        log.info(cityname + " is selected");
    }
    @Then("^Fetch all data shown for \"([^\"]*)\"$")
    public void fetchDataForCity(String cityName){
        List<String> data = weatherPage.fetchdata(cityName);
        log.info("Data is fetched successfully for "+cityName);
    }

    // close the browser
    @Then("^close the browser$")
    public void closeBrowsr()
    {
        driver.quit();
        log.info("Browser is closed successfully");
    }
}
