package com.vytrack.step_definitions;

import com.vytrack.pages.AccountsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


import static com.vytrack.utilities.BrowserUtils.*;

public class AccountsPageStepDefs {

    AccountsPage accountsPage = new AccountsPage();


    @When("the user clicks the filter icon")
    public void the_user_clicks_the_filter_icon() {
        click(accountsPage.button_filter_icon);
    }

    @Then("the user should be able to see account columns message as {string}")
    public void the_user_should_be_able_to_see_account_columns_message_as(String expectedFilters) {
        List<String> actualFiltersList = getElementsText(accountsPage.button_filter_items);

       actualFiltersList= actualFiltersList.stream().map(k -> k.trim().substring(0,k.indexOf(":"))).collect(Collectors.toList());
        List<String> expectedFiltersList = Arrays.stream(expectedFilters.split(",")).collect(Collectors.toList());

        Assert.assertEquals(expectedFiltersList,actualFiltersList);

    }

}
