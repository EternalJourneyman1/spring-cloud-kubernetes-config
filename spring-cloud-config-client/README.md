# spring-cloud-config-client

This is an example Spring Cloud Config Client.

This Repo has a companion repo of an Spring Cloud Config Server that must be running in order for this application to work properly by picking up external configuration which can be found <a href="https://github.com/EternalJourneyman1/spring-cloud-config-server">here</a> 


This app can be run from the root directory with `./gradlew bootrun`. The app will be running on http://localhost:9000


To See the `external configuration` change then open your bootstrap.yml located at
`src/main/resources/bootstrap.yml` and change the active profile from `development` to `production`. Also take note of the `application-name`

When communicating with the config server the Config Client will search the config server for the `application-name` which in this case is `client` and it will also take the active profile which in this case is `development` to search for in the configuration server as `client-development` (<applicationName>-<activeProfile>). Example configuration file can be found <a href='https://github.com/EternalJourneyman1/spring-config-server-repo/blob/main/client-development.properties'>here</a>
