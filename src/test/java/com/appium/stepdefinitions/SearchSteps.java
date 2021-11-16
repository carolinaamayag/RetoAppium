package com.appium.stepdefinitions;

import bean.SearchBean;
import com.appium.reto.AppiumConnection;
import com.appium.reto.Search;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SearchSteps {

    SearchBean searchBean;

    @Given("^we are setting filters$")
    public void we_are_setting_filters() {
        searchBean = new SearchBean("Apartamento", "Modelia (Zona Occidente)");
    }

    @And("^we click to search button$")
    public void we_click_to_search_button() {
        AppiumConnection appiumConnection = new AppiumConnection();
        try {
            appiumConnection.init();
        } catch (Exception e) {
            System.out.println("Error connecting to Appium Service. Error :" + e.getMessage());
        }
    }

    @When("^we make a search by category and place$")
    public void we_make_a_search_by_category_and_place() {
        Search search = new Search();
        search.searching(searchBean);
    }

    @Then("^the search result is successfull$")
    public void the_search_result_is_successfull() {
        Search search = new Search();
        Assert.assertTrue(search.getSearchResult());
    }

    @After
    public void close() {
        AppiumConnection appiumConnection = new AppiumConnection();
        appiumConnection.tearDown();
    }

}