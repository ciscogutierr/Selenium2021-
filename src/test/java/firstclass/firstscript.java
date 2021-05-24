package firstclass;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class firstScript {


    @Test
    public void launchWebPage() {
        //path of driver
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        /** webdriver driver --> driver is a variable of Webdriver data type
         *
        */
        webdriver driver = new ChromeDriver();
        String url - "https://www.facebook.com"
        driver.get(https://www.facebook.com);
        //driver.navigate().to(https://www.facebook.com);
        driver.manage().maximize();
        String pageTitle= driver.getTitle();
        String exPageTitle= "Facebook - log In or Sign Up";
        Assert.assertEquals(pageTitle, exPageTitle);
        String pageUrl= driver.getcurrentUrl();
        //driver.close();
        driver.quit();


    }


         */



}
