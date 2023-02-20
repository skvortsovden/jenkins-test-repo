pipeline {
    agent any
    stages {
        stage('test') {
            steps {
                checkout scm
                load 'jenkins/reportGenerator.groovy'
                sh 'ls -al'
                
            }
        }
    }
}
