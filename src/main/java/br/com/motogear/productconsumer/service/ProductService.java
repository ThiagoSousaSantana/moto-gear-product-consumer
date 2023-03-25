package br.com.motogear.productconsumer.service;

import br.com.motogear.product.ProductPost;
import br.com.motogear.productconsumer.model.Product;
import br.com.motogear.productconsumer.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class ProductService {

    private ProductRepository repository;

    public void save(ProductPost productPost) {
        final var product = new Product(
                null,
                productPost.getName(),
                productPost.getDescription(),
                BigDecimal.valueOf(productPost.getPrice()),
                List.of());

        repository.save(product);
        log.info("Product saved successfully");
    }
}
