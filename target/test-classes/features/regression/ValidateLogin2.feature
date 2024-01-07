Feature: To validate login Functionality of Adactin HotelApp
Background: 
Given user starts "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"


@regression 
Scenario: To validate login using valid username and valid password

When user enters text "reyaz009" in textbox using xpath "//input[@name='username']"
And user enters text "reyaz123" in textbox using xpath "//input[@name='password']"
And user clicks button using xpath "//input[@name='login']"
Then user verify the title of page to be "Adactin.com - Search Hotel"


@regression @prasad12
Scenario Outline: To validate login using valid username and invalid password

When user enters text '<username>' in textbox using xpath "//input[@name='username']"
And user enters text '<password>' in textbox using xpath "//input[@name='password']"
And user clicks button using xpath "//input[@name='login']"
Then user verify the presence of text using xpath "//div[@class='auth_error']/b"
|erroe message|
|Invalid Login details or Your Password might have expired. Click here to reset your password|
Then user verify the title of page to be "Adactin.com - Hotel Reservation System"

Examples:
|username| |password| 
|reyaz009| |reyaz1234|
|reyaz0090| |reyaz123|
|reyaz0090| |reyaz1234|
