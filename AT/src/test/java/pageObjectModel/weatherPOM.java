package pageObjectModel;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class weatherPOM {
    private WebDriver ldriver;
    public weatherPOM(WebDriver rdriver)
    {
        ldriver = rdriver ;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//div[@class='topnav_extra']/a")
    WebElement submenu;
    @FindBy(xpath = "//input[@type='text']")
    WebElement textfield;

// ------ Action Method -------
    public void clickmenutab(String tabname)
    {
     submenu.click();
     System.out.println("Sub menu item is clicked");
     ldriver.findElement((By.xpath("//a[text()='"+tabname+"']"))).click();
     System.out.println(tabname + " is clicked");
     ldriver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    }
    public void verifypagetitle(String tabname, String expectedPageTitle){
        String pagetitle = ldriver.getTitle();
        Assert.assertEquals(tabname + " page not found.",expectedPageTitle,pagetitle);
    }
    public void selectcity(String cityname)
    {
        WebDriverWait wait=new WebDriverWait(ldriver, 20);
        textfield.clear();
        textfield.sendKeys(cityname);
        WebElement city = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='"+cityname+"']")));
        if (!city.isSelected()){
            city.click();
        }
    }
    public List<String> fetchdata(String cityName){
        WebDriverWait wait=new WebDriverWait(ldriver, 20);
        WebElement cityimg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='"+cityName+"']")));
        cityimg.click();
        List<String> data = new ArrayList<String>();
        for (int i = 1; i <= 5; i++)
        {
            data.add(ldriver.findElement(By.xpath("//div[@class='leaflet-popup-content']/div/span["+i+"]/b")).getText());
        }
        for(String x:data)
            System.out.println(x);
        return data;
    }
}
