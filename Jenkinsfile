pipeline {
  agent any
  stages {
    stage('Test') {
      steps {
        sh 'mvn clean install -P dev'
        step([$class: 'CucumberReportPublisher', jsonReportDirectory: ".target/cucumber-report/", jenkinsBasePath: '', fileIncludePattern: '.target/cucumber-report/reports.json'])
      }
   
      post {
        always {
          cucumber 'target/*.json'

        }

      }
    }
  }
}