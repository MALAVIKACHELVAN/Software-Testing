package com.example.day5_ph;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day5PhApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(Day5PhApplication.class, args);
		WebDriver driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[2]/div[2]/form/div[1]/div/input")).sendKeys("Shoes");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[2]/div[2]/form/div[1]/div/input")).click();
		Thread.sleep(1000);
		WebElement hoverable = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[3]/a/span[2]"));
        new Actions(driver)
		.moveToElement(hoverable)
		.perform();
		WebElement hoverable1 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[3]/ul/li[1]/a"));
        new Actions(driver)
		.moveToElement(hoverable1)
		.perform();
		WebElement hoverable2 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[3]/ul/li[1]/ul/li[2]/a/span"));
        new Actions(driver)
		.moveToElement(hoverable2)
		.perform();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[3]/ul/li[1]/ul/li[2]/a/span")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/div/a[2]/span[2]/span[2]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[4]/ol/li[3]/div/a/span/span/img")).click();
		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/form/div[1]/div/div/div[1]/div/div[3]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/form/div[1]/div/div/div[2]/div/div[2]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/form/div[2]/div/div/div[1]/div/input")).clear();
		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/form/div[2]/div/div/div[1]/div/input")).sendKeys("4");
		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/form/div[2]/div/div/div[2]/button/span")).click();
		
		


	}

}
