# TestFrameworkFirebaseApp
This is the test automation framework based on Selenium-webdriver, junit, maven to create tests easily.



## Requirements:
  Chrome Browser v79+
  Jdk installed (in my case Open jdk 13)
set path JAVA_HOME on installed jdk 

## Run configuration:
  Name: AmazonBasicTest
  TestKind: Class
  Class: com.test.homepage.AmazonBasicTest
  VM options: -ea
  Working directory: $MODULE_WORKING_DIR$
  Use classpath of module: Regression Test


## Project Structure
The project consist in 3 modules:
  PageObjects: Consists in the definition of elements locators of the page as objects, in order to reuse and to have a good easy-to-change approach.
  
  RegressionTests: Consists in the definition of test to be executed
  TestFramework: Consists in the definition of general assesment of the framework, such as the definition of the browser, driver, etc.
