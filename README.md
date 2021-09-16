# Room Scheduling API

This is a simple room scheduling API project to be consumed by the [Room Scheduling App](https://github.com/9Rain/dio-santander-room-scheduling-app). It was developed as part of Santander Bootcamp Fullstack, based on the [project](https://github.com/Kamilahsantos/Crud-Spring-liveCoding-Dio) built by Kamila Santos, during the classes.

## Stack

- Spring Web
- Spring Data JPA
- H2 Database
- Java 11
- Gradle

## Running the project

Run the following terminal command in the project's root folder:

```shell script
./gradlew bootRun
```

## Endpoints

```
POST /api/v1/rooms
```

```
GET /api/v1/rooms
```

```
GET /api/v1/rooms/:id
```

```
PUT /api/v1/rooms/:id
```

```
DELETE /api/v1/rooms/:id
```
