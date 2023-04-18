@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Title of your scenario outline
    Given Launch and load url
    When provide credentials "<username>" and "<password>"
    Then validate login

    Examples: 
      | username | password |
      | Madhavan | NewLod   |
      
