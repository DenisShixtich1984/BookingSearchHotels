package steps;
import browser.SelenideConfiguration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BookingPage;

import static com.codeborne.selenide.Selenide.open;

public class MySteps {

    private BookingPage bookingPage;
    @Before
    public void start() {
        SelenideConfiguration.configureBrowser("");
        open("");

    }

    @When("User search {string}")
    public void userSearch(String arg0) {

        bookingPage = new BookingPage();
        bookingPage.searchByKeyword(arg0);
    }

    @And("{string} on the search page")
    public void onTheSearchPage(String arg0) {
        Assert.assertEquals("One Hundred Shoreditch", arg0);
    }

    @Then("Rating of the Hotel is {string}")
    public void ratingOfTheHotelIs(String arg0) {
        Assert.assertEquals("8.6", arg0);
    }

    @After
    public void finish() {
        Selenide.closeWebDriver();
}

    @When("We search {string}")
    public void weSearch(String arg0) {
        bookingPage = new BookingPage();
        bookingPage.searchByKeyword(arg0);
    }

    @And("{string} on the page")
    public void onThePage(String arg0) {
        Assert.assertEquals("The Jade", arg0);
    }

    @Then("Hotel rating is {string}")
    public void hotelRatingIs(String arg0) {
        Assert.assertEquals("7.9", arg0);
    }
}