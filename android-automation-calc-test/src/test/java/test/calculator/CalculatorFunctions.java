package test.calculator;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utils.AppiumDriverExCalc;
import java.time.Duration;

public class CalculatorFunctions {

        AppiumDriver appiumDriver = AppiumDriverExCalc.getAppiumDriver();

        @AfterMethod
        @Test
        public void clearScreen() {
            WebDriverWait wait = new WebDriverWait(appiumDriver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOf(appiumDriver.findElement(AppiumBy.id("com.google.android.calculator:id/clr"))));
            WebElement clearButton = appiumDriver.findElement(AppiumBy.id("com.google.android.calculator:id/clr"));
            clearButton.click();
            WebElement calcScreen = appiumDriver.findElement(AppiumBy.id("com.google.android.calculator:id/formula"));
            String actualScreenText = calcScreen.getText();
            String expectedScreenText = "";
            Assert.assertEquals(actualScreenText,expectedScreenText);
        }

        @Test
        public void onePlusOne() {
            WebElement oneButton = appiumDriver.findElement(AppiumBy.accessibilityId("1"));
            oneButton.click();
            WebElement plusButton = appiumDriver.findElement(AppiumBy.accessibilityId("plus"));
            plusButton.click();
            oneButton.click();
            // equals
            WebElement equalsButton = appiumDriver.findElement(AppiumBy.accessibilityId("equals"));
            equalsButton.click();
            WebElement calcScreen = appiumDriver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final"));
            String actualScreenText = calcScreen.getText();
            String expectedScreenText = "2";
            Assert.assertEquals(actualScreenText,expectedScreenText);
        }

        @Test
        public void twoMinusOne() {
            WebElement twoButton = appiumDriver.findElement(AppiumBy.accessibilityId("2"));
            twoButton.click();
            WebElement minusButton = appiumDriver.findElement(AppiumBy.accessibilityId("minus"));
            minusButton.click();
            WebElement oneButton = appiumDriver.findElement(AppiumBy.accessibilityId("1"));
            oneButton.click();
            // equals
            WebElement equalsButton = appiumDriver.findElement(AppiumBy.accessibilityId("equals"));
            equalsButton.click();
            WebElement calcScreen = appiumDriver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final"));
            String actualScreenText = calcScreen.getText();
            String expectedScreenText = "1";
            Assert.assertEquals(actualScreenText,expectedScreenText);
        }

        @Test
        public void twoTimesTwo() {
            WebElement twoButton = appiumDriver.findElement(AppiumBy.accessibilityId("2"));
            twoButton.click();
            WebElement multiplyButton = appiumDriver.findElement(AppiumBy.accessibilityId("multiply"));
            multiplyButton.click();
            twoButton.click();
            // equals
            WebElement equalsButton = appiumDriver.findElement(AppiumBy.accessibilityId("equals"));
            equalsButton.click();
            WebElement calcScreen = appiumDriver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final"));
            String actualScreenText = calcScreen.getText();
            String expectedScreenText = "4";
            Assert.assertEquals(actualScreenText,expectedScreenText);
        }

        @Test
        public void nineDividedByThree() {
            WebElement nineButton = appiumDriver.findElement(AppiumBy.accessibilityId("9"));
            nineButton.click();
            WebElement divideButton = appiumDriver.findElement(AppiumBy.accessibilityId("divide"));
            divideButton.click();
            WebElement threeButton = appiumDriver.findElement(AppiumBy.accessibilityId("3"));
            threeButton.click();
            // equals
            WebElement equalsButton = appiumDriver.findElement(AppiumBy.accessibilityId("equals"));
            equalsButton.click();
            WebElement calcScreen = appiumDriver.findElement(AppiumBy.id("com.google.android.calculator:id/result_final"));
            String actualScreenText = calcScreen.getText();
            String expectedScreenText = "3";
            Assert.assertEquals(actualScreenText,expectedScreenText);
        }




}
