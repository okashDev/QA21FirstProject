package com.telran.qa21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver driver;
    //before - setUp
    @BeforeMethod
    public void setUp() {
       // System.setProperty("webdriver.chrome.driver", "/Users/olga/Tools/chromedriver");
       driver = new ChromeDriver();

//    driver = new FirefoxDriver();
       driver.get("https://ya.ru/");
    }

    //test
    @Test
    public void openGoogleTest(){
        System.out.println("Site opened!");
    }

    //after - tearDown
    @AfterMethod(enabled = true)
    public void tearDown() {
        //close browser
        driver.quit();
    }
}
