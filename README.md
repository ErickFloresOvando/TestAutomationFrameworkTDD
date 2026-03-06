<h1> Selenium Test Automation Framework (TAF) </h1>

## 📌 Project Overview
This framework implements a Hybrid Automation architecture to ensure that tests are resilient to UI changes and easy to scale.
It is a modular, scalable, and maintainable automation suite built with Java and Selenium WebDriver.

## 🚀 **Technologies & Tools**
- Java 17 (Temurin 17)
- Selenium WebDriver v4.38.0
- TestNG
- Maven
- Postman
- Jenkins

## 🛠️ Project Setup
 Prerequisites:
- Java JDK 17 installed.

- Maven installed and configured in your system path.

- Google Chrome browser updated to the latest version.

## 🏗 Architecture & Design Patterns

This project goes beyond basic scripting by implementing industry-standard design patterns:

* **Page Object Model (POM):** Decouples the test scripts from the UI locators.
* **Page Factory:** Optimized element initialization using the `@FindBy` annotation.
* **Business Objects (BO):** An additional abstraction layer that encapsulates common user journeys (e.g., `AccountCreationBO`), making tests more readable and focused on "what" to do rather than "how" to do it.
* **Data-Driven Testing:** Externalized test data management to run the same scenarios with multiple inputs without changing code.
* **Utilities Layer:** Robust helper classes for explicit waits, screenshot capturing, and file handling.

---

## 🛠 Tech Stack

| **Language** | Java |
| **Automation Tool** | Selenium WebDriver |
| **Build Tool** | Maven |
| **Test Runner** | TestNG / JUnit |
| **Design Patterns** | POM, Page Factory, Business Objects |

---
