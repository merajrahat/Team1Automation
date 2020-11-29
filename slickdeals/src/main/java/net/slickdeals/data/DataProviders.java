package net.slickdeals.data;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "searchData")
    public Object[] getSearchData() {
        return new Object[]{"Men shoes", "Women shoes", "Kids toys"};
    }
}
