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

public class FirstSeleniumExample
{
    public static void main(String[] args) throws InterruptedException
    {

        System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.edgewordstraining.co.uk/demo-site/");


        WebElement searchBox=driver.findElement(By.xpath("input[@id='woocommerce-product-search-field-0']"));
        searchBox.click();
        searchBox.sendKeys("Tshirt");
        searchBox.sendKeys(Keys.RETURN);
        Thread.sleep(30000);



        List<WebElement> elements= driver.findElements(By.xpath("//img[@src=\"https://www.edgewordstraining.co.uk/demo-site/wp-content/uploads/2018/03/vneck-tee.jpg\"]"));


        if(elements.isEmpty())
        {
            System.out.println("\n\n element not found");
        }
        else
            {
            System.out.println("element found");
        }
        WebElement Addtocart=driver.findElement(By.xpath("//a[@class='button product_type_simple add_to_cart_button ajax_add_to_cart added']"));
        Addtocart.click();
        WebElement Viewcart=driver.findElement(By.xpath("//a[@class='added_to_cart wc-forward']"));
        Viewcart.click();
        WebElement Proceedtocheckout=driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']"));
        Proceedtocheckout.click();
        WebElement Firstname=driver.findElement(By.xpath("//input[@name='billing_first_name']"));
        Firstname.sendKeys("Arunraj");
        WebElement Lastname=driver.findElement(By.xpath("//input[@id='billing_last_name']"));
        Lastname.sendKeys("M");
        WebElement Companyname=driver.findElement(By.xpath("//input[@id='billing_company']"));
        Companyname.sendKeys("Quinbay");
        //WebElement Country=driver.findElement(By.xpath());
        Select country=new Select(((ChromeDriver) driver).findElementByXPath("//select[@class='country_to_state country_select select2-hidden-accessible']"));
        country.selectByVisibleText("India");
        WebElement Streetaddress=driver.findElement(By.xpath("//input[@name='billing_first_name']"));
        Streetaddress.sendKeys("24th mainroad,4th sector,HSR layout");
        WebElement Town=driver.findElement(By.xpath("//input[@id='billing_city']"));
        Town.sendKeys("Bengalore");
        Select state=new Select(((ChromeDriver) driver).findElementByXPath("//select[@id=\"billing_state\"]"));
        state.selectByVisibleText("Tamil Nadu");
        WebElement postcode=((ChromeDriver) driver).findElementByXPath("//input[@id='billing_postcode']");
        postcode.click();
        postcode.sendKeys("641002");
        WebElement email=((ChromeDriver) driver).findElementByXPath("//input[@id='billing_email']");
        email.click();
        email.sendKeys("saad100000.ahamed.m@gmail.com");
        WebElement phone=((ChromeDriver) driver).findElementByXPath("//input[@id='billing_phone']");
        phone.click();
        phone.sendKeys("1234567890");
        WebElement createaccount=((ChromeDriver) driver).findElementByXPath("//input[@id='createaccount']");
        createaccount.click();
        WebElement pass=((ChromeDriver) driver).findElementByXPath("//input[@id='account_password']");
        pass.click();
        pass.sendKeys("gffgfgfgdgfgffgrgdfgf");
        WebElement payment=((ChromeDriver) driver).findElementByXPath("//input[@id='payment_method_cod']");
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", payment);
        WebElement placeorder=((ChromeDriver) driver).findElementByXPath("//button[@id=\"place_order\"]");
        placeorder.submit();
        Thread.sleep(300000);


        driver.close();
    }
}