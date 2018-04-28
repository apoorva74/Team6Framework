package facebookMain;

import commonAPI.CommonAPIChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class FacebookMain extends CommonAPIChrome{

    String url = "https://www.facebook.com";

    public void facebookBrowserLaunch() {
        chromeDriver.get(url);
    }

    public void facebookLogin() {
        chromeDriver.get(url);chromeDriver.findElement(By.xpath("//input[@type='email']")).sendKeys("team6.selenium@gmail.com");
        chromeDriver.findElement(By.xpath("//input[@type='password']")).sendKeys("team612345");
        chromeDriver.findElement(By.xpath("//input[@value='Log In']")).click();
        sleep();

    }
    public void createFacebookAccount() {
        chromeDriver.get(url);
        chromeDriver.findElement(By.xpath("//input[@type='text']")).sendKeys("abcd", Keys.ENTER);
        chromeDriver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("selenium", Keys.ENTER);
        chromeDriver.findElement(By.xpath("//input[@id='u_0_i']")).sendKeys("abcd@gmail.com");
    }
    public void search() {
        facebookLogin();
        chromeDriver.findElement(By.xpath("//*[@id='u_9_2']/input[2]")).sendKeys("find friends", Keys.ENTER);
        chromeDriver.findElement(By.xpath("//*[@id='js_6b']/form/button/i")).click();

    }
    public void findFriends() {
        facebookLogin();
        chromeDriver.findElement(By.xpath("//a[@id='findFriendsNav']")).click();
    }
    public void goHome(){
        chromeDriver.get(url);chromeDriver.findElement(By.xpath("//input[@type='email']")).sendKeys("team6.selenium@gmail.com");
        chromeDriver.findElement(By.xpath("//input[@type='password']")).sendKeys("team612345");
        chromeDriver.findElement(By.xpath("//input[@value='Log In']")).click();
        sleep();
        chromeDriver.findElement(By.xpath("//a[@class='_2s25']")).click();
    }
    public void setProfile(){
        facebookLogin();
        chromeDriver.findElement(By.xpath("//span[@class='_1vp5']")).click();

    }
    public void editProfile(){
        chromeDriver.findElement(By.xpath("//a[@id='u_0_1k']")).click();
    }
    public void setCoverPic(){
        facebookLogin();
        chromeDriver.findElement(By.xpath("//i[@class='_30vz img sp_JRwumXDsnNZ_2x sx_11aa32']")).click();
    }
    public void addProfilePhoto(){
        facebookLogin();
        chromeDriver.findElement(By.xpath("//a[@id='u_0_1c']")).click();
    }
    public void viewActivity(){
        facebookLogin();
        chromeDriver.findElement(By.xpath("//a[@id='js_cu']")).click();
    }
    public void timelineSetup(){
        facebookLogin();
        chromeDriver.findElement(By.xpath("//a[@class='_6-6 _6-7']")).click();
    }
    public void aboutProfile(){
        facebookLogin();
        chromeDriver.findElement(By.xpath("//a[@data-tab-key='about']")).click();
    }
    public void friendsList() {
        facebookLogin();
        chromeDriver.findElement(By.xpath("//*[@id='u_fetchstream_3_8']/li[3]/a")).click();
    }
    public void photoAlbam(){
        facebookLogin();
        chromeDriver.findElement(By.xpath("//*[@id='u_fetchstream_3_8']/li[4]/a")).click();
    }
    public void addInfo(){
        facebookLogin();
        chromeDriver.findElement(By.xpath("//*[@id='u_fetchstream_6_19']/span")).click();
    }
    public void messageReceive() {
        facebookLogin();
        chromeDriver.findElement(By.xpath("//div[@class='_2n_9 f_click']")).click();
    }
    public void recentMessage(){
        messageReceive();
        chromeDriver.findElement(By.xpath("//*[@id='u_0_d']/div/div[2]/div/div[2]/h3/div/a[1]")).click();
    }
    public void newMessage(){
        messageReceive();
        chromeDriver.findElement(By.xpath("//*[@id='u_0_e']")).click();
    }
    public void createGroup(){
        messageReceive();
        chromeDriver.findElement(By.xpath("//*[@id='js_1sn']]")).click();
    }
    public void markAsRead(){
        messageReceive();
        chromeDriver.findElement(By.xpath("//*[@id='MercuryJewelFooter']/a[2]")).click();
    }
    public void viewNotifications(){
        facebookLogin();
        chromeDriver.findElement(By.xpath("//*[@id='js_3']/div")).click();
    }
    public void notificationSettings(){
        facebookLogin();
        chromeDriver.findElement(By.xpath("//*[@id='fbNotificationsFlyout']/div[2]/div/div[1]/div/a[2]")).click();
    }
    public void createPage() {
        facebookLogin();
        chromeDriver.findElement(By.xpath("//*[@id='userNavigationLabel']")).click();
        chromeDriver.findElement(By.xpath("//*[@id='js_4pz']/div/div/ul/li[1]/a/span/span")).click();

    }
    public void findGroups() {

        facebookLogin();
        chromeDriver.findElement(By.xpath("//*[@id='userNavigationLabel']")).click();
        chromeDriver.findElement(By.xpath("//*[@id='js_4pz']/div/div/ul/li[4]/a/span/span")).click();
    }
    public void facebookAdvertising() {

        facebookLogin();
        chromeDriver.findElement(By.xpath("//*[@id='userNavigationLabel']")).click();
        chromeDriver.findElement(By.xpath("//*[@id='js_4pz']/div/div/ul/li[9]/a/span/span")).click();
    }
    public void Logout(){
        facebookLogin();
        chromeDriver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
        chromeDriver.findElement(By.partialLinkText("menu_logout")).click();
    }
}
