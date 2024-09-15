package pe.edu.vallegrande.sql.repository;

import org.springframework.stereotype.Repository;
import pe.edu.vallegrande.sql.entity.Product;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

@Repository
public interface ProductRepository extends ReactiveCrudRepository<Product, Long> {
    Flux<Product> findAllByStatus(String status);
}
