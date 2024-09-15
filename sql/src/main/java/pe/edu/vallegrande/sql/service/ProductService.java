package pe.edu.vallegrande.sql.service;

import pe.edu.vallegrande.sql.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import pe.edu.vallegrande.sql.repository.ProductRepository;

@Service
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Flux<Product>findAllProduct(){
        return productRepository.findAll();
    }

    public Flux<Product>findStatus(String status){
        return productRepository.findAllByStatus(status);
    }


}
