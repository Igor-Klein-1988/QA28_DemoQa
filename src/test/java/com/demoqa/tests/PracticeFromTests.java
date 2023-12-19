package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.PracticeFormPage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFromTests extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getForms();
        new SidePanel(driver).selectPracticeForm().hideIframes();
    }

    @Test
    public void registerNewStudentTest() {
        new PracticeFormPage(driver).enterPersonalData("Poul", "Smith", "pouls@mail.com", "1234567890")
                .selectGender("Male")
                .enterDate("16 Aug 2023")
                .selectSubjects(new String[]{"Math", "English", "Chemistry"})
                .selectHobbies(new String[]{"Sports", "Music"})
                .uploadFile("/Users/igorklein/Downloads/123.jpg")
                .selectState("NCR")
                .selectCity("Delhi")
                .submit();
        ;
    }

    @Test
    public void registerNewStudentWithChooseDateTest() {
        new PracticeFormPage(driver).enterPersonalData("Poul", "Smith", "pouls@mail.com", "1234567890")
                .selectGender("Male")
                .chooseDate("August", "1987", "16")
                .selectSubjects(new String[]{"Math", "English", "Chemistry"})
                .selectHobbies(new String[]{"Sports", "Music"})
                .uploadFile("/Users/igorklein/Downloads/123.jpg")
                .selectState("NCR")
                .selectCity("Delhi")
                .submit();
        ;
    }
}
