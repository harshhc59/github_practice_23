Feature: AddToCart
This is to test whether Alex is able to add products to cart 
Scenario: The one where the user moves to cart without adding any item in it 
Given Alex has registered in to TestMeApp
When Alex search to a particular product like headphones
And try to proceed to payment without adding any item in the cart
Then Test MeApp doesn't display the cart icon
