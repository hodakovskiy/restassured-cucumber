pipeline {
  agent any
  stages {
    stage('Test') {
      steps {
        sh 'mvn clean integration-test'
      }
      post {
        always {
          cucumber '/var/lib/jenkins/workspace/restassured-cucumber/target/CucumberTestReport.json'

        }

      }
    }
  }
}