//package stepDefinitions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import java.util.Date;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//public class AutomationTesting {
//    public WebDriver driver;
//    public static Logger log = Logger.getLogger(AutomationTesting.class.getName());
//
//    @Given("^Open \"([^\"]*)\" Browser$")
//    public void open_Browser(String browsername) {
//// Launch desired browser by calling browser method
//        LaunchBrowser browser = new LaunchBrowser();
//        driver = browser.browser(browsername);
//// Log file path is set as current date and time format
//        Date d = new Date();
//        System.setProperty("current.date", d.toString().replace(":", "_").replace(" ", "_"));
//        PropertyConfigurator.configure("./src/test/resources/properties/log4j.properties");
//
//        log.info(browsername +" Browser is opened successfully");
//    }
//
//    @When("^Launch \"([^\"]*)\"$")
//    public void enter_URL(String url) {
////  Automation Testing web page is entered on opened browser
//        driver.get(url);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }
//
//    @Then("^Verify the page title as \"([^\"]*)\"$")
//    public void verifypageTitle(String exppagetitle)
//    {
////  Page title is verified
//        String pagetitle = driver.getTitle();
//        Assert.assertEquals("Web Application is not opened Successfully",exppagetitle,pagetitle);
//        log.info("Application is opened successfully");
//    }
//// Dynamic method used to open any sub menu item under menu item
//    @Then("^Click on \"([^\"]*)\" under \"([^\"]*)\" menu.$")
//    public void fetchdata(String submenu, String menu) throws InterruptedException {
//
//        Actions action = new Actions(driver);
//        action.moveToElement(driver.findElement(By.xpath("//li[@class='dropdown']/a[text()='"+menu+"']"))).perform();
//        driver.findElement(By.xpath("//a[text()='"+submenu+"']")).click();
//        log.info(submenu + "item is successfully clicked under " + menu + "item.");
//        Thread.sleep(1000);
//
//    }
//// Method used to check all menu and sub menu pages are opened successfully except home page
//    @Then("^Verify all sub menu pages are opening or not.$")
//    public void verifysubmenupages() throws InterruptedException {
//
//        WebDriverWait wait = new WebDriverWait(driver, 15);
//        Actions action = new Actions(driver);
////     Collecting all menu items elements
//        List<WebElement> menuItem = driver.findElements(By.xpath("//ul[@class='nav navbar-nav']/li"));
//        log.info("Number of items present in menu are " + menuItem.size());
//
//        for (int i=0; i<menuItem.size();i++)
//        {
////  Check either menu item has sub menu items or not
//            Boolean isPresent = driver.findElements(By.xpath("//ul[@class='nav navbar-nav']//li["+(i+1)+"]//ul[@class='dropdown-menu']")).size() > 0;
//            WebElement checkMenuItem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='nav navbar-nav']//li["+(i+1)+"]")));
//            log.info("Sub menu items are present under " + checkMenuItem.getText() + " is " + isPresent);
//            if (i!=0 && isPresent)
//            {
//                List<WebElement> subMenuItem = driver.findElements(By.xpath("//li["+(i+1)+"]//ul[@class='dropdown-menu']/li"));
////  below for loop is used to click one by one sub menu items of menu item
//                for (int j = 0;j<subMenuItem.size();j++)
//                {
//                    WebElement checkMenuItem1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='nav navbar-nav']//li["+(i+1)+"]")));
//                    action.moveToElement(checkMenuItem1).perform();
//                    WebElement checkSubMenuItem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li["+(i+1)+"]//ul[@class='dropdown-menu']/li["+(j+1)+"]")));
//                    log.info(checkSubMenuItem.getText() + " page is opened successfully.");
//                    checkSubMenuItem.click();
//                    Thread.sleep(1000);
//
//                }
//            }
////  used to click which does not have sub menu items
//            else if (i!=0)
//            {
//                log.info(checkMenuItem.getText() + " item page is opened successfully.");
//                checkMenuItem.click();
//            }
//
//        }
//
//    }
//// close the browser
//    @Then("^close the browser$")
//    public void closeBrowsr()
//    {
//        driver.quit();
//    }
//}
