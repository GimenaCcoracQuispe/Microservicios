pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Construyendo...'
            }
        }
    }

    post {
        success {
            slackSend(channel: '#nuevo-canal', message: '✅ Build exitoso.')
        }
        failure {
            slackSend(channel: '#nuevo-canal', message: '❌ Build fallido.')
        }
    }
}
