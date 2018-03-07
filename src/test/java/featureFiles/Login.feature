Feature: to verify Login page scenarios.
@Login  @Login1
Scenario: User Login with correct details 
Given launch "chrome" browser
Then launch url "http://impressionbridalstore.com/"
And verify page by "url" with "http://impressionbridalstore.com/"
And verify page by "title" with "Impression Bridal"
Then Close The Popup Window
Then click on homepage link on sign in / sign up
Then enter the Email "msseervi951@gmail.com"
And enter the Password "123456"
Then click on homepage link on Login
And verify page by "url" with "http://impressionbridalstore.com/impression"
@PasswordInCorrect  @Login1
Scenario: User Login with PasswordInCorrect 
Given launch "chrome" browser
Then launch url "http://impressionbridalstore.com/"
And verify page by "url" with "http://impressionbridalstore.com/"
And verify page by "title" with "Impression Bridal"
Then Close The Popup Window
Then click on homepage link on sign in / sign up
Then enter the Email "msseervi951@gmail.com"
And enter the Password "1234561"
Then click on homepage link on Login
And verify page by "url" with "http://impressionbridalstore.com/impression"
@EmailInCorrect  @Login1
Scenario: User Login with EmailInCorrect  
Given launch "chrome" browser
Then launch url "http://impressionbridalstore.com/"
And verify page by "url" with "http://impressionbridalstore.com/"
And verify page by "title" with "Impression Bridal"
Then Close The Popup Window
Then click on homepage link on sign in / sign up
Then enter the Email "msseervi951@gmail1.com"
And enter the Password "123456"
Then click on homepage link on Login
And verify page by "url" with "http://impressionbridalstore.com/impression"
@Email&PasswordInCorrect  @Login1
Scenario: User Login with Email&PasswordInCorrect
Given launch "chrome" browser
Then launch url "http://impressionbridalstore.com/"
And verify page by "url" with "http://impressionbridalstore.com/"
And verify page by "title" with "Impression Bridal"
Then Close The Popup Window
Then click on homepage link on sign in / sign up
Then enter the Email "msseervi951@gmail1.com"
And enter the Password "1234561"
Then click on homepage link on Login
And verify page by "url" with "http://impressionbridalstore.com/impression"

