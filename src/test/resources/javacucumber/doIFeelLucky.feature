Feature: Do I feel lucky?
  Everybody wants to know if I feel lucky

  Scenario: I do feel lucky
    Given feeling lucky
    When I ask myself, do I feel lucky?
    Then I should be told "yes"