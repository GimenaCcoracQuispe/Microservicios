package pe.edu.vallegrande.workshop.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class WorkshopKafkaEventDto {
    private Long id;
    private String name;
    private LocalDate dateStart;
    private LocalDate dateEnd;
    private String status;
}
