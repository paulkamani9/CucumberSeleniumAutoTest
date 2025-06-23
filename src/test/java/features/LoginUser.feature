Feature: User can log in to products page
  Scenario Outline: User successfully logs in after providing valid credentials
    Given User navigates to Login Page
    When User provides valid "<username>" and "<password>"
    Then User should view products page

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
