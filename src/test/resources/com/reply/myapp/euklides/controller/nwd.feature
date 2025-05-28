Feature: NWD
  Test if GCD is properly calculated

  Scenario: Calculate nwd
    Given I have a request with 12 and 18
    When I call nwd endpoint
    Then the result should be 6
