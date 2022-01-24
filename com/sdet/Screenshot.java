package com.sdet;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Screenshot {
    static WebDriver driver;
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","C://Users//KAILASH//IdeaProjects//chromedriver_win32//chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        takescreenshot("secondone");

    }
    public static void takescreenshot(String Filename) throws IOException {
        File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("C://Users//KAILASH//IdeaProjects//mavenrecentproject//src//test//java//ScreenshotsTaken/"+Filename+".jpg"));

    }
}
