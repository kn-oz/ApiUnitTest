# Unit API Testing with TestNG and Rest Assured

## Overview

This repository contains a comprehensive suite of unit API tests, built using the **TestNG** framework and leveraging the **Rest Assured** library. The project is structured following the **Page Object Model (POM)** design pattern, ensuring modular, maintainable, and scalable test code.

## Project Structure

- **src/main/java**: Contains the main application logic and any utility classes.
- **src/test/java**: Contains the TestNG test cases and page object classes.
- **resources/testdata**: Includes test data files (e.g., JSON, CSV) used in the tests.
- **resources/config**: Configuration files such as the base URL and environment settings.

## Key Features

- **TestNG Framework**: The project utilizes TestNG for organizing and executing tests, providing powerful features like parallel execution, data-driven testing, and reporting.
  
- **Rest Assured**: Rest Assured is used for simplifying the process of testing RESTful APIs. It supports validation of HTTP responses, making it easier to write readable and maintainable API tests.

- **Page Object Model (POM)**: The POM design pattern is implemented to create reusable and maintainable test code. Each API endpoint is represented as a separate page object class, encapsulating the logic for interacting with that endpoint.

- **Base URL and Configurations**: The project is configured to use a base URL, allowing tests to be easily run against different environments by simply changing the configuration files.

- **Test Data**: External test data is stored in the `resources/testdata` directory, enabling data-driven testing and separation of test data from test logic.

