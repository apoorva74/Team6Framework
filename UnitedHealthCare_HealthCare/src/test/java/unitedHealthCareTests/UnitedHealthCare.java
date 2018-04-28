package unitedHealthCareTests;

import commonAPI.CommonAPIChrome;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import unitedHealthcareMain.UnitedHealthCareMain;

public class UnitedHealthCare extends UnitedHealthCareMain {


    //test 1
    @Test
    public void browerLaunch(){
        uhcBrowserLaunch();
    }

    //test 2
    @Test
    public void login(){
        uhcLogin();
    }

    //test 3
    @Test
    public void itemSearch(){
        searchItems();
    }

    //test 4
    @Test
    public void medicare(){
        medicareSearch();
    }


    //test 5
    @Test
    public void findAdoctor(){
        findingDoctor();
    }


    //test 6
    @Test
    public void individualCare(){
       individualAndFamily();
    }

    //test 7
    @Test
    public void viewPlans(){
       plans();
    }

    //test 8
    @Test
    public void findAnswer(){
        answerFinding();
    }

    //test 9
    @Test
    public void shortTermsIns(){
        shortTerms();
    }

    //test 10
    @Test
    public void dentalInsurance(){
        dentalIns();
    }
}
