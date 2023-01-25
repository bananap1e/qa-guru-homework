package com.demoqa;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.*;
import pages.*;

public class TestBase {
    AutomationPracticeFormPage automationPracticeFormPage = new AutomationPracticeFormPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }
}
