package br.com.motogear.productconsumer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Document
public record Product(
        @Id
        String id,
        String name,
        String description,
        BigDecimal price,
        List<String> imageUrls
) { }
