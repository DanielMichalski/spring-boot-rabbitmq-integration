# Spring Boot RabbitM Integration
[![Build Status](https://github.com/DanielMichalski/spring-boot-rabbitmq-integration/workflows/Java%20CI%20with%20Maven/badge.svg?branch=master)](https://github.com/DanielMichalski/spring-boot-rabbitmq-integration/actions?query=workflow%3A%22Java+CI+with+Maven%22)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://github.com/DanielMichalski/spring-boot-java-swing-reservations/blob/master/LICENSE)

This project aims to present how to create and configure a Spring Boot + RabbitMQ application.
The project is built using Java, Spring Boot, RabbitMQ and Docker.

## Table of Contents
* [Prerequisites](#prerequisites)
* [Libraries](#libraries)
* [Running the application](#running-the-application)
    * [On Windows](#on-windows)
    * [On MacOS/ Linux](#on-macos-linux)
* [RabbitMQ access](#rabbitmq-access)
* [Sending message](#sending-message)
* [Screens](#screens)

## Prerequisites
- [Java JDK](https://www.oracle.com/pl/java/technologies/javase-downloads.html) version 8+
- [Docker Desktop](https://www.docker.com/products/docker-desktop) 

## Libraries
| Library name                                                                                                     | Description                                                                                                                          |
|------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------|
| [Spring Boot 2](https://spring.io/projects/spring-boot)                                                          | Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".                 |
| [RabbitMQ](https://www.rabbitmq.com/)                                                                            | RabbitMQ is the most widely deployed open source message broker.                                                                     |
| [Docker Compose](https://docs.docker.com/compose/)                                                               | Compose is a tool for defining and running multi-container Docker applications.                                                      |

## Running the application
#### On Windows
```bash
## Run RabbitMQ on Docker
docker-compose up -d

## Build and run publisher application using Maven Wrapper
mvnw.cmd -f rabbitmq-publisher/pom.xml clean install spring-boot:run

## Build and run receiver application using Maven Wrapper
mvnw.cmd -f rabbitmq-receiver/pom.xml clean install spring-boot:run
```

#### On MacOS/ Linux
```bash
## Run RabbitMQ on Docker
docker-compose up -d

## Build and run publisher application using Maven Wrapper
./mvnw -f rabbitmq-publisher/pom.xml clean install spring-boot:run

## Build and run receiver application using Maven Wrapper
./mvnw -f rabbitmq-receiver/pom.xml clean install spring-boot:run
```

## RabbitMQ access
| RabbitMQ URL            | Username     | Password   |
|-------------------------|--------------|----------- |
| http://localhost:15672  | admin        | admin   |

## Sending message
In order to send a message to the queue please send a request:
```bash
curl --header "Content-Type: application/json" --request POST --data "{\"firstName\":\"John\",\"lastName\":\"Black\"}" http://localhost:8080/api/messages
```

## Screens
![Screen 1](https://github.com/DanielMichalski/spring-boot-rabbitmq-integration/blob/master/.github/images/RabbitMQ.jpg "Screen 1")

![Screen 2](https://github.com/DanielMichalski/spring-boot-rabbitmq-integration/blob/master/.github/images/Command.jpg "Screen 2")

![Screen 3](https://github.com/DanielMichalski/spring-boot-rabbitmq-integration/blob/master/.github/images/Publisher.jpg "Screen 3")

![Screen 4](https://github.com/DanielMichalski/spring-boot-rabbitmq-integration/blob/master/.github/images/Receiver.jpg "Screen 4")

