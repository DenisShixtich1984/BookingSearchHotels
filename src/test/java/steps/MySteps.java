package steps;
import browser.SelenideConfiguration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BookingPage;
import pages.SecondPage;

import java.util.Optional;
import static com.codeborne.selenide.Selenide.open;

public class MySteps {

    private BookingPage bookingPage;
    private SecondPage secondPage;
    private String searchItem;

    @Before
    public void setUp() {
        bookingPage = new BookingPage();
        String browser = Optional.ofNullable(System.getProperty("browser")).orElse("chrome");
        SelenideConfiguration.configureBrowser(browser);
    }

    @Given("User on the found page")
    public void UserOnTheFoundPage() {
        open("Start");
    }

    @When("User search {string}")
    public void userSearch(String keyword) {
        searchItem = keyword;
        secondPage = new SecondPage();
        bookingPage.searchByKeyword(searchItem);
    }
    @And("{string} on the search page")
    public void onTheSearchPage(String result) {
        Assert.assertEquals("One Hundred Shoreditch", result);
    }
    @Then("Rating of the Hotel is {string}")
    public void RatingOfTheHotel (String scored) {
        Assert.assertEquals("8.6", scored);
    }

    @After
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
