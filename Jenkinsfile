pipeline {
    agent any

    environment {
        repositoryURL ="rakeshrathan12/jenkinspractice9"
        registryCredentials = "Docker-hub"
        dockerImage = ''
    }

    tools {
        maven 'Maven'
    }

    stages {
        stage('Checkout') {
            steps {
               checkout changelog: false, poll: false, scm: scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/rakeshrathan15/jenkinspipeline.git']])
            }
        }

         stage('Build') {
            steps {
              sh 'mvn clean install'
            }
        }

        stage('Build image') {
            steps {
             script {
                 dockerImage = docker.build repositoryURL + ":$BUILD_NUMBER"
             }
            }
        }

        stage('Publish Image') {
            steps {
             script {
                 docker.withRegistry('',registryCredentials){
                     dockerImage.push()
                 }
             }


            }
        }



    }
}
