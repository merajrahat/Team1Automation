package com.amazon.data;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name= "searchData")
    public Object[]getSearchData(){
        return new Object[]{"PS5","Lawn Mower", "Panda"};
    }

    @DataProvider(name="signInCredentials")
    public Object [][] getSignInCredentials(){
        return new Object[][]{{"myname@gmail.com","PW1"},{"yourname@outlook.com","PW2"},{"hername@gmail.com","PW3"}};
    }



}
