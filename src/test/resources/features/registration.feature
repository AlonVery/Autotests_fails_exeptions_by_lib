Feature: registration user

  Scenario: Just registration user
    Given  Open page
    Then  Click "Register" button
    Then  Choise gender
    Then  Fill register form
    Then  Click Register button on register page
    Then  Content with "Your registration completed" is visible
