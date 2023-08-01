Feature: Buy Mobile Phone

Background:
Given a user is on the landing page of Amazon
When he click on Moblies in the navigation bar
And he hovers the pointer over Mobiles & Accessories

Scenario: A user must be able to buy a mobile phone on Amazon
And he clicks on Apple in the sub-menu
And he clicks on the second available phone
And he switches focus on the new tab
And he clicks on Buy Now button
Then he must be able to purchase the mobile phone successfully.