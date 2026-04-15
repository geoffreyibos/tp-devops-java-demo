pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean verify'
            }
        }
        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    bat 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:sonar'
                }
            }
        }
    }
}
