package com.demoqa;

import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class AutomationPracticeFormTests extends TestBase {

    @Test
    void fillAutomationPracticeFormTest() {
        String name = "test";
        String lastName = "lastTest";
        String email = "test@mail.com";
        String gender = "Male";
        String number = "0123456789";
        String birth = "05 October,2000";
        String hobbies = "Music";
        String image = "test.png";
        String address = "Test Address";
        String state = "NCR";
        String city = "Noida";

        automationPracticeFormPage.openPage()
                .setFirstName(name)
                .setLastName(lastName)
                .setEmail(email)
                .setGender(gender)
                .setNumber(number)
                .setBirthDate()
                .setHobbies(hobbies)
                .uploadImage(image)
                .setCityAndState(state, city)

                .verifyModalAppears()

                .verifyResult("Student Name", name + " " + lastName)
                .verifyResult("Student Email", email)
                .verifyResult("Gender", gender)
                .verifyResult("Mobile", number)
                .verifyResult("Date of Birth", birth)
                .verifyResult("Hobbies", hobbies)
                .verifyResult("Picture", image)
                .verifyResult("Address", address)
                .verifyResult("State and City", state + " " + city);
    }
}
