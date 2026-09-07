# Demo Web Shop – Selenium Hybrid Automation Framework

## 📌 Project Overview

This project is a **Selenium WebDriver Automation Testing Framework** developed using **Java, TestNG, Maven, and Page Object Model (POM)**.

The framework is designed to automate functional test scenarios for the **Demo Web Shop** application and generate detailed test execution reports.

## 🛠️ Technologies & Tools

* Java
* Selenium WebDriver
* TestNG
* Maven
* Page Object Model (POM)
* Log4j
* Extent Reports
* Apache POI
* Git & GitHub
* Eclipse IDE

## 🧪 Testing Scope

The automation framework covers the following modules:

* Account Registration
* Login
* Home Page
* Search
* Product
* Shopping Cart
* Wishlist
* Checkout
* Order-related functionality

## 🏗️ Framework Structure

```text
Demo_Web_Shop
│
├── src
│   └── test
│       └── java
│           ├── pageObject
│           ├── testBase
│           ├── testCases
│           └── utilities
│
├── testData
├── master.xml
├── Grouping.xml
├── crossbrowsertesting.xml
├── pom.xml
└── README.md
```

## ⚙️ Framework Features

* Page Object Model implementation
* Reusable Base Class
* TestNG annotations
* TestNG XML suite execution
* Data-driven testing support
* Explicit and implicit waits
* Log4j logging
* Extent HTML reports
* Automatic failure screenshot capture
* Maven dependency management
* Cross-browser testing configuration
* Git/GitHub version control

## 📊 Test Execution

**Total Test Cases:** 12
**Passed:** 12
**Failed:** 0
**Blocked:** 0

The complete master test suite was successfully executed.

## 📋 How to Run

1. Clone this repository.
2. Import the project into Eclipse or another Java IDE.
3. Update the required test data/configuration.
4. Run the Maven project or TestNG suite.
5. Execute `master.xml` to run the complete test suite.
6. View the generated Extent Report after execution.

## 📈 Reporting

The framework generates an **Extent HTML Report** containing test execution results.

For failed test cases, the framework automatically captures screenshots and stores them in the reports directory.

## 🔐 Test Data & Credentials

Sensitive credentials should **not be committed to a public repository**.

Use your local configuration file or environment variables for credentials when running the project.

## 👩‍💻 Author

**Srimathi**

Software Testing / QA Automation

### 🔗 Application Under Test

Demo Web Shop
