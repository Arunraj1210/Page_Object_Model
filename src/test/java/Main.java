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
import java.util.Set;
import java.util.concurrent.TimeUnit;




public class Main {
    public static void main(String[] args) throws InterruptedException {
        PageObject Po = new PageObject();
        WebDriver driver = Po.Webopen();

        Po.searchbox(driver);
        Po.dismiss(driver);
        Po.vneck(driver);
        Po.addtocart(driver);
        Po.viewcart(driver);
        Po.checkout(driver);
        Po.form(driver);
        Po.createaccount(driver);
        Po.pass(driver);
        Po.payment(driver);
        Po.placeorder(driver);
    }
}