Feature: Login functionality


Background:
Given a user on the landing page of Amazon
When he hovers the pointer over Hello Sign-in menu
And he clicks on Sign-in button in the sub-menu

Scenario: A user with invaild credentials must get an error message while logging in
And he enters invaild email address in the Email text-bax
And he clicks on Continue button
Then he must see the error message - "We cannot find an account with that email address".

Scenario Outline: A user with invaild credentials must get an error message while logging in
And he enters invaild email address - "<emailId>" in the Email text-box
And he clicks on Continue button
Then he must see the error message - "We cannot find an account with that email address".

Examples:
|emailId|
|batman112233@gmail.com|
|superman445566@gmail.com|
|spiderman778899@gmail.com|
|ironman113355@gmail.com|
|captianplanet224466@gmail.com|