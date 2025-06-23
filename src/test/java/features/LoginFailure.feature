Feature: A login failure message is displayed for invalid credentials
  Scenario Outline: User provides invalid credentials and gets a login failure message
    Given User navigates to Login Page
    When User provides "<invalid_username>" and "<invalid_password>"
    Then An error message is displayed

    Examples:
      | invalid_username            | invalid_password            |
      | this_is_an_invalid_username | this_is_an_invalid_password |
