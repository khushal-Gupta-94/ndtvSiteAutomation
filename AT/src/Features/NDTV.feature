Feature: Automation testing webpage validations
  @Test
  Scenario: Verify that Automation Testing web application menu item is working fine.
    Given Open "chrome" Browser
    When Launch "https://www.ndtv.com/" with expected page title "Get Latest News, India News, Breaking News, Today's News - NDTV.com"
    Then Click on "WEATHER" tab with expected page title "NDTV Weather - Weather in your Indian City"
    Then Search "Ajmer" city and check the checkbox
    Then Fetch all data shown for "Ajmer"
    Then close the browser
    Then Fetch data for "Ajmer" from API using "64d62235e7b5b4d48030c8cdd4d62981"
