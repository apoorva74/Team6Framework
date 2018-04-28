package unitedHealthcareMain;

import commonAPI.CommonAPIChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class UnitedHealthCareMain extends CommonAPIChrome {

    String url = "https://www.uhc.com/";

    public void uhcBrowserLaunch(){

        chromeDriver.get(url);
    }
    public void uhcLogin(){
        chromeDriver.get(url);
        chromeDriver.findElement(By.xpath("//div[@class='login section']//button[@id='loginmenubutton']")).click();
    }
    public void searchItems(){
        uhcLogin();
        chromeDriver.findElement(By.xpath("//*[@id='q']")).sendKeys("Pharmacy", Keys.ENTER);
    }
    public void medicareSearch(){
        uhcLogin();
        chromeDriver.findElement(By.xpath("//*[@id='topnavmenu']/li[4]/a")).click();
    }
    public void findingDoctor(){
        uhcLogin();
        chromeDriver.findElement(By.xpath("//*[@id='topnavmenu']/li[5]/a")).click();
    }
    public void individualAndFamily(){
        uhcLogin();
        chromeDriver.findElement(By.xpath("//*[@id='topnavmenu']/li[2]/a")).click();
    }
    public void plans(){
        individualAndFamily();
        chromeDriver.findElement(By.xpath("//*[@id='main-content']/div[1]/div[1]/div/div[2]/div/div/p[2]/a/span")).click();
    }
    public void answerFinding(){
        uhcLogin();
        chromeDriver.findElement(By.xpath("//*[@id='main-content']/div[3]/div[2]/div/div/div[2]/div/div/div/div/div/div/div/div/p/span/a")).click();
    }
    public void shortTerms(){
        individualAndFamily();
        chromeDriver.findElement(By.xpath("//*[@id='leftnavmenu']/li/ul/li[2]/ul/li[2]/a")).click();
    }
    public void dentalIns(){
        individualAndFamily();
        chromeDriver.findElement(By.xpath("//*[@id='leftnavmenu']/li/ul/li[2]/ul/li[3]/a/span")).click();
    }
}
