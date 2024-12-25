"# AutomationExercise" 

Brief Explanation of the Task :
This task aims to automate the checkout process on the website "https://automationexercise.com/" to ensure it functions smoothly. The approach focuses on simulating a user's interaction with the website by following a structured, Page Object Model (POM) approach using Selenium and Java. Here's a breakdown of the task and methodology:

Objective :

To automate the following steps:

1- Select a product and add it to the cart.
2- Proceed to the checkout process.
3- Enter shipping and billing information.
4- Complete the order process successfully.

Approach : 


1- Page Object Model (POM):
The test follows the Page Object Model (POM) design pattern to separate the UI elements from the test logic. This enhances readability, modularity, and maintainability of the code.
POM makes it easier to update tests if UI elements change on the website.

Automation Tools:


1- Selenium WebDriver: Used for browser automation to simulate user interactions (clicks, form inputs, locators.).
2- TestNG Framework: Manages test execution and provides the ability to execute the test multiple times with different data sets.
3- Maven: Manages dependencies and builds the project.

Workflow:


1- The automation script starts by opening the website and logging in using credentials from the data file.
2- Next, it simulates adding a product to the cart, navigating to the checkout page, and entering shipping and billing details.
3- Finally, it completes the order and verifies that the order was placed successfully (optional assertion step).

Benefits of the Approach : 


1- Reusability: The script can handle different test cases by simply modifying the data file.
2- Maintainability: The Page Object Model (POM) ensures that UI element locators and test logic are kept separate.
3- Scalability: The data-driven approach allows easy scaling of test cases for multiple scenarios.

This approach ensures the checkout flow is automated effectively, simulating real-world user actions, and verifying the functionality of the checkout process on the target website.





