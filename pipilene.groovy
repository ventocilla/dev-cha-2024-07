pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'terraform init'
        sh 'terraform apply -auto-approve'
      }
    }
    stage('Deploy') {
      steps {
        sh 'ansible-playbook -i hosts playbook.yml'
      }
    }
  }
}