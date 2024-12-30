# JobApp - Spring Boot Web Application

**JobApp** is a Spring Boot web application designed to help users manage job applications, including features for viewing job listings and submitting applications. This repository contains the backend and frontend configuration of the application.

## Table of Contents
- [Project Overview](#project-overview)
- [Technologies Used](#technologies-used)
- [Prerequisites](#prerequisites)
- [Setup and Installation](#setup-and-installation)
- [Project Structure](#project-structure)
- [Running the Application](#running-the-application)
- [How It Works](#how-it-works)
- [Development and Testing](#development-and-testing)
- [Licenses](#licenses)

## Project Overview

JobApp is a simple Spring Boot-based web application designed to simulate a job application process. It includes:
- A user interface built with HTML, CSS, and JavaScript.
- A backend powered by Spring Boot, where users can interact with a variety of features related to job applications.

The application leverages various Spring Boot modules like `spring-boot-starter-web` for the web server and `spring-boot-starter-test` for testing. It also includes `JSTL` support for dynamic JSP pages.

### Features:
- View job listings in a stylish and responsive interface.
- Submit job applications through an intuitive web interface.
- Integration with a backend Spring Boot API to process job data.

## Technologies Used

- **Spring Boot 3.4.1**: The core framework for developing the backend.
- **JSP (Java Server Pages)**: For dynamic web pages.
- **Tomcat Jasper**: For JSP processing.
- **HTML/CSS**: Used for the frontend design.
- **Java 21**: The project is set up for Java 21.
- **Lombok**: For reducing boilerplate code (getters, setters, etc.).
- **JSTL (Jakarta Standard Tag Library)**: For reusable UI components like loops, conditionals, and internationalization support.

## Prerequisites

To run this project locally, you will need the following:

1. **Java 21** (or higher): This application is developed using Java 21. Make sure it is installed on your machine.
   - You can download Java from [AdoptOpenJDK](https://adoptopenjdk.net/) or [Oracle](https://www.oracle.com/java/technologies/javase-jdk21-downloads.html).

2. **Maven**: The project uses Maven for dependency management and build automation.
   - Install Maven from [here](https://maven.apache.org/download.cgi).

3. **IDE (Optional)**: Although you can use any text editor, it's recommended to use an IDE like **IntelliJ IDEA** or **Eclipse** for Java development.

4. **Git**: To clone the repository, you’ll need Git installed.
   - Download Git from [here](https://git-scm.com/).

## Setup and Installation

### 1. Clone the Repository

```bash
git clone https://github.com/JARVIS3954P/JobApp.git
cd JobApp
```
### 2. Import the Project into Your IDE

- Open your IDE (IntelliJ IDEA, Eclipse, etc.).
- Select **File > Open** and navigate to the directory where you cloned the project.
- Select the root folder of the project (e.g., `JobApp/`), and the IDE will automatically detect it as a Maven project.
- If you're using IntelliJ IDEA, it will prompt you to import the Maven dependencies automatically. If not, you can right-click the `pom.xml` file and select **Add as Maven Project**.
- If you're using Eclipse, go to **File > Import > Existing Maven Projects**, then select the project directory.

### 3. Install Dependencies

Once the project is imported into your IDE, the next step is to install all the necessary dependencies that the project needs to run. This can be done using Maven.

Run the following command in your terminal:

```bash
mvn clean install
````
This command will download and install all the required dependencies specified in the `pom.xml` file.

### 4. Build the Project

To build the project, use the following command:

```bash
mvn package
```
This will compile the code and package it into an executable `.jar` file, which can be used to run the application.

### 5. Run the Application

You can run the Spring Boot application locally in one of two ways:

#### Option 1: Using Maven

In the terminal, run the following command:

```bash
mvn spring-boot:run
```
#### Option 2: Running the `.jar` File Directly

After building the project, a `.jar` file will be created in the `target` directory. To run the application using the `.jar` file, use the following command:

```bash
java -jar target/JobApp-0.0.1-SNAPSHOT.jar
```
Once the application starts, you can access it via [http://localhost:8080](http://localhost:8080).

---
You should see the landing page of the JobApp. From here, users can view job listings and apply for jobs. The backend processes these requests and provides responses as needed.

---

### Folder Descriptions

- **controllers/**: Contains the Java classes that define the application's logic for handling HTTP requests.
- **models/**: Contains the data models used to represent job applications.
- **services/**: Contains the logic for business operations (e.g., handling job applications).
- **static/**: Contains the static resources such as CSS, JS files, and images.
- **templates/**: Contains the JSP files for the frontend UI.
- **application.properties**: Contains the configuration for the Spring Boot application.

---

# How It Works

### Frontend:
- The frontend is a simple and responsive UI built using HTML, CSS, and JavaScript.
- The UI includes pages to display job listings, forms to submit job applications, and more.
- The CSS files used in this project (`style.css`, `style1.css`) are designed to make the UI attractive and responsive.

### Backend:
- The backend is built with Spring Boot and is responsible for processing requests and interacting with data.
- It includes controllers for handling the web requests, services for the business logic, and models for data representation.
- JSP pages dynamically render data received from the backend.

### Database (Future Work):
- This project currently does not include a database, but it can be easily extended to connect with a database to store job listings and user applications.

---

# Development and Testing

You can run unit tests using Maven:

```bash
mvn test
```
Spring Boot's built-in testing tools, like MockMvc, are used for testing the backend.

# Conclusion
This project provides a basic example of a Spring Boot web application for job applications. It can be further extended by integrating a database, enhancing the user interface, and adding more complex features.

Feel free to contribute, report issues, or ask questions by creating an issue in the GitHub repository.

