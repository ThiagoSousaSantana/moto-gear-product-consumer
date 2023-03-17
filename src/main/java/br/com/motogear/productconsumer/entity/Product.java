package br.com.motogear.productconsumer.entity;

import java.math.BigDecimal;
import java.util.List;

public record Product(
        String name,
        String description,
        BigDecimal price,
        List<String> imageUrls
) {}
