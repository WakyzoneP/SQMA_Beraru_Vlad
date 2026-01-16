pipeline {
    agent any

    tools {
        jdk 'JDK_17'
        maven 'Maven_3'
    }

    parameters {
        choice(
            name: 'TEST_CLASS',
            choices: [
                'WalletSetBalanceTest',
                'WalletAddMoneyTest',
                'WalletWithdrawMoneyTest',
                'WalletSetPinTest'
            ],
            description: 'Select which test class to run'
        )
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'java -version'
                sh 'mvn -version'
                sh 'mvn clean compile'
            }
        }

        stage('Run Selected Test') {
            steps {
                sh "mvn -Dtest=eu.dice.ism.sqma.vladberaru.wallet.${TEST_CLASS} test"
            }
        }
    }

    post {
        success {
            echo 'Build and selected test executed successfully.'
        }
        failure {
            echo 'Test execution failed.'
        }
    }
}
