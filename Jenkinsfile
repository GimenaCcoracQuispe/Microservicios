pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Construyendo...'
                // Aquí puedes agregar el comando para compilar tu proyecto, por ejemplo:
                sh 'mvn clean install'  // Usando Maven
                // O si usas Gradle, sería algo como:
                // sh './gradlew build'
            }
        }
    }

    post {
        success {
            slackSend(channel: '#notificaciones-dev', message: '✅ Build exitoso.')
        }
        failure {
            slackSend(channel: '#notificaciones-dev', message: '❌ Build fallido.')
        }
    }
}
