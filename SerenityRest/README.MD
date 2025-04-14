# Serenity Rest API Testing with Screenplay and Gradle

This project demonstrates how to set up and use the Serenity BDD framework, specifically `serenity-rest-assured`, for testing RESTful APIs. It implements the **Screenplay pattern** for creating maintainable, readable, and scalable tests. **Gradle** is used as the build automation tool.

## Overview

This repository serves as a starting point or example for building robust API test automation suites. It focuses on leveraging the actor-centric approach of the Screenplay pattern combined with the powerful reporting and integration capabilities of Serenity BDD.

## Key Features

* **REST API Testing:** Utilizes `serenity-rest-assured` for fluent and expressive API request definition and validation.
* **Screenplay Pattern:** Organizes test logic using Actors, Abilities, Tasks, Interactions, and Questions for improved clarity and reusability.
* **Gradle Build:** Uses Gradle for dependency management and running test tasks efficiently.
* **Serenity Reports:** Generates comprehensive, living documentation reports after test execution.
* **Example Tests:** Includes sample tests demonstrating common API interactions (GET, POST, PUT, DELETE).

## Technology Stack

* **Java:** JDK 11 or higher recommended
* **Serenity BDD:** Core, Screenplay, Screenplay REST, REST Assured modules
* **Gradle:** Build Tool (using Gradle Wrapper is recommended)
* **JUnit 5:** Test Runner (or TestNG if preferred)
* **AssertJ / Hamcrest:** Assertion Libraries

## Prerequisites

Before you begin, ensure you have met the following requirements:

* **Java Development Kit (JDK):** Version 11 or higher installed. You can check with `java -version`.
* **Git:** For cloning the repository.
* **(Optional) Gradle:** While the project includes the Gradle Wrapper (`gradlew`), having Gradle installed system-wide can sometimes be helpful. You can check with `gradle -v`.

## Getting Started

To get a local copy up and running, follow these simple steps:

1.  **Clone the repository:**
    ```bash
    git clone <your-repository-url>
    ```
2.  **Navigate to the project directory:**
    ```bash
    cd <your-project-directory-name>
    ```
3.  **(Optional) Import into your IDE:** Import the project into your favorite IDE (like IntelliJ IDEA or Eclipse) as a Gradle project.

## Running the Tests

Tests are executed using the Gradle wrapper, which ensures a consistent build environment.

* **On Linux/macOS:**
    ```bash
    ./gradlew clean test
    ```
* **On Windows:**
    ```bash
    gradlew.bat clean test
    ```

This command will compile the code, download dependencies (if needed), run the tests, and generate the Serenity reports.

*(Optional: Add instructions on how to run specific tests using tags or test classes if applicable, e.g., using `--tests`)*

## Viewing Test Reports

Serenity BDD generates detailed HTML reports after the tests have run.

1.  Navigate to the report directory: `build/site/serenity/`
2.  Open the `index.html` file in your preferred web browser.

These reports provide a comprehensive overview of the test execution, including steps, results, screenshots (for UI tests, less relevant here but part of Serenity), and REST interaction details.

## Project Structure

The project follows a standard Gradle project structure:
