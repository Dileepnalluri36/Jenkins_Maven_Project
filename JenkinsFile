pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
              echo 'Build App'
            }

       
        }
          stage('Test') {
            steps {
                // Get some code from a GitHub repository
              echo 'Test App'
            }

       
        }
          stage('Deploy') {
            steps {
                // Get some code from a GitHub repository
              echo 'Deploy app'
            }

       
        }
    }
    
    post {
        always {
          emailext body: 'Summary of Pipeline', subject: 'Pipeline Status', to: 'dileepnalluri3638@gmail.com'  
        }
    }
}
