package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/jobs/");
        driver.manage().window().maximize();
        String actualTitle= driver.getTitle();
        System.out.print(actualTitle);
        String expectedTitle = "Alchemy Jobs – Job Board Application";
        if(actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Title Matched");
            driver.close();
        }
        else
            System.out.println("Title didn't match");
        driver.quit();
        System.out.println("Title text is not matching");

    }
}
