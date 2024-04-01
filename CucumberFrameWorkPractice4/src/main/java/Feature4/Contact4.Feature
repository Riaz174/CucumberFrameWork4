Feature: Contact us form

  @tag1
  Scenario Outline: 
    Verify if the user clicks the contact link the form displays and confirm the message when user clicks the register button after entering valid data.

    Given Already opened the protrainingtech.com
    When user click on contact link
    Then user able to see joinus form
    When user enters value for First Name "<FirstName>"
    And user enters value for Last Name "<LastName>"
    And user enters value for Email "<EmailAddress>"
    And user enters value for Phone number "<PhoneNumber>"
    When user clicks the Register button
    Then user shall see confirmation message

    Examples: 
      | FirstName | LastName | EmailAddress   | PhoneNumber |
      | Nadeem    | Shabaz   | john@gmail.com |  7031346790 |
