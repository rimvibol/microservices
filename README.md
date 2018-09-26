# spring-cloud-microservices

## Running the services

For each service, navigate to its directory and execute the `spring-boot:run` maven plugin (using the maven wrapper or your own installed maven):
```shell
cd <subfolder>
./mvnw spring-boot:run
```

Each of the services can then be reached through its public URI, on the following ports:

Microservice | Port
--- | ---
config server | 8888
eureka (service registry) | 8761
zuul (gateway) | 9999
colour microservice | 8080
car microservice | 8081
hystrix dashboard | 8010
admin panel | 8020
microservices dashboard | 8050

Start the config server and eureka first.
# microservices
# spring-cloud-microservices
