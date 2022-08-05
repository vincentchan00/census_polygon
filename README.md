# census_polygon
 
## Getting Started
Assuming you’ve already installed Java.
## Requirements

For building and running the application you need:

- [JDK 17](https://www.oracle.com/java/technologies/downloads/#java17)
- [Maven 3](https://maven.apache.org)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.test.census_polygon.CensusPolygonApplication` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```


## API Documentation

### Centroid based method
```
GET /api/dfw/point
```
With the following parameters:
| Parameter       | Type     | Required?  | Description                                     |
| -------------   |----------|------------|-------------------------------------------------|
| `x`     | float   | required   |  X is longitude. |
| `y`         | float   | required   |  Y is latitude.|



### Areal proportion method
```
GET /api/dfw/areal
```
With the following parameters:
| Parameter       | Type     | Required?  | Description                                     |
| -------------   |----------|------------|-------------------------------------------------|
| `x`     | float   | required   |  X is longitude. |
| `y`         | float   | required   |  Y is latitude.|
