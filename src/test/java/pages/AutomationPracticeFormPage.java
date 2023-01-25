package pages;

import pages.components.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AutomationPracticeFormPage {
    CalendarComponent calendarComponent = new CalendarComponent();
    ModalComponent modalComponent = new ModalComponent();

    private final String titleText = "Practice Form";

    public AutomationPracticeFormPage openPage() {
        open("/automation-practice-form");
        $(".main-header").shouldHave(text(titleText));
        return this;
    }

    public AutomationPracticeFormPage setFirstName(String value) {
        $("#firstName").setValue(value);
        return this;
    };

    public AutomationPracticeFormPage setLastName(String value) {
        $("#lastName").setValue(value);
        return this;
    };

    public AutomationPracticeFormPage setEmail(String value) {
        $("#userEmail").setValue(value);
        return this;
    };

    public AutomationPracticeFormPage setGender(String value) {
        $("#genterWrapper").$(byText(value)).click();
        return this;
    };

    public AutomationPracticeFormPage setNumber(String value) {
        $("#userNumber").setValue(value);
        return this;
    };

    public AutomationPracticeFormPage setBirthDate() {
        $("#dateOfBirthInput").click();
        calendarComponent.setDate();
        return this;
    };

    public AutomationPracticeFormPage setHobbies(String value) {
        $("#hobbiesWrapper").$(byText(value)).click();
        return this;
    };

    public AutomationPracticeFormPage uploadImage(String value) {
        $("#uploadPicture").uploadFromClasspath(value);
        return this;
    };

    public AutomationPracticeFormPage setAddress(String value) {
        $("#currentAddress").setValue(value);
        return this;
    };

    public AutomationPracticeFormPage setCityAndState(String value, String value_2) {
        $("#state").click();
        $("#stateCity-wrapper").$(byText(value)).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText(value_2)).click();
        $("#submit").click();
        return this;
    };

    public AutomationPracticeFormPage verifyModalAppears() {
        modalComponent.verifyModalVisible();
        return this;
    }

    public AutomationPracticeFormPage verifyResult(String key, String value) {
        modalComponent.verifyModalVisible();
        return this;
    }
}
