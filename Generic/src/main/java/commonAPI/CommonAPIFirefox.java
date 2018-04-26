package commonAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class CommonAPIFirefox {

    public WebDriver geckoDriver;

    @BeforeMethod
        public void before(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\moham\\IdeaProjects\\AutomationTeam6\\driver\\geckodriver.exe");
        geckoDriver = new FirefoxDriver();
    }
    public static void sleep() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
