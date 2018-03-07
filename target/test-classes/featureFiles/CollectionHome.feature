Feature: to verify Login page scenarios.
@collection
Scenario: User Login with correct details 
Given launch "chrome" browser
Then launch url "http://localhost/impression/"
And verify page by "url" with "http://localhost/impression/"
And verify page by "title" with "Impression Bridal"
Then Close The Popup Window
Then click on menu link on "Collections"
And verify page by "url" with "http://localhost/impression/impression/collection" 
Then MouseOver on menu "Collections"
Then Click on DropDown Menu Collection in "Wedding Gowns"
Then Click on CollectionPanel Category Gowns "Collections"
Then Select the checkbox type "Ashley & Justin Bride"
Then Select the checkbox type "Victor Harper"
Then Click on CollectionPanel Category Gowns "Collections"
And Click on CollectionPanel Category Gowns "Fabric"
#Then Select the checkbox type "Lace"
