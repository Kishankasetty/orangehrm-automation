package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.EmployeePage;
import pages.LoginPage;

public class EmployeeTest extends BaseTest {

    @Test
    public void addEmployeeTest() throws InterruptedException {

        LoginPage lp = new LoginPage(driver);

        lp.login("Admin", "admin123");

        EmployeePage ep = new EmployeePage(driver);

        ep.addEmployee("Kishan", "Test2");

        Thread.sleep(5000);

        System.out.println(driver.getCurrentUrl());

        Assert.assertTrue(
                driver.getCurrentUrl()
                        .contains("viewPersonalDetails"));
    }
}