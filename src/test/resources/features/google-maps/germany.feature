Feature: Locate cities in around the world using Google Maps
#  Scenario: Locate Berlin Germany using Google Maps
#    Given I am on maps.google.com
#    When I search for Berlin Germany
#    Then I should see Berlin on the map
#
#  Scenario: Locate LA in USA
#    Given I am on maps.google.com
#    When I search for Los Angeles, USA
#    Then I should see Los Angeles on the map
#
#  Scenario: Locate Bydgoszcz in Poland
#    Given I am on maps.google.com
#    When I search for Bydgoszcz, Poland
#    Then I should see Bydgoszcz on the map

  Scenario: Locate Pizza in Berlin using Google Maps
    Given I am on maps.google.com
    When I search for pizza in Berlin
    Then I should see pizza restaurant the map
