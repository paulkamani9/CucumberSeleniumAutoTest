Feature: A login failure message is displayed for invalid credentials
  Scenario: User provides invalid credentials and gets a login failure message
    Given User navigates to Login Page
    When User provides invalid login credentials
    Then An error message is displayed