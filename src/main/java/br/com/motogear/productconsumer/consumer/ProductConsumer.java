package br.com.motogear.productconsumer.consumer;

import br.com.motogear.product.ProductPost;
import br.com.motogear.productconsumer.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ProductConsumer {

    private ProductService productService;

    @KafkaListener(topics = "product-post", id = "product-consumer")
    public void consume(@Payload ProductPost productPost) {
        productService.save(productPost);
    }

}
