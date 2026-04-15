pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/geoffreyibos/tp-devops-java-demo.git'
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean verify'
            }
        }
    }
}
