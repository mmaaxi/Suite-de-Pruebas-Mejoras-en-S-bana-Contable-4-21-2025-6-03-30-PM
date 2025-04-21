Feature: Validate data integrity after system update

  Scenario: Verify data consistency post-update
    Given the system has existing data records
    When the data is updated in the system
    Then the update is performed without affecting existing data
    And previous and post-update records are compared
    Then data remains intact and consistent
    When regression tests are executed to verify system integrity
    Then no prior functionality is compromised after the update