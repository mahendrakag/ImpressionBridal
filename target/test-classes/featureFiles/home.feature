Feature: to verify home page scenarios.
@home
Scenario: to verify home page
Given launch "chrome" browser
Then launch url "http://impressionbridalstore.com/"
And verify page by "url" with "http://impressionbridalstore.com/"
And verify page by "title" with "Impression Bridal"