pipeline {
  agent any
  stages {
    stage('Test') {
      steps {
        sh 'mvn clean install -P dev'
        step([$class: 'CucumberReportPublisher', jsonReportDirectory: "./Build/temp/", jenkinsBasePath: '', fileIncludePattern: 'target/cucumber-report/reports.json'])
      }
   
      post {
        always {
          cucumber 'target/*.json'

        }

      }
    }
  }
}