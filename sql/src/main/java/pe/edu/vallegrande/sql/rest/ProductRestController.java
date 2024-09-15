package pe.edu.vallegrande.sql.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.vallegrande.sql.entity.Product;
import pe.edu.vallegrande.sql.service.ProductService;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/products")
@Slf4j
public class ProductRestController {

    private final ProductService productService;

    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public Flux<Product> GetProducts(){
        return productService.findAllProduct();
    }

    @GetMapping("/activos")
    public Flux<Product> GetActiveProducts(){
        return productService.findStatus("A");
    }

    @GetMapping("/inactivos")
    public Flux<Product> GetInactiveProducts(){
        return productService.findStatus("I");
    }
}
