package facebookTests;

import commonAPI.CommonAPIChrome;
import commonAPI.CommonAPIFirefox;
import facebookMain.FacebookMain;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Facebook extends FacebookMain {

    //test 1
    @Test
    public void browserLaunch(){
        facebookBrowserLaunch();
    }

    //test 2
   @Test
   public void login(){
        facebookLogin();
   }

    //test 3
    @Test
    public void createAccount(){
        createFacebookAccount();
    }

    //test 4
    @Test
    public void facebookSearch(){
        search();
    }


    //test 5
    @Test
    public void friends(){
        findFriends();
    }


    //test 6
    @Test
    public void facebookHome(){
        goHome();
    }

    //test 7
    @Test
    public void profileSetup(){
        setProfile();
    }


    //test 8
    @Test
    public void profileEdit(){
        editProfile();
    }

    //test 9
    @Test
    public void coverPic(){
        setCoverPic();
    }

    //test 10
    @Test
    public void addPhoto(){
        addProfilePhoto();
    }

    //test 11
    @Test
    public void activity(){
        viewActivity();
    }

    //test 12
    @Test
    public void setupTimeline(){
        timelineSetup();
    }

    //test 13
    @Test
    public void about(){
        aboutProfile();
    }

    //test 13
    @Test
    public void listOfFriends(){
        friendsList();
    }

    //test 14
    @Test
    public void albam(){
        photoAlbam();
    }

    //test 15
    @Test
    public void addInformation(){
        addInfo();
    }


    //test 16
    @Test
    public void msgReceive(){
        messageReceive();
    }


    //test 17
    @Test
    public void rntMessage(){
        recentMessage();
    }


    //test 18
    @Test
    public void nwMessage(){
        newMessage();
    }


    //test 19
    @Test
    public void newGroup(){
        createGroup();
    }

    //test 20
    @Test
    public void markRead(){
        markAsRead();
    }


    //test 21
    @Test
    public void notificationView(){
        viewNotifications();
    }


    //test 22
    @Test
    public void settingNotifications(){
        notificationSettings();
    }


    //test 23
    @Test
    public void createNewPage(){
        createPage();
    }

    //test 24
    @Test
    public void findNewGrouos(){
        findGroups();
    }

    //test 25
    @Test
    public void advertising(){
        facebookAdvertising();
    }


    //test 26
    @Test
    public void signOut(){
        Logout();
    }
}
