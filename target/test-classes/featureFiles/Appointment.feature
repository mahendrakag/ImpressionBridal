Feature: to verify Appointment page
@Appointment @App
Scenario: to verify the Appointment With Correct details page
Given launch "chrome" browser
Then launch url "http://localhost/impression/"
And verify page by "url" with "http://localhost/impression/"
And verify page by "title" with "Impression Bridal"
Then Close The Popup Window
Then click on homepage link on Make an appointment
And verify page by "url" with "http://localhost/impression/impression/appointment"
Then enter the Name "Mahendra" in name field
And enter the EmailId "msseervi95@gmail.com"
And enter the Phone "9858648885"
Then select value form dropdown "2" by "index"
And enter the Event month "4" by "value"
And enter the Event year "2020" by "value"
Then enter the Event day "5"
Then Select the raduio button
Then enter the Appointment month "5" by "value"
And enter the Appointment year "2021" by "value"
And enter the Appointment day "15"
Then select value form dropdown "1" by "index"
Then Select the raduio button
And Enter the Message "Hello box impression"
Then Click on Submit
And verify text as "Appointment Confirmed"
@AppointmentIncorrect  @App
Scenario: to verify the Appointment With InCorrect details 
Given launch "chrome" browser
Then launch url "http://localhost/impression/"
And verify page by "url" with "http://localhost/impression/"
And verify page by "title" with "Impression Bridal"
Then Close The Popup Window
Then click on homepage link on Make an appointment
And verify page by "url" with "http://localhost/impression/impression/appointment"
Then enter the Name "2285gyggy" in name field
And enter the EmailId "msseervi95@gmail1.com"
And enter the Phone "98586885ghh"
Then select value form dropdown "2" by "index"
And enter the Event month "4" by "value"
And enter the Event year "2020" by "value"
Then enter the Event day "5"
Then Select the raduio button
Then enter the Appointment month "5" by "value"
And enter the Appointment year "2021" by "value"
And enter the Appointment day "15"
Then select value form dropdown "1" by "index"
Then Select the raduio button
And Enter the Message "Hello box impression"
Then Click on Submit
And verify text as "Apointment not confirmed, please try again or make a call for Appointment"