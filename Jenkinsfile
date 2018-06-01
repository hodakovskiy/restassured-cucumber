pipeline {
  agent any
  stages {
    stage('Test') {
      steps {
        sh 'mvn clean install'
      }
   
      post {
        always {
          cucumber 'target/cucumber-report/*.json'

        }

      }
    }
  }
}