package com.almeida.coding.mongodemo.category;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Document
@Data
@AllArgsConstructor
@Builder

public class Category {

    private String id;

    private String name;

    private String description;

}
