Feature: User can log in to products page
  Scenario: User successfully logs in after providing valid credentials
    Given User navigates to Login Page
    When User provides valid login credentials
    Then User should view products page