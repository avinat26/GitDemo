Feature: Application Login

#	Background:
#	Given Driver is configured
#	When "url" is launched in browser
#	Then Application home page is opened
	
	
	@regtest
  Scenario: Home page default login
    Given User is on netbanking landing page
     When User login into application with "user1" and password "pass@1"
     Then Home page is displayed
      And Cards displayed is "true"
      
   @sanitytest   
   Scenario: Home page default login 2
    Given User is on netbanking landing page
     When User login into application with "user2" and password "pass@2"
     Then Home page is displayed
      And Cards displayed is "false"
      
   @mobiletest 
   Scenario: Mobile Login
    Given User is on Mobile landing page
     When User login into application with "user1" and password "pass@1"
     Then Mobile Home page is displayed
      And Cards displayed is "true"
      
   @regtest @smoketest   
   Scenario: signup
    Given User is on netbanking landing page
     When User sign up with following details
     | Avinash | Natekar | avinash.natekar@gmail.com | INDIA | 1265276382 |
     Then Home page is displayed
      And Cards displayed is "true"
      
   @smoketest   
   Scenario Outline: login test
   Given User is on netbanking landing page
     When User login in to application with <username> and password <password>
     Then Home page is displayed
      And Cards displayed is "false"
   Examples:
   |username |password |
   |user1    |pwd1     |
   |user2    |pwd2     |
   |user3    |pwd3     |