# UI TEST AUTOMATION 
 This repository contains a small UI test automation solution for the web application. 
Main purpose is to show this repository author`s ability to work with tools and technologies that are mentioned below.

## TEST CASE
Login into the website and add item to the cart. Check that the correct item is in the cart.

## TOOLS
* __Java__ - *OpenJDK version v11.0.17*
* __Selenium__ - *v4.5.2*
* __Cucumber__ - *cucumber-java v7.9.0 and cucumber-testng v7.9.0*
* __Maven__ - *v4.0.0*
* __TestNG__ - *v7.6.1*

## TECHNIQUES
### There are two approaches of test case realization:

   __1. Java + TestNG__ - using Java classes of *constants*, *page_object*, *utils* packages
   
*TestTask.class* - {*...src/test/java*}
  
  __2. Cucumber (using Gherkin)__ - using Java classes of *page_object*, *step_definition*, *utils* packages

*correct_item.feature* - {*...src/test/resources/features*}

*TestRunner.class* - {*...src/test/java/test_runner/*}

## SETTING UP
- using Git:
```
git clone https://github.com/kapalinsky/UI_testing.git
```
 - Or download from [here](https://github.com/kapalinsky/UI_testing/archive/refs/heads/master.zip)

## TEST EXECUTION
For test executions please use Apache Maven command:
```
mvn test
```
