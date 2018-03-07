Feature: to verify Contact us  page scenarios.
@ContactUsCorrect @Contact
Scenario: User Contact Us  with correct details
Given launch "chrome" browser
Then launch url "http://localhost/impression/"
And verify page by "url" with "http://localhost/impression/"
And verify page by "title" with "Impression Bridal"
Then Close The Popup Window
Then Click on Home Page Link Contact us
And verify page by "url" with "http://localhost/impression/impression/contact_us"
Then Enter the name in Contact us form "Mahendra"
And Enter the Email in Contact us form "Mahendra@gmail.com"
And Enter the phone in Contact us form "7020154897"
And Select the  Store in ContactUs Form by "3" by "index"
And Select The Contact Media
And Select the Contact Reason "4" by "index"
And Enter the text Message "hello i am MCA student"
Then Click on Submit button in Contact form
And verify text as "Submitted Successfully"
@ContactUsInCorrect @Contact
Scenario: User Contact Us  with Incorrect details
Given launch "chrome" browser
Then launch url "http://localhost/impression/"
And verify page by "url" with "http://localhost/impression/"
And verify page by "title" with "Impression Bridal"
Then Close The Popup Window
Then Click on Home Page Link Contact us
And verify page by "url" with "http://localhost/impression/impression/contact_us"
Then Enter the name in Contact us form "Mahendra"
And Enter the Email in Contact us form "Mahendra@gmal.com"
And Enter the phone in Contact us form "702015gdgd"
And Select the  Store in ContactUs Form by "3" by "index"
And Select The Contact Media
And Select the Contact Reason "0" by "index"
And Enter the text Message "hello i am MCA student"
Then Click on Submit button in Contact form
And verify text as "There was error occured while submitting the form"