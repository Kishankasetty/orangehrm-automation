package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmployeePage {

    WebDriver driver;

    public EmployeePage(WebDriver driver) {
        this.driver = driver;
    }

    By pimMenu =
            By.xpath("//span[text()='PIM']");

    By addEmployeeBtn =
            By.xpath("//button[contains(.,'Add')]");

    By firstName =
            By.name("firstName");

    By lastName =
            By.name("lastName");

    By saveBtn =
            By.xpath("//button[@type='submit']");

    public void addEmployee(String fName, String lName) {

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(
                ExpectedConditions.elementToBeClickable(pimMenu));

        driver.findElement(pimMenu).click();

        wait.until(
                ExpectedConditions.elementToBeClickable(addEmployeeBtn));

        driver.findElement(addEmployeeBtn).click();

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(firstName));

        driver.findElement(firstName).sendKeys(fName);

        driver.findElement(lastName).sendKeys(lName);

        driver.findElement(firstName).sendKeys(fName);

        driver.findElement(lastName).sendKeys(lName);

        wait.until(
            ExpectedConditions.invisibilityOfElementLocated(
                By.className("oxd-form-loader")));

        wait.until(
            ExpectedConditions.elementToBeClickable(saveBtn));

        driver.findElement(saveBtn).click();
        
    }
}