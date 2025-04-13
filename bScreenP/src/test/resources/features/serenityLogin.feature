Feature: login test

  Scenario Outline: testing the successful login
    Given the user is on the serenity demo page
    When attempts to log in
      | user   | pass   |
      | <user> | <pass> |
    Then validate the text on screen <message>
    Examples:
      | user  | pass     | message   |
      | retoautomationsiigo@yopmail.com | T4b4ck0ff1c3P455w0rd658* | Recaudo |
