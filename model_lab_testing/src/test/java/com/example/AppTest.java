package com.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest 
{
    
    @Test
    public void shouldAnswerWithTrue() throws InterruptedException
    {

         WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
         driver.get("https://www.shoppersstop.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='profileImage']/a/i")).click();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String title = driver.getTitle();
        System.out.println(title);
        String source_code = driver.getPageSource();
        int length = source_code.length();
        System.out.println(length);
        driver.navigate().to("https://www.google.com");
        Thread.sleep(3000);
        driver.navigate().back();
        String url = driver.getCurrentUrl();
        if (url.equals("https://www.shoppersstop.com/")) {
            System.out.println("URL is same");
        } else {
            System.out.println("URL is different");
        }
        Thread.sleep(3000);
        driver.quit();
    }
}
