package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
    WebDriver driver;
    public MyAccountPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    //@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']")
    @FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']" )
            //div[@class='list-group']//a[text()='Logout']
    WebElement lnkLogout;

    public void clickLogout()
    {
        lnkLogout.click();
    }

}
