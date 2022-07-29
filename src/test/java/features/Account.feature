Feature: Account section
	@sanitytest
  Scenario: Open Saving Account
    Given User is on netbanking landing page
     When User login into application with "user1" and password "pass@1"
     Then Home page is displayed
      And Cards displayed is "true"
      
  