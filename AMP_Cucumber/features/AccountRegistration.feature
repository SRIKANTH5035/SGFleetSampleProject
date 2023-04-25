Feature: Account Registration

  Scenario: Successful Account Registration with Valid user details
    Given User Launch browser
    And opens URL "https://www.amp.com.au/"
    When User navigate to Banking tab
    And click on savings
    And Click on Learnmore AMP Saver account
    Then User Provides information to create account
