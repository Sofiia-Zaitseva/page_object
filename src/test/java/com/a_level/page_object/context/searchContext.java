package com.a_level.page_object.context;

import com.a_level.page_object.page.SearchPage;

import static com.a_level.page_object.test.BaseTest.driver;

public class searchContext {

    public static SearchPage searchPage = new SearchPage(driver);

    public static void search(String value){
        searchPage.inputSearch(value);
        searchPage.clickLoginBtn();
    }
}
