Feature: Gmail Compose Functionality

Scenario: Login into gmail 

    Given User launch chrome browser 
    When User can open URL with "https://www.gmail.com" 
    And User enters username as "mukandar.shaikh@humancloud.co.in" 
    And Click On Next button 
    And User entrs password "mukandar123" 
    And Click On Second page Next button 
    And Click on Compose Button 
    And Add receipent As "mushaikh7066@gmail.com" 
    And Write subject As "Incubyte" 
    And Write body As "Automation QA test for Incubyte" 
    Then Mail Should be sended

