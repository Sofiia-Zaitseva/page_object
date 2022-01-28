package com.a_level.page_object.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage{
    public WebDriver driver;

    /**
     * constructor of SearchPage class
     * @param driver
     */
    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    /**
     * search input
     */
    @FindBy(name = "q")
    private WebElement searchField;

    /**
     * search button
     */
    @FindBy(name = "btnK")
    private WebElement searchBtn;

    /**
     * method input search string
     */
    public void inputSearch(String login) {
        searchField.sendKeys(login);
    }

    /**
     * method search button click
     */
    public void clickLoginBtn() {
        searchBtn.click();
    }
}
