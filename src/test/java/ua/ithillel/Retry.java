package ua.ithillel;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.ithillel.RetryTools.MyRetry;

public class Retry {
    @Test(groups = "regression", retryAnalyzer = MyRetry.class)
    public void testRetry() {
        Assert.assertTrue(true);
    }

    @Test (groups = "regression")
    public void testWithListener() {
        System.out.println("Hey");
        Assert.assertTrue(false);
    }
}
