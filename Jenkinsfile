pipeline {
  agent any
  stages {
    stage('Test') {
      steps {
        sh 'mvn integration-test'
      }
      post {
        always {
          cucumber 'target/*.json'

        }

      }
    }
  }
}