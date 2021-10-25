package com.telran.qa21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class SearchProductTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/");
        // развернуть окно до ширины экрана:
        driver.manage().window().maximize();
        // время ожидания открытия и разворачивания окна:
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void searchProductTest(){
        // найти элемент ПОИСК
        // кликнуть на него
        // ввести
        // проверить корректность результата поиска
        driver.findElement(By.id("search_query_top")).click();
        driver.findElement(By.id("search_query_top")).sendKeys("summer dresses" + Keys.ENTER);
        String text = driver.findElement(By.className("lighter")).getText();
        Assert.assertEquals(text.toLowerCase(Locale.ROOT), "\"summer dresses\"");
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();
        // driver.close;
    }
}
