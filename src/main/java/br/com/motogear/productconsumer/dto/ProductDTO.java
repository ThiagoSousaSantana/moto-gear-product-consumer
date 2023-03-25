package br.com.motogear.productconsumer.dto;

import java.math.BigDecimal;
import java.util.List;

public record ProductDTO(
        String name,
        String description,
        BigDecimal price,
        List<String> imageUrls
) {}
