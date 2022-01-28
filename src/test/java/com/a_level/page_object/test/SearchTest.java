package com.a_level.page_object.test;

import com.a_level.page_object.context.searchContext;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    @Test
    public void searchTest(){
        String searchText = "text";

        searchContext.search(searchText);

        Assert.assertTrue(true);
    }
}
