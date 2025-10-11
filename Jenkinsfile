pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Mohammed-Nabil99/PrestaShop_TestAutomation_BDD.git'
            }
        }

        stage('Build & Test') {
            steps {
                script {
                    if (isUnix()) {
                        sh '"$MAVEN_HOME/bin/mvn" test -Pe2e'
                    } else {
                        bat '"%MAVEN_HOME%\\bin\\mvn" test -Pe2e'
                    }
                }
            }
        }

        stage('Results') {
            steps {
                junit '**/target/surefire-reports/TEST-*.xml'
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }
}
