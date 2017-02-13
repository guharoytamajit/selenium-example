package com;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:/programs/webdriver/others/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://fb.com");
	WebElement usernameField = driver.findElement(By.id("email"));
	usernameField.sendKeys(new String[]{"tamojitguharoy@gmail.com"});
	WebElement passwordField = driver.findElement(By.id("pass"));
	passwordField.sendKeys(new String[]{"83838383"});
	driver.findElement(By.id("loginbutton")).findElement(By.tagName("input")).click();
//	WebElement dynamicElement = (WebElement) (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("pageLoginAnchor")));
//	dynamicElement.click();
	//userNavigationLabel
	driver.close();
}
}
