Feature:
Verifying adactin Hotel Login Module

@login
Scenario Outline:
verifying login module with valid credentials
Given User in Adactin Hotel Page
When User enter "<Username>" and "<Password>"
Then User should verify after login success message "Welcome to Adactin Group of Hotels"
Examples:
|Username|Password|	
|Playwright1|LA3A79|