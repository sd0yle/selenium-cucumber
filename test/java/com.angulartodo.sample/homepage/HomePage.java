package com.angulartodo.sample.homepage;

import com.automatedtest.sample.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


/**
 * Home Page of the Angular TODO example.
 *
 * Created: 13-OCT-2020
 */
public class HomePage extends BasePage {

    private static final String HOME_PAGE_URL = "http://todomvc.com/examples/angular2/";

    //////////////////////
    // Page Elements.
    //////////////////////

    /**
     * The todo input.
     *
     * @return WebElement
     */
    private WebElement todoInput() {
        return driver.findElement(By.cssSelector(".new-todo"));
    }

    /**
     * Checkbox for a provided todo list item.
     *
     * @param textOfItem String of the todo list item.
     * @return WebElement Checkbox.
     */
    private WebElement todoListItemCheckbox(String textOfItem) {
        return driver.findElement(By.xpath("//div[contains(text(), '" + textOfItem + "']/preceding-sibling:input"));
    }

    /**
     * Delete button for a provided todo list item.
     *
     * @param textOfItem String of the todo list item.
     * @return WebElement Button.
     */
    private WebElement todoListItemDelete(String textOfItem) {
        return driver.findElement(By.xpath("//div[contains(text(), '" + textOfItem + "']/next-sibling:button"));
    }

    /**
     * Label for a provided todo list item.
     *
     * @param textOfItem String of the todo list item.
     * @return WebElement Label.
     */
    private WebElement todoListItem(String textOfItem) {
        return driver.findElement(By.xpath("//div[contains(text(), '" + textOfItem + "']"));
    }

    /**
     * A todo list item that has been marked completed.
     *
     * @param textOfItem String of the todo list item.
     * @return WebElement Label.
     */
    private WebElement todoListItemCompleted(String textOfItem) {
        return driver.findElement(By.xpath("//li[@class]/div[contains(text(), '\" + textOfItem + \"']"));
    }

    HomePage() {
        PageFactory.initElements(driver, this);
    }

    //////////////////////
    // Page Methods.
    //////////////////////

    /**
     * Confirms the user is at the current page.
     * Returns true when the website url is correct and false when it is not.
     *
     * @return Boolean
     */
    public Boolean atPage() {
        return driver.getCurrentUrl().equalsIgnoreCase(HOME_PAGE_URL);
    }

    /**
     * Page load confirmation for todo input.
     */
    public void checkTodoInputDisplayed() {
        wait.forElementToBeDisplayed(10, todoInput(), "TODO Input");
    }

    /**
     * Completes a todo list item.
     *
     * @param todoItem String of the todo entry to complete.
     */
    public void completeTodo(String todoItem) {
        todoListItemCheckbox(todoItem).click();
    }

    /**
     * Clicks the delete button for a provided todo list item.
     *
     * @param todoItem String of the todo entry to delete.
     */
    public void deleteTodo(String todoItem) {
        todoListItemDelete(todoItem).click();
    }

    /**
     * Enter a new todo item.
     *
     * @param newEntry String for new todo entry.
     */
    public void enterNewTodo(String newEntry) {
        todoInput().sendKeys(newEntry);
        todoInput().sendKeys(Keys.ENTER);
    }

    /**
     * Confirms if a provided todo list item is displayed or not.
     * Returns true if the item is displayed and false if the item is not visible.
     *
     * @param todoItem String of the todo entry.
     * @return Boolean
     */
    public Boolean getTodoListItem(String todoItem) {
        return todoListItem(todoItem).isDisplayed();
    }

    /**
     * Confirms if a provided todo list item is displayed or not.
     * Returns true if the item is completed and false if the item is not completed.
     *
     * @param todoItem String of the todo entry.
     * @return Boolean
     */
    public Boolean getTodoListItemStatus(String todoItem) {
        return todoListItemCompleted(todoItem).isDisplayed();
    }

}

