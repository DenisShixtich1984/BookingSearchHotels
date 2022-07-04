Feature: Booking search hotels test

  Scenario: Find Hotel with rating
    Given User on the found page
    When User search "One Hundred Shoreditch"
    And "One Hundred Shoreditch" on the search page
    Then Rating of the Hotel is "8.6"

