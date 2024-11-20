Feature:
Verifying adactin Hotel Login Module

@search
Scenario Outline:
verifying login module with valid credentials
Given User in Adactin Hotel Page
When User enter "<Username>" and "<Password>"
Then User should verify after login success message "Welcome to Adactin Group of Hotels"
When User search by entering all the fields "<Location>","<Hotels>","<RoomTypes>","<NoofRooms>","<Checkin>","<Checkout>","<Adults>" , "<Children>" and click
Then User sould verify after select hotel success message "Select Hotel" 
Examples:
|Username|Password|Location|Hotels|RoomTypes|NoofRooms|Checkin|Checkout|Adults|Children|
|Playwright1|LA3A79|Sydney|Hotel Creek|Standard|1 - One|14/08/2024|15/08/2024|1 - One|1 - One|
