package com.ersurajrajput.kishan_setu.models;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "courses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CoursesModel {

    private String id;             // Unique ID for the course
    private String title;          // Course title
    private String description;    // Course description
    private String category;       // Type of course, e.g., "Organic Farming", "Irrigation Techniques"
    private double rating;         // Average rating (out of 5)
    private int totalReviews;      // Number of reviews
    private List<String> images;   // URLs of course images
    private int duration;          // Duration in hours
    private double price;          // Price (if any)
    private String videoUrl;       // Optional video link for the course
}
