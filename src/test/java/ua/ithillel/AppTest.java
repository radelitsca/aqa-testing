package ua.ithillel;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ua.ithillel.RetryTools.MyRetry;

public class AppTest {
    @Test(groups = "smoke")
    public void testFirst() {

    }

    @Test(groups = "regression")
    public void testSecond() {
        System.out.println("This is my second test");
    }

    @Test(groups = "regression", retryAnalyzer = MyRetry.class)
    public void testRetry() {
        Assert.assertTrue(true);
    }

    @Test(groups = "regression")
    public void testRetryWithListener() {
        System.out.println("Hey");
        Assert.assertEquals(1, 5);
    }


    @DataProvider
    public Object[][] createData() {
        return new Object[][]{
                {"Cat", "Murka"},
                {"Dog", "Pushok"},
        };
    }

    @Test(dataProvider = "createData", groups = "smoke")
    public void testData(String animal, String name) {
        System.out.println(animal + " " + name);
    }


}
