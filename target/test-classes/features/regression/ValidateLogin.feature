Feature: To validate login Functionality of Adactin HotelApp

Scenario: To validate login using valid username and valid password

Given user starts "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"
When user enters text "reyaz009" in textbox using xpath "//input[@name='username']"
And user enters text "reyaz123" in textbox using xpath "//input[@name='password']"
And user clicks button using xpath "//input[@name='login']"
Then user verify the title of page to be "Adactin.com - Search Hotel"
@regression @prasad12
Scenario: To validate login using valid username and invalid password

Given user starts "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"
When user enters text "reyaz009" in textbox using xpath "//input[@name='username']"
And user enters text "reyaz1234" in textbox using xpath "//input[@name='password']"
And user clicks button using xpath "//input[@name='login']"
Then user verify the presence of text using xpath "//div[@class='auth_error']/b"
|erroe message|
|Invalid Login details or Your Password might have expired. Click here to reset your password|
Then user verify the title of page to be "Adactin.com - Hotel Reservation System"
@regression @smoke @prasad12
Scenario: To validate login using invalid username and valid password

Given user starts "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"
When user enters text "reyaz0090" in textbox using xpath "//input[@name='username']"
And user enters text "reyaz123" in textbox using xpath "//input[@name='password']"
And user clicks button using xpath "//input[@name='login']"
Then user verify the presence of text using xpath "//div[@class='auth_error']/b"
|erroe message|
|Invalid Login details or Your Password might have expired. Click here to reset your password|
Then user verify the title of page to be "Adactin.com - Hotel Reservation System"

@regression @smoke @prasad12
Scenario: To validate login using invalid username and invalid password

Given user starts "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"
When user enters text "reyaz0009" in textbox using xpath "//input[@name='username']"
And user enters text "reyaz1234" in textbox using xpath "//input[@name='password']"
And user clicks button using xpath "//input[@name='login']"
Then user verify the presence of text using xpath "//div[@class='auth_error']/b"
|erroe message|
|Invalid Login details or Your Password might have expired. Click here to reset your password|
Then user verify the title of page to be "Adactin.com - Hotel Reservation System"

