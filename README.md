# Learn Microservices with Spring Boot - Chapter 3

This repository contains the source code of the practical use case described in the book [Learn Microservices with Spring Boot (2nd Edition)](https://thepracticaldeveloper.com/learn-microservices-v2/).

The book follows a pragmatic approach to building a Microservice Architecture. You start with a small monolith and examine the _pros_ and _cons_ that come with a move to microservices. 

## Chapter 3 version

In Chapter 3, the goal is to build a Spring Boot application according to good practices:

* _Domain-Driven Design_. We analyze the boundaries of the _Users_ and _Challenges_ domains.
* _3-layer Application Design_. This chapter focuses on two of the layers: _Controller_, and _Service_. 
* _Test-Driven Development_. You write tests before building the functionalities.
* _Monolith First_. We keep two domains separate by using different root packages.

The next figure shows the status of the Multiplication application by the end of the Chapter, as it's also included in this repository.

![Multiplication application - Logical View - Chapter 3](resources/app-layers-chapter3.png)

There are two functional domains included in this first application: Users, and Challenges. See the figure below.

![Multiplication application - Domains](resources/business_model.png)

## Running the app

_Note: You need to use at least JDK version 14 to run this project._ 

To start the Spring Boot application, you can use the command line with the included Maven wrapper:

```bash
$ ./mvnw spring-boot:run
``` 

## Questions

* Do you have questions about how to make this application work?
* Did you get the book and have questions about any concept explained within this chapter?
* Have you found issues using updated dependencies?

Don't hesitate to create an issue in this repository and post your question/problem there. 

## About the book

Are you interested in building a microservice architecture from scratch? You'll face all the challenges of designing and implementing a distributed system one by one, and will be able to evaluate if it's the best choice for your system.

Visit [https://thepracticaldeveloper.com/learn-microservices-v2](https://thepracticaldeveloper.com/learn-microservices-v2/) for all the details about the book.
