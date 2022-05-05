
Feature: User Account

Scenario: Admin can login to the application

Given Admin is in landing page
When he login as valid admin user to the application
Then he should see the dashboard
Then he should logout