### How to use this spring-boot project

- Install packages with `mvn package`
- Run `mvn spring-boot:run` for starting the application (or use your IDE)

Application (with the embedded H2 database) is ready to be used ! You can access the url below for testing it :

- Swagger UI : http://localhost:8080/swagger-ui.html
- H2 UI : http://localhost:8080/h2-console
  - jdbc:h2:mem:test 
  - username=sa 
  - password=password

> Don't forget to set the `JDBC URL` value as `jdbc:h2:mem:test` for H2 UI.



### Instructions

- download the zip file of this project
- create a repository in your own github named 'java-challenge'
- clone your repository in a folder on your machine
- extract the zip file in this folder
- commit and push

- Enhance the code in any ways you can see, you are free! Some possibilities:
  - Add tests
  - Change syntax
  - Protect controller end points
  - Add caching logic for database calls
  - Improve doc and comments
  - Fix any bug you might find
- Edit readme.md and add any comments. It can be about what you did, what you would have done if you had more time, etc.
- Send us the link of your repository.

#### Restrictions
- use java 8


#### What we will look for
- Readability of your code
- Documentation
- Comments in your code 
- Appropriate usage of spring boot
- Appropriate usage of packages
- Is the application running as expected
- No performance issues

#### Answer
- What I did
    - Add sample junit test
    - Fix some logic bugs in save/update method
    - Protect controller end points with ,mocked spring security
    - Add basic caching logic for entity
    - Improve doc and comments
- What I would have done if you had more time
    - Add more tests and junit test suit, so we can run tests we want, for new code we
      can co-operate with sonarqube, for integration test to ensure product quality,
      I need fully automatic integration test
    - Add more detailed Swagger information
    - More reasonable business logical limits
    - General error handler
    - Standard response format
    - Cache with external KV database
    - Finish the token generator and authentication filter by business requirements
    - Integration test with Postman
    - Jenkins CI/CD
    - DockerFile
    - ELK for cloud log collecting
    - External cache/date source
    - Blue Green deploy
    - AccessLog
    - Performance measuring suit. (Jmeter etc.)
    - Diagram

#### Your experience in Java

Please let us know more about your Java experience in a few sentences. For example:

- I have 5 years experience in Java and I started to use Spring Boot from 4 year ago
- I know Spring Boot very well and have been using it for many years
