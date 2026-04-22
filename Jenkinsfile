pipeline {
    agent any

    tools {
        jdk 'java'
        maven 'maven'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                url: 'https://github.com/Pranavgudepu/microservice.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                bat 'start cmd /c java -jar target\\jobms-0.0.1-SNAPSHOT.jar'
            }
        }
    }
    post {
        success {
            echo 'Build sucessful'
        }
        failure {
            echo 'Build failed'
        }
    }
}
