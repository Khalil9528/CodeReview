**Password Strength Calculator**

The Password Strength Calculator is a tool designed to evaluate password security. Initially developed as an intern's prototype, the project has been refactored and enhanced to meet professional standards, ensuring maintainability, scalability, and open-source compliance. The goal of this project is to transform a functional prototype into an industry-ready application with improvements to code quality, performance, and secure distribution. This includes adhering to coding standards, implementing thorough testing, and integrating CI/CD workflows. The tool evaluates password strength based on character length, diversity, and complexity, and it features a refactored codebase with comprehensive documentation and Javadoc comments. It also incorporates CI/CD pipelines for automated workflows and is licensed to restrict commercial use.

**Installation**

To use this tool, ensure you have Java 17 or higher, Maven or Gradle, and Git installed. Clone the repository with git clone https://github.com/Fisjkars/CodeReview.git and navigate to the project folder using cd CodeReview. Build the project with mvn clean install, and then run the application using java -jar target/password-strength-calculator-<version>.jar.

**Usage**

The application can be used as a Command-Line Tool by running the JAR file and entering a password when prompted to receive a strength evaluation. Alternatively, it can be integrated as a library in other Java projects. For Maven integration, include the dependency:

**xml**

Copier le code
<dependency>
    <groupId>com.example</groupId>
    <artifactId>password-strength-calculator</artifactId>
    <version>1.0.0</version>
</dependency>

**Contributing**

Contributions are welcome to improve the project. To contribute, fork the repository, create a new branch using git checkout -b feature-name, commit your changes with git commit -m "Description of feature or fix", push your branch using git push origin feature-name, and open a pull request. Ensure all contributions meet the project's guidelines.

**Testing**

The project includes unit tests to cover core functionality, performance tests focusing on the ComputeMD5 method, and security testing using static analysis tools like Semgrep. A coverage goal of 90% is enforced with Cobertura.

**CI/CD Workflow**

Each pull request triggers automated checks for code style validation (Checkstyle), unit test execution (all must pass), performance tests, and security analysis with tools like Semgrep. For each main modification, the project builds and deploys a version to the GitHub Maven registry, deploys Javadoc documentation and Cobertura reports to GitHub Pages.

**License**

This project is licensed under the MIT License but restricts commercial use to prevent misuse by competitors.
