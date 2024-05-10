package tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

public class TextBoxTests extends TestBase {
    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void checkTextBoxFormAllFieldsTest() {
        textBoxPage.openPage()
                .setFullName("Petr Petrov")
                .setUserEmail("petr.petrov@mail.ru")
                .setCurrentAddress("Test current address")
                .setPermanentAddress("Test permanent address")
                .submit();

        textBoxPage.checkResult("Name", "Petr Petrov")
                .checkResult("Email", "petr.petrov@mail.ru")
                .checkResult("Current Address", "Test current address")
                .checkResult("Permananet Address", "Test permanent address");
    }
}
