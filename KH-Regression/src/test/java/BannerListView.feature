Feature: Banners List view Module
						
Scenario: View Banners list view with Id

Given Admin is on Banners Home Page
When he click on table icon
And select Id
Then he should see Banner list with Id only

Scenario: View Banners list with Banners 

Given Admin is on Banners Home Page
When he click on table icon
And select Banners
Then he should see Banner list with Banners only

Scenario: View Banners list with Status

Given Admin is on Banners Home Page
When he click on table icon
And select Status
Then he should see Banner list with Status only

Scenario: View Banners list with all columns

Given Admin is on Banners Home Page
When he click on table icon
And select all
Then he should see Banner list with all columns


