package org.example;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class AppTest extends CommonAPI {
     @Test
     public void test1() {
         String title = driver.getTitle();
         System.out.println ("Title: "+title);
         Assert.assertEquals("Swag Labs", title );
     }


    //}
    @Test
    public void test2(){
        setup();
        WebElement usernameField= driver.findElement(By.id("user-name"));
        boolean usernameFieldDisplayed= usernameField.isDisplayed();
        System.out.println("Check if username field is displayed "+usernameFieldDisplayed);
        Assert.assertTrue(usernameFieldDisplayed);

        WebElement passwordField = driver.findElement(By.id("password"));
        boolean passwordFieldDisplayed = passwordField.isDisplayed();
        System.out.println("Check if password field is displayed " +passwordFieldDisplayed);
        Assert.assertTrue(passwordFieldDisplayed);

        WebElement loginBtn = driver.findElement(By.id("login-button"));
        boolean loginBtnDisplayed = loginBtn.isDisplayed();;
        System.out.println("Check if login button is displayed "+loginBtnDisplayed);
        Assert.assertTrue(loginBtnDisplayed);

    }
    @Test
    public void test3(){
       setup();

        WebElement usernameField=driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");
        System.out.println("username entered");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");
        System.out.println("password entered");

        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();
        System.out.println("login click success");

        WebElement header =driver.findElement(By.className("title"));
        String headerText= header.getText();
        System.out.println("header text "+ headerText);
        Assert.assertEquals("PRODUCTS",headerText);



    }

}
