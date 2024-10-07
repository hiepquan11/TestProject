package com.huynhduc.major.HomePage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomePageTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "E:\\Download\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testHomePageElement(){
        driver.get("http://localhost:8080"); // Địa chỉ ứng dụng Spring

        // Kiểm tra tiêu đề trang
        String title = driver.getTitle();
        Assertions.assertEquals("Document", title);

        // Kiểm tra các liên kết điều hướng
        WebElement homeLink = driver.findElement(By.linkText("home"));
        WebElement shopLink = driver.findElement(By.linkText("shop"));
        WebElement loginLink = driver.findElement(By.linkText("login"));
        WebElement cartLink = driver.findElement(By.linkText("cart"));

        Assertions.assertTrue(homeLink.isDisplayed());
        Assertions.assertTrue(shopLink.isDisplayed());
        Assertions.assertTrue(loginLink.isDisplayed());
        Assertions.assertTrue(cartLink.isDisplayed());
    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
