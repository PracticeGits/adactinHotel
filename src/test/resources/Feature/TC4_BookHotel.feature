Feature:
Verifying adactin Hotel Login Module
@book
Scenario Outline:
verifying login module with valid credentials
Given User in Adactin Hotel Page
When User enter "<Username>" and "<Password>"
Then User should verify after login success message "Welcome to Adactin Group of Hotels"
When User search by entering all the fields "<Location>","<Hotels>","<RoomTypes>","<NoofRooms>","<Checkin>","<Checkout>","<Adults>" , "<Children>" and click
Then User sould verify after select hotel success message "Select Hotel"
And User should verify hotel name present with selected "<Hotels>" successfully and  click and click continue
Then User should verify "Book A Hotel" message
And User book by entering all the required fiels "<FirstName>","<LastName>","<BillingAddress>","<CreditCardNo>","<CreditCardType>","<ExpiryDateMonth>","<ExpiryDateYear>","<CVV>" and click BookNow
Then User should verify "Booking Confirmation" is present
Examples:
|Username|Password|Location|Hotels|RoomTypes|NoofRooms|Checkin|Checkout|Adults|Children|FirstName|LastName|BillingAddress|CreditCardNo|CreditCardType|ExpiryDateMonth|ExpiryDateYear|CVV|
|Playwright1|LA3A79|Sydney|Hotel Creek|Standard|1 - One|14/08/2024|15/08/2024|1 - One|1 - One|Kula|RG|pamarkoil|1234567891234567|American Express|February|2030|123|