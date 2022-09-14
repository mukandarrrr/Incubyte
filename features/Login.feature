Feature: Gmail Compose Functionality

Scenario: Login into gmail 

    Given User launch chrome browser 
    When User can open URL with "https://www.gmail.com" 
    And User enters username as "add official email id" 
    And Click On Next button 
    And User entrs password "add password" 
    And Click On Second page Next button 
    And Click on Compose Button 
    And Add receipent As "mu@sgjhhrj" 
    And Write subject As "Incubyte" 
    And Write body As "Automation QA test for Incubyte" 
    Then Mail Should be sended

