package pages;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class SecondPage {
    public SelenideElement result = $x("//div[text()='One Hundred Shoreditch']");
    public SelenideElement scored = $x("//div[@class='b5cd09854e d10a6220b4']");

}
