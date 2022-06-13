package org.example;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonAPI {
     public WebDriver driver;

@Before
    public void setup() {
    System.setProperty("webdriver.chrome.driver", "/Users/mingmasherpa/IdeaProjects/may22eattest/driver/chromedriver");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://www.saucedemo.com");
}

   @After
   public void teardown(){
            driver.close();
        }
   public void click(String locator) {
       try {
           driver.findElement(By.cssSelector(locator)).click();
       } catch (Exception e) {
           driver.findElement(By.xpath(locator)).click();
       }
   }
   public void type(String locator, String text){
        try{
            driver.findElement(By.cssSelector(locator)).sendKeys(text);
        }catch (Exception e){
            driver.findElement(By.xpath(locator)).sendKeys(text);
        }
       }
       public String getElementText(String locator){
    try{
        return driver.findElement(By.cssSelector(locator)).getText();
    }catch(Exception e){
        return driver.findElement(By.xpath(locator)).getText();
           }
       }

   }


