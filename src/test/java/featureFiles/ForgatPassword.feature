Feature: to verify Forgot Password page scenarios.
@ForgotPassCorrect @forgot
Scenario: User Forgot Password with Email
Given launch "chrome" browser
Then launch url "http://localhost/impression/"
And verify page by "url" with "http://localhost/impression/"
And verify page by "title" with "Impression Bridal"
Then Close The Popup Window
Then click on homepage link on sign in / sign up
Then Click on Forgot Password link "Forgot password?"
Then Enter the Email-Id "msseervi95@gmail.com"
Then Click on Update login Button
And verify text as a label "SIGN IN"
@ForgotPassInCorrect @forgot
Scenario: User Forgot Password with Invalid Email
Given launch "chrome" browser
Then launch url "http://localhost/impression/"
And verify page by "url" with "http://localhost/impression/"
And verify page by "title" with "Impression Bridal"
Then Close The Popup Window
Then click on homepage link on sign in / sign up
Then Click on Forgot Password link "Forgot password?"
Then Enter the Email-Id " "
Then Click on Update login Button
And verify text as a label "Invalid Email-id"