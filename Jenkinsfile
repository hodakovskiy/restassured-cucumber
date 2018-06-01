pipeline {
  agent any
  stages {
    stage('Test') {
      steps {
        sh 'mvn clean install -P dev'
      }
      post {
        always {
          cucumber 'target/*.json'

        }

      }
    }
  }
}