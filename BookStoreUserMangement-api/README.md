# Simple bookstore application (Work In Progress) 
The following was discovered as part of building this project:
This project was bootstrapped from https://start.spring.io/
## Tech Stack

**Client:**
**Server:** Java, SprintBoot
**Database:** MySQL
## Installation

**1.** MYSQL Installation and Running
* Install MySQL -using Brew
```bash
brew install mysql
```
* Start SQL 
```bash
$ brew services start mysql 
```
* or 
```bash
/usr/local/Cellar/mysql/8.0.32/bin/mysql.server start
```
MySQL runs in localhost::3306 or override in application.properties in src/main/resources/application.properties

* Set root MySQL password
```bash
  $ mysqladmin -u root password 'secretpassword'
```
You can also follow
* https://formulae.brew.sh/formula/mysql

**2.** INSTALL Maven
```bash

brew install maven
```
You can also follow
* https://formulae.brew.sh/formula/maven

**3.** Compile, Build and Run
Execute one command at a time
```bash

./mvnw compile
./mvnw install
cd target
java -jar book-api-0.0.1-SNAPSHOT.jar
```
Server Runs runs in localhost::9001 or override in application.properties in src/main/resources/application.properties


**4.** Import postman_collection.json  to PostMan to Connect to Server and test
postman_collection.json

