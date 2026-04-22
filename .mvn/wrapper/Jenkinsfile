pipeline {
    agent any

    tools {
        jdk 'JDK25'
        maven 'Maven3'
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

        stage('Deploy') {
            steps {
                bat 'start cmd /c java -jar target\\jobms-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}
