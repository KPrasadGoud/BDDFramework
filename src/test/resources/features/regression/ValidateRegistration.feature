Feature: To Validate a Registration Functionality Of Addacting Hotel App
@regression @smoke
Scenario Outline: To entres the Registration 

Given user starts the "chrome" browser
And user launch the app using url "https://adactinhotelapp.com/"
When user click the link "//td[@class='login_register']/a"
Then user varify the title of the page "Adactin.com - New User Registration"
When user enters Name text "prasad" in text box using xpth "//input[@id='username']"
And user enters Password text "prasad123" in text box using xpath "//input[@id='password']"
And user enters  Confirm Password text "prasad123" in text box using xpath "//input[@id='re_password']"
And user enters Full Name text "PrasadGoud" in text box using xpath "//input[@id='full_name']"
And user enters Email Address text "prasad@12gmail.com" in text box using xpath "//input[@id='email_add']"
And user enters Captcha Text text "Xyaz" in text box using xpath "//input[@name='captcha']"
And user Click The Check box using xpath "//input[@name='tnc_box']"

@regression @smoke @prasad
Scenario Outline: To entres the Registration 

Given user starts the "chrome" browser
And user launch the app using url "https://adactinhotelapp.com/"
When user click the link "//td[@class='login_register']/a"
Then user varify the title of the page "Adactin.com - New User Registration"
When user enters Name text '<username>' in text box using xpth "//input[@id='username']"
And user enters Password text '<pass>' in text box using xpath "//input[@id='password']"
And user enters  Confirm Password text '<conpass>' in text box using xpath "//input[@id='re_password']"
And user enters Full Name text '<fname>' in text box using xpath "//input[@id='full_name']"
And user enters Email Address text '<email>' in text box using xpath "//input[@id='email_add']"
And user enters Captcha Text text '<cap>' in text box using xpath "//input[@name='captcha']"
And user Click The Check box using xpath "//input[@name='tnc_box']"

Examples:
|username| |pass| |conpass| |fname| |email| |cap|
|prasad| |prasad123| |prasad123| |PrasadGoud| |prasad@12gmail.com| |Xyaz| 
|goud| |goud12| |goud12| |goud| |goud@gmail.com| |vcc|