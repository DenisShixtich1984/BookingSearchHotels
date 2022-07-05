Feature: Booking search hotels test

  Scenario: Find Hotel with rating
    When User search "One Hundred Shoreditch"
    And "One Hundred Shoreditch" on the search page
    Then Rating of the Hotel is "8.6"

  Scenario: Find second Hotel with rating
    When We search "The Jade"
    And "The Jade" on the page
    Then  Hotel rating is "7.9"
