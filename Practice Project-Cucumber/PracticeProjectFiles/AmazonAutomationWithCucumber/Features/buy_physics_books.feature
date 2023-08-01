Feature: Buy Mobile Phone

Scenario: A user must be able to buy physics books on Amazon
Given a user is on the landing page of Amazon
When he enters physics books in the search box
And he selects the 3rd option from the drop-down list
And he select rating 4star and above from left side bar
And he clicks on the first search result
And he switches focus on the new tab
And he clicks on Add to Cart button
And he verify the text - "Added to Cart" is displayed
And he clicks on Proceed to Buy button
Then he must be able to purchase the book successfully.
