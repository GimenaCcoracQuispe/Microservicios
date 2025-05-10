pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Hola mundo desde Jenkins'
            }
        }
    }

    post {
        always {
            slackSend(channel: '#notificaciones-dev', message: '📢 Prueba: El build ha finalizado.')
        }
    }
}
