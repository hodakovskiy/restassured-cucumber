pipeline {
  agent any
  stages {
    stage('Test') {
      steps {
        sh 'mvn integration-test'
      }
      post {
        always {
          cucumber '/var/lib/jenkins/workspace/restassured-cucumber/target/CucumberTestReport.json'

        }

      }
    }
  }
}