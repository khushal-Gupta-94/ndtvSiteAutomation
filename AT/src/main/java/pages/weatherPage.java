//package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import utils.SeleniumDriver;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class weatherPage {
//    weatherLocator weatherLocatorvalue=null;
//    public weatherPage()
//    {
//
//        this.weatherLocatorvalue=new weatherLocator();
//        PageFactory.initElements(SeleniumDriver.getDriver(), weatherLocatorvalue);
//    }
//    public void selectcity(String cityname)
//    {
//        weatherLocatorvalue.textfield.clear();
//        weatherLocatorvalue.textfield.sendKeys(cityname);
//        WebElement city = SeleniumDriver.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='"+cityname+"']")));
//        if (!city.isSelected()){
//            city.click();
//        }
//    }
//    public List<String> fetchdata(String cityName){
//        WebElement cityimg = SeleniumDriver.getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='"+cityName+"']")));
//        cityimg.click();
//        List<String> data = new ArrayList<String>();
//        for (int i = 1; i <= 5; i++)
//        {
//            data.add(SeleniumDriver.getDriver().findElement(By.xpath("//div[@class='leaflet-popup-content']/div/span["+i+"]/b")).getText());
//        }
//        for(String x:data)
//            System.out.println(x);
//        return data;
//    }
//}
