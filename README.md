# Swag Labs Automation Framework

##  Overview

This is a Selenium-based automation framework implemented in Java using TestNG. It automates end-to-end test scenarios for [Swag Labs](https://www.saucedemo.com/) including login,product pages ,cart functionality, and checkout flow(confirmation page).

---

## Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Page Object Model (POM)
- BaseClass for code resuable method
- Logging: Log4j / java.util.logging
- Reporting: TestNG reports(Default report)

---

##  Setup Instructions

1. **Install Java (JDK 21 )
2. **Install Chrome browser  
3. **Clone the repository 
   ```bash
   git clone <your-repo-url>
   cd swaglabs-automation
Install dependencies
If using Maven:

bash
Copy
Edit
mvn clean install
 How to Run Tests
To run all tests:

bash
Copy
Edit
mvn test
To run tests via TestNG XML suite:

bash
Copy
Edit
mvn test -DsuiteXmlFile=testng.xml
✅ Test Scenarios Covered
Login with valid credentials

Login with invalid credentials

Add a product to cart

Checkout flow

# Reports
Test reports are generated under target/surefire-reports (for TestNG) or test-output (if using ExtentReports).

# Logging
Logging is enabled using Log4j / java.util.logging. Logs are stored under /logs/test.log.

# Design Decisions
Used Page Object Model to separate test logic from UI structure.

Followed single responsibility principle in page classes.

Config-driven setup for browser and base URL.

# Bonus Features
Data-driven testing using TestNG DataProvider

Optional: Parallel execution setup in testng.xml
