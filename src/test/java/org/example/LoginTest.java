package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends CommonAPI {

    @Test
    public void test1() {
        type("#user-name", "standard_user");
        System.out.println("username entered");

        type("#password", "secret_sauce");
        System.out.println("password entered");

        click("#login-button");
        System.out.println("login click success");

        String headerText = getElementText(".title");
        System.out.println("header text " + headerText);
        Assert.assertEquals("PRODUCTS", headerText);

    }
    @Test
    public void test2() {
        type("#user-name", "");
        System.out.println("username entered");

        type("#password", "secret_sauce");
        System.out.println("password entered");

        click("#login-button");
        System.out.println("login click success");


    }
    @Test
    public void test3(){
        type("#user-name", "standard_user");
        System.out.println("username entered");

        type("#password", "secret_sauce");
        System.out.println("password entered");

        click("#login-button");
        System.out.println("login click success");

    }

}
