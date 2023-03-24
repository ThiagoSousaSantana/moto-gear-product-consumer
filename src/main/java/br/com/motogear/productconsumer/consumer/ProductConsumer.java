package br.com.motogear.productconsumer.consumer;

import br.com.motogear.product.ProductPost;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class ProductConsumer {

    @KafkaListener(topics = "product-post", id = "product-consumer")
    public void consume(@Payload ProductPost productDTO) {
        System.out.println(productDTO);
    }

}
