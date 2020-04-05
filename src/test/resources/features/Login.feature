Feature: Login
  As a tourist
  I want to book a travel, book a car or aplly for visa
  I will login Php Travels Native application

  Scenario: Login with valid account
    Given that Chung is on the login screen
    When he login with valid account
      | email               | password |
      | user@phptravels.com | demouser |