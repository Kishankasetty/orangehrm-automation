# OrangeHRM Automation Framework

## 🚀 Project Overview

This project is a Selenium-based automation testing framework developed for the OrangeHRM web application using Java.

The framework automates:

* Login functionality
* Employee management workflow
* Validation of successful operations

It follows the Page Object Model (POM) design pattern and includes reusable utilities for better maintainability and scalability.

---

# 🛠️ Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Maven
* WebDriverManager
* Apache POI
* Extent Reports
* Git & GitHub

---

# 📁 Project Structure

```text
src/test/java
│
├── base
│   └── BaseTest.java
│
├── pages
│   ├── LoginPage.java
│   └── EmployeePage.java
│
├── tests
│   ├── LoginTest.java
│   └── EmployeeTest.java
│
├── utils
│   ├── DriverFactory.java
│   ├── ScreenshotUtils.java
│   └── ExtentManager.java
│
├── pom.xml
├── testng.xml
```

---

# ✨ Features

✅ Selenium WebDriver integration

✅ TestNG framework support

✅ Page Object Model (POM)

✅ Login automation

✅ Employee module automation

✅ Explicit waits for synchronization

✅ Screenshot utility for failures

✅ HTML reporting support

✅ Maven dependency management

---

# 🧪 Test Scenarios Covered

## Login Module

* Valid login test
* Dashboard verification

## Employee Module

* Navigate to PIM module
* Add new employee
* Verify employee creation

---

# ⚙️ Prerequisites

Before running the project, install:

* Java JDK 11+
* Maven
* Git
* Eclipse IDE or IntelliJ IDEA
* Google Chrome Browser

Verify installations:

```bash
java -version
mvn -version
git --version
```

---

# 📦 Maven Dependencies

Main dependencies used:

* selenium-java
* testng
* webdrivermanager
* extentreports
* apache poi
* commons-io

---

# ▶️ How to Run the Project

## 1. Clone Repository

```bash
git clone https://github.com/yourusername/orangehrm-automation.git
```

---

## 2. Open Project

Import project into Eclipse or IntelliJ as a Maven project.

---

## 3. Update Maven Dependencies

In Eclipse:

```text
Right Click Project → Maven → Update Project
```

---

## 4. Run Test Suite

Right click:

```text
testng.xml
```

Then:

```text
Run As → TestNG Suite
```

---

# 📊 Test Reports

## TestNG Reports

Generated inside:

```text
test-output/
```

Open:

```text
index.html
```

---

## Extent Reports

Generated inside:

```text
reports/
```

Open:

```text
report.html
```

---

# 📸 Screenshot Utility

The framework includes a reusable screenshot utility that captures browser screenshots during failures.

Screenshots are stored inside:

```text
screenshots/
```

---

# 🔥 Challenges Solved

During development, synchronization issues were handled using:

```java
ExpectedConditions.invisibilityOfElementLocated()
```

This helped resolve:

```text
ElementClickInterceptedException
```

caused by dynamic loading overlays.

---

# 🎯 Key Learning Outcomes

* Selenium framework design
* TestNG execution flow
* Explicit waits & synchronization
* Page Object Model implementation
* Reusable automation architecture
* Handling dynamic web elements
* Debugging Selenium failures

---

# 🚀 Future Enhancements

* Data-driven testing using Excel
* Jenkins CI/CD integration
* Parallel execution
* Selenium Grid support
* Docker integration
* API automation using Rest Assured

---

# 👨‍💻 Author

Kishan K

---

# 📌 Interview Summary

This project demonstrates the development of a scalable Selenium automation framework using Java, TestNG, and Maven with Page Object Model architecture and reusable utilities for automation testing.
