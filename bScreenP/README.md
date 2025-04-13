# AutomationScreenplay
Examples of Automation with Serenity BDD Web
:octocat:

## Installation 

This project was created in:

- Windows 11
- IntelliJ IDEA 2024.1.2
- JAVA 11
- Gradle Release 8.2
- Serenity 3.9.8
- Cucumber 3.9.8

Plugins to Intellij IDE:
* Cucumber for java
* Gherkin
* Sonarlint
* Lombok

## Usage

Make sure you have openjdk-11 installed.

Open the project with IDEA 2024.1.2. or latest

Verify your Chrome web browser version and go to 
[download the driver](https://chromedriver.chromium.org/downloads) 
corresponding to your version and unzip in next project path:



" src/test/resources/driver/<chromedriver.exe> "

Run the project from the RunnerTags class with Shift+F10.

This project has 1 package.

In "src/test/resources/features/mytest.feature" do you find one user 
history and four test cases in Gherkin language.

I recommend you read them.

To run the test cases for this user story, open the terminal from 
the "Terminal" tab of the IntelliJ IDE.

Run the following command

```
gradle clean test aggregate -Dtags=@UserStory1
```

Watch the execution and in the end find the report in next project path:

" target/site/serenity/index.html "

and open in web browser.

You can watch all tests passed.  ✅✅✅✅ 



## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## Referals
[Curso de Screenplay](https://operacion.choucairtesting.com/academy/course/view.php?id=1318)

[Julian Mesa Channel](https://www.youtube.com/@JulianMesaAutomation/videos)

## License
[GNU-gpl-3.0](https://choosealicense.com/licenses/gpl-3.0/)