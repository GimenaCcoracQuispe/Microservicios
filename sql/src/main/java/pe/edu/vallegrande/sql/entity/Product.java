package pe.edu.vallegrande.sql.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Getter
@Setter
@Table("Product")
public class Product {
    @Id
    private Long id;
    private String name;
    private String price;
    private String status;
}
