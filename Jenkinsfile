pipeline {
  agent any
  stages {
    stage('Test') {
      steps {
        sh 'mvn clean integration-test'
      }
      post {
        always {
          cucumber 'target/*.json'

        }

      }
    }
  }
}