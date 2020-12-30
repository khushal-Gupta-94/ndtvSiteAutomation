//package pages;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import utils.SeleniumDriver;
//
//import java.util.concurrent.TimeUnit;
//
//public class mainPage {
////    mainPageLocator mainPageLocatorvalue=null;
//    public mainPage()
//    {
//
////        this.mainPageLocatorvalue=new mainPageLocator();
//        PageFactory.initElements(SeleniumDriver.getDriver(), this);
//    }
//    @FindBy(xpath = "//div[@class='topnav_extra']/a")
//    public WebElement submenu;
//
//    public void clickmenutab(String tabname)
//    {
//        submenu.click();
//        SeleniumDriver.getDriver().findElement((By.xpath("//a[text()='"+tabname+"']"))).click();
//        SeleniumDriver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//    }
//    public void verifypagetitle(String tabname, String expectedPageTitle){
//        String pagetitle = SeleniumDriver.getDriver().getTitle();
//        Assert.assertEquals(tabname + " page not found.",expectedPageTitle,pagetitle);
//    }
//}
