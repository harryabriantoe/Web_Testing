Feature: Login feature in demoqa.com
  As a user go to BooksStore
  I want to take book
  So that I can see list my BooksStore

  Scenario: Login Success
    Given I am on the Login page
    When I enter my username and Password correctly
    When I click 'Login' button
    Then I am taken to the dashboard

  Scenario: Login Failed1
    Given I am on the login page
    When I enter valid username and invalid Password
    When I Click 'Login' button
    Then I cannot go to the dashboard

  Scenario: Login Failed2
    Given I am on the login Page
    When I enter invalid username and valid Password
    When I Click 'Login' Button
    Then I Cannot go to the dashboard

  Scenario: Login Failed3
    Given I am on the Login Page
    When I enter invalid username and invalid Password
    When i Click 'Login' Button
    Then I Cannot go to the Dashboard