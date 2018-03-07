Feature: to verify Registration page scenarios.
@SignUp  @Login1
Scenario: New User Registration Fill with Correct details 
Given launch "chrome" browser
Then launch url "http://localhost/impression/"
And verify page by "url" with "http://localhost/impression/"
And verify page by "title" with "Impression Bridal"
Then Close The Popup Window
Then click on homepage link on sign in / sign up
Then click on homepage link on "Sign Up"
Then enter the FirstName "Mahendra" in Firstname field
And enter the LastName "Seervi" in Lastname field
And enter the Email "msseervi9512@gmail.com" in Email field
And enter the PhoneNo "9858648885" in PhoneNo field
And enter the Password "123456" in Password field
And enter the ConfirmPassword "123456" in ConfirmPassword field
And enter the ZipCode "411044" in ZipCode field
Then Click on SignUp Button
And verify page by "url" with "http://localhost/impression/impression"
And Click on Close the Registration Page

