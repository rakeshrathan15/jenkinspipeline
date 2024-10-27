pipeline {
    agent any
    
    environment {
        repositoryURL ="rakeshrathan12/jenkinspractice"
        registryCredentials = "Docker-hub"
        dockerImage = ''
    }
    
    tools {
        maven 'Maven'
    }

    stages {
        stage('Checkout') {
            steps {
               checkout poll: false, scm: scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/rakeshrathan15/jenkinspipeline.git']])
            }
        }
        
         stage('Build') {
            steps {
              sh 'mvn clean install'
            }
        }
        
        stage('Inspect'){
            environment {
                scannerHome = tool 'sonarqubescanner';
                
            }
            steps {
                withSonarQubeEnv(credentialsId: 'sonartoken' , installationName:'mylocalsonarqube'){
                    sh 'mvn clean verify sonar:sonar -Dsonar.projectKey=myfirstsonarqube -Dsonar.host.url=http://localhost:9000 -Dsonar.login=sqp_9a3a370ddbff7cf36e974f11c9751220eca98c54'
                }
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
