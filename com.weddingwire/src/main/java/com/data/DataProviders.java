package com.data;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "searchData")
    public Object[] getSearchData() {
        return new Object[]{"Waterfront", "San Francisco", "Beach", "San Diego"};
    }

    @DataProvider(name = "signInCredentials")
    public Object[][] getSignInCredentials() {
        return new Object[][]{{"philippakramou@gmail.com", "abc123"}};
    }
}
