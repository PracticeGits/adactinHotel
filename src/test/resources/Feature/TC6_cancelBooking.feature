Feature:
Verifying adactin Hotel Login Module

@cancel
Scenario Outline:
verify User can cancel the booking by using bookingid.
Given User in Adactin Hotel Page
When User enter "<Username>" and "<Password>"
Then User should verify after login success message "Welcome to Adactin Group of Hotels"
When User search by entering all the fields "<Location>","<Hotels>","<RoomTypes>","<NoofRooms>","<Checkin>","<Checkout>","<Adults>" , "<Children>" and click
Then User sould verify after select hotel success message "Select Hotel"
And User should verify hotel name present with selected "<Hotels>" successfully and  click and click continue
Then User should verify "Book A Hotel" message
And User book by entering all the required fiels "<FirstName>","<LastName>","<BillingAddress>","<CreditCardNo>","<CreditCardType>","<ExpiryDateMonth>","<ExpiryDateYear>","<CVV>" and click BookNow
 Then User should verify after booked selected hotel name "<Hotels>" is present successfully and save the orderID
 When User navigate to My Itinery page
 Then User should verify the  message "Booked Itinerary" after navigate to My Itinery page
 When User search the orderId with saved orderId
 Then User should verify the same orderId is present successfully
 And User should verify the same hotel name "<Hotels>" is present successfully
 And User select the hotel and hit cancel selected
 When User search the orderId with saved orderId
 Then User should verify the  message "0 result(s) found. sShow all"
 
 
Examples:
|Username|Password|Location|Hotels|RoomTypes|NoofRooms|Checkin|Checkout|Adults|Children|FirstName|LastName|BillingAddress|CreditCardNo|CreditCardType|ExpiryDateMonth|ExpiryDateYear|CVV|
|Playwright1|LA3A79|Sydney|Hotel Creek|Standard|1 - One|14/08/2024|15/08/2024|1 - One|1 - One|Kula|RG|pamarkoil|1234567891234567|American Express|February|2030|123|