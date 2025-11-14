package com.ersurajrajput.kishan_setu.models;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ProductModel {

    @Id
    private String id;

    @Field("name")
    private String name;

    @Field("description")
    private String description;

    @Field("category")
    private String category;     // seeds, fertilizers, tools, crops, etc.

    @Field("price")
    private Double price;

    @Field("rating")
    private Double rating = 0.0;

    @Field("no_of_reviews")
    private  int no_of_reviews;

    @Field("stock")
    private Integer stock;        // quantity available

    @Field("images")
    private List<String> images;  // image URLs (Firebase, Cloudinary, etc.)

    @Field("farmerId")
    private String farmerId;// Reference to Farmer (IMPORTANT)

    @CreatedDate
    @Field("createdAt")
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Field("updatedAt")
    private LocalDateTime updatedAt;
}
