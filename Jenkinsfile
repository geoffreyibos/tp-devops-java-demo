pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/TON-USER/TON-REPO.git'
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean verify'
            }
        }
    }
}
