Feature: TopMenu Test
  As a user I varify top menu list of tutorailninja site
  Given I am on main page

  @Sanity @Regression

  Scenario: verify User Should Navigate To Desktops Page Successfully
    When I mouse hover on desktop tab and click
    And I click on "Show All Desktops" tab
    Then I verify the text desktops

 @Smoke @Regression
    Scenario: verify User Should Navigate To LaptopsAndNotebooksPage Successfully
      When I mouse hoover on Laptop and notebook tab and click
      And I click  "Show all Laptop and Notebooks" tab
      Then I verify the text Laptops & Notebooks
 @Regression
     Scenario: verify User Should Navigate To ComponentsPage Successfully
       When I mouse hoover on components tab and link
       And I click on "Show All Components"
       Then I verify the text  Components
