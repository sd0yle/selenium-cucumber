package com.angulartodo.sample.homepage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import org.junit.Assert;


public class HomePageSteps {

    private HomePage homePage;

    public HomePageSteps() {
        this.homePage = new HomePage();
    }

    @Given ("^A user is at the HomePage")
    public void aUserIsAtHomePage() { this.homePage.atPage();}

    @And("^Todo input is displayed")
    public void todoInputIsDisplayed() {
        this.homePage.checkTodoInputDisplayed();
    }

    @And("^a todo list item exists matching \"([^\"]*)\"$")
    public void aTodoListItemExists(String todoItem) {
        this.homePage.getTodoListItem(todoItem);
    }

    @When("^a user enters a todo list item of \"([^\"]*)\"$")
    public void aUserEntersATodoListItem(String todoItem) {
        this.homePage.enterNewTodo(todoItem);
    }

    @When("^a user completes todo list item \"([^\"]*)\"$")
    public void aUserCompletesTodoListItem(String todoItem) {
        this.homePage.completeTodo(todoItem);
    }
    @When("^a user deletes todo list item \"([^\"]*)\"$")
    public void aUserDeletesTodoListItem(String todoItem) {
        this.homePage.deleteTodo(todoItem);
    }

    @Then("^a todo item is added to the list matching \"([^\"]*)\"$")
    public void aTodoItemIsAddedToTheList(String todoItem) {
        this.homePage.getTodoListItem(todoItem);
    }

    @Then("^a todo item is marked completed matching \"([^\"]*)\"$")
    public void aTodoItemIsMarkedCompleted(String todoItem) {
        this.homePage.getTodoListItemStatus(todoItem);
    }

    @Then("^a todo item no longer exists for \"([^\"]*)\"$")
    public void aTodoItemNoLongerExists(String todoItem) {
        Assert.assertFalse(this.homePage.getTodoListItem(todoItem));
    }

}
