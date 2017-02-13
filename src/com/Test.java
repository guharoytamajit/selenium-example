package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:/programs/webdriver/others/chromedriver.exe");
ChromeDriver chromeDriver = new ChromeDriver();	
chromeDriver.get("https://www.google.com");
WebElement webElement = chromeDriver.findElement(By.id("lst-ib"));
webElement.sendKeys(new String[]{"tamajit"});
chromeDriver.close();
}
}
