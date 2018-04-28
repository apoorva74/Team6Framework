package commonAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPIChrome {

    public WebDriver chromeDriver;

    @BeforeMethod
    public void before(){
        System.setProperty("webdriver.chrome.driver", "/Users/shafiq/IdeaProjects/AutomationTeam6/driver/driver_Mac/chromedriver");
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    public void sleep(){
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
