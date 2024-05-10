package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class TestBasePage {
    public void removeBanners() {
        executeJavaScript("$('footer').remove();");
        executeJavaScript("$('#fixedban').remove();");
    }
}
