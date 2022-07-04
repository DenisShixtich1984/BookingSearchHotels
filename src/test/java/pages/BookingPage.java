package pages;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class BookingPage {

    public SelenideElement inputCitiField = $x("//input[@name='ss']");
    public SelenideElement searchButton = $x("//span[text() ='Search']");

    public void searchByKeyword (String keyword) {
        inputCitiField.sendKeys(keyword);
        searchButton.click();
    }
}
