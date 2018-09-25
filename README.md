# javacucumber

A simple experiment with cucumber in java. 

The test cases/scenarios are written in the gherkin language "Given, When, Then". You don't need to know how to code, in order to write tests cases/scenarios. 

It's actually common when deciding to use a framework like cucumber, that tests are specified together with product owners, requirement analysts, ux-designer or the team. 

In `/src/test/resources/javacucumber/doIFeelLucky.feature` the testcase is specified. (often in collaboration with others)
In `/src/test/java/javacucumber/Stepdefs.java` the developer or automation engineer implements the test.

### how it can be used for automated acceptance testing
In a continuous delivery context, a requirements analyst(or team, automation engineer, developer(s), whatever lineup works for you) can together with the product owner(stakeholder) create test cases/scenarios for a user story. When these are implemented they can act like "Automated Acceptance Tests", which is the contract for releasing the feature, thus the team getting the acceptance of the stakeholder.

### run tests
* `mvn test`
