pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'JDK17'
    }

    environment {
        SONAR_HOST_URL = credentials('sonar-host-url')
        SONAR_TOKEN = credentials('sonar-token')
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvn clean verify'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                    jacoco execPattern: 'target/jacoco.exec'
                }
            }
        }

        stage('SonarQube Analysis') {
            steps {
                bat 'mvn sonar:sonar -Dsonar.host.url=%SONAR_HOST_URL% -Dsonar.token=%SONAR_TOKEN%'
            }
        }

        stage('Publish to Nexus') {
            when {
                branch 'main'
            }
            steps {
                bat 'mvn deploy -DskipTests'
            }
        }
    }
}
