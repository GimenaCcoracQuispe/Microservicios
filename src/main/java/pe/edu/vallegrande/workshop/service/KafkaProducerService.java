package pe.edu.vallegrande.workshop.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import pe.edu.vallegrande.workshop.dto.WorkshopKafkaEventDto;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final ObjectMapper objectMapper;

    private static final String TOPIC = "workshop-events";


    public void sendWorkshopEvent(WorkshopKafkaEventDto eventDto) {
        try {
            String message = objectMapper.writeValueAsString(eventDto);
            kafkaTemplate.send(TOPIC, String.valueOf(eventDto.getId()), message);
            // ✅ Log de éxito
            log.info("✅ Evento enviado a Kafka -> Topic: {}, Key: {}, Payload: {}", TOPIC, eventDto.getId(), message);
        } catch (Exception e) {
            // ❌ Log de error si falla la serialización o envío
            log.error("❌ Error al enviar evento a Kafka: {}", e.getMessage(), e);
        }
    }
}
