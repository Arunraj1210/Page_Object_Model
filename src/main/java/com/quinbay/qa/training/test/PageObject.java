package com.quinbay.qa.training.test;
import org.openqa.selenium.JavascriptExecutor;

import com.quinbay.qa.training.Actions.HomePageActions;
import com.quinbay.qa.training.pages.HomePage;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.openqa.selenium.support.ui.Select;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;



public class PageObject {


    public WebDriver Webopen() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.edgewordstraining.co.uk/demo-site/");
        return driver;
    }
    public void searchbox(WebDriver driver)
    {
        WebElement searchbox=((ChromeDriver) driver).findElementByXPath("//input[contains(@id,'0')]");
        searchbox.sendKeys("T Shirt");
        searchbox.submit();
    }
    public void dismiss(WebDriver driver)
    {
        WebElement dismiss=((ChromeDriver) driver).findElementByXPath("//a[@class='woocommerce-store-notice__dismiss-link']");
        dismiss.click();
    }
    public void vneck(WebDriver driver)
    {
        WebElement vneck=((ChromeDriver) driver).findElementByXPath("//img[@src='https://www.edgewordstraining.co.uk/demo-site/wp-content/uploads/2018/03/vneck-tee.jpg']") ;
        vneck.click();
    }
    public void addtocart(WebDriver driver)
    {
        WebElement addtocart=((ChromeDriver) driver).findElementByXPath("//button[@value=38]");
        addtocart.click();
    }
    public void viewcart(WebDriver driver)
    {
        WebElement viewcart=((ChromeDriver) driver).findElementByXPath("//a[@href='https://www.edgewordstraining.co.uk/demo-site/cart/'][text()='Cart']");
        viewcart.click();
    }
    public void checkout(WebDriver driver)
    {
        WebElement checkout=((ChromeDriver) driver).findElementByXPath("//a[@href='https://www.edgewordstraining.co.uk/demo-site/checkout/'][@class=\"checkout-button button alt wc-forward\"]");
        checkout.click();
    }
    public void form(WebDriver driver)
    {
        WebElement firstname=((ChromeDriver) driver).findElementByXPath("//input[@id=\"billing_first_name\"]");
        firstname.click();

        firstname.sendKeys("Arunraj");
        WebElement lastname=((ChromeDriver) driver).findElementByXPath("//input[@id=\"billing_last_name\"]");
        lastname.click();

        lastname.sendKeys("M");
        WebElement company=((ChromeDriver) driver).findElementByXPath("//input[@id=\"billing_company\"]");
        company.click();

        company.sendKeys("Quinbay Technologies");
        Select drpcountry=new Select(((ChromeDriver) driver).findElementByXPath("//select[@class='country_to_state country_select select2-hidden-accessible']"));
        drpcountry.selectByVisibleText("India");
        WebElement door =((ChromeDriver) driver).findElementByXPath("//input[@id='billing_address_1']");
        door.click();
        door.sendKeys("24 th mainroad,4th sector");
        WebElement city=((ChromeDriver) driver).findElementByXPath("//input[@id='billing_city']");
        city.click();
        city.sendKeys("Bangalore");
        Select state=new Select(((ChromeDriver) driver).findElementByXPath("//select[@id=\"billing_state\"]"));
        state.selectByVisibleText("Karnataka");
        WebElement postcode=((ChromeDriver) driver).findElementByXPath("//input[@id='billing_postcode']");
        postcode.click();
        postcode.sendKeys("560007");
        WebElement email=((ChromeDriver) driver).findElementByXPath("//input[@id='billing_email']");
        email.click();
        email.sendKeys("arunraj.m@quin.com");
        WebElement phone=((ChromeDriver) driver).findElementByXPath("//input[@id='billing_phone']");
        phone.click();
        phone.sendKeys("7502638295");
    }
    public void createaccount(WebDriver driver)
    {
        WebElement createaccount=((ChromeDriver) driver).findElementByXPath("//input[@id='createaccount']");
        createaccount.click();
    }
    public void pass(WebDriver driver)
    {
        WebElement pass=((ChromeDriver) driver).findElementByXPath("//input[@id='account_password']");
        pass.click();
        pass.sendKeys("gffgfgfgdgfgffgrgdfgf");
    }
    public void payment(WebDriver driver)
    {
        WebElement payment=((ChromeDriver) driver).findElementByXPath("//input[@id='payment_method_cod']");
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", payment);
    }
    public void placeorder(WebDriver driver)
    {
        WebElement placeorder=((ChromeDriver) driver).findElementByXPath("//button[@id=\"place_order\"]");
        placeorder.submit();
    }

    }