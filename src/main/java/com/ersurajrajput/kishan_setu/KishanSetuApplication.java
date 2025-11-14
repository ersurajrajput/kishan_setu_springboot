package com.ersurajrajput.kishan_setu;

import com.ersurajrajput.kishan_setu.models.CoursesModel;
import com.ersurajrajput.kishan_setu.models.ProductModel;
import com.ersurajrajput.kishan_setu.repository.CoursesRepository;
import com.ersurajrajput.kishan_setu.repository.ProductRepository;
import org.bson.types.ObjectId;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class KishanSetuApplication {

	public static void main(String[] args) {
		SpringApplication.run(KishanSetuApplication.class, args);
	}
//    @Bean
//    CommandLineRunner seedProducts(ProductRepository repo) {
//        return args -> {
//
//            if (repo.count() > 0) return; // avoid duplicate insert
//
//            List<String> categories = List.of(
//                    "seeds", "fertilizers", "pesticides", "tools", "machinery", "crops"
//            );
//
//            List<String> sampleNames = List.of(
//                    "Hybrid Tomato Seeds", "Organic NPK Fertilizer", "Eco Pesticide",
//                    "Hand Cultivator", "Rotavator Machine", "Wheat (50kg)",
//                    "Groundnut Seeds", "Urea Fertilizer", "Bio Pesticide",
//                    "Steel Spade", "Mini Tractor", "Fresh Rice (50kg)",
//                    "Mustard Seeds", "DAP Fertilizer", "Neem Oil Spray",
//                    "Hand Shovel", "Water Pump Set", "Barley (40kg)",
//                    "Maize Seeds", "Potash Fertilizer", "Crop Shield Spray",
//                    "Garden Rake", "Power Tiller", "Sugarcane (40kg)"
//            );
//
//            List<ProductModel> products = new ArrayList<>();
//
//            for (int i = 1; i <= 100; i++) {
//                String name = sampleNames.get((int) (Math.random() * sampleNames.size()));
//                String category = categories.get((int) (Math.random() * categories.size()));
//
//                ProductModel product = ProductModel.builder()
//                        .name(name + " #" + i)
//                        .description("High-quality " + name + " suitable for all farming needs.")
//                        .category(category)
//                        .price(50 + (Math.random() * 2000))      // 50–2000 INR
//                        .stock(5 + (int) (Math.random() * 200))  // 5–200 units
//                        .images(List.of(
//                                "https://example.com/product_" + i + "_img1.jpg",
//                                "https://example.com/product_" + i + "_img2.jpg"
//
//                        ))
//                        .farmerId(new String("6735c92a3d2794a524a0c10" +
//                                (int) (Math.random() * 9))) // random farmerId
//
//                        .createdAt(LocalDateTime.now().minusDays((int) (Math.random() * 30)))
//                        .updatedAt(LocalDateTime.now())
//                        .build();
//
//                products.add(product);
//            }
//
//            repo.saveAll(products);
//
//            System.out.println("✔ Inserted 100 fake products!");
//        };
//    }

    @Bean
    CommandLineRunner seedCourses(CoursesRepository repo) {
        return args -> {

            if (repo.count() > 0) return; // avoid duplicate insert

            List<String> categories = List.of(
                    "Organic Farming", "Irrigation Techniques", "Crop Protection",
                    "Soil Management", "Livestock Care", "Agri-Machinery"
            );

            List<String> sampleTitles = List.of(
                    "Introduction to Organic Farming", "Advanced Irrigation Methods", "Pest Management 101",
                    "Soil Fertility & Nutrition", "Dairy Farming Basics", "Tractor Handling & Safety",
                    "Vegetable Cultivation", "Fruit Orchard Management", "Greenhouse Farming",
                    "Water Conservation Techniques", "Crop Rotation Strategies", "Fertilizer Management"
            );

            List<CoursesModel> courses = new ArrayList<>();

            for (int i = 1; i <= 50; i++) {
                String title = sampleTitles.get((int) (Math.random() * sampleTitles.size()));
                String category = categories.get((int) (Math.random() * categories.size()));

                CoursesModel course = new CoursesModel();
                course.setId("course_" + i);
                course.setTitle(title + " #" + i);
                course.setDescription("Comprehensive course on " + title + " for farmers.");
                course.setCategory(category);
                course.setRating(Math.round((3 + Math.random() * 2) * 10.0) / 10.0); // 3.0–5.0
                course.setTotalReviews(5 + (int) (Math.random() * 100)); // 5–105 reviews
                course.setDuration(1 + (int) (Math.random() * 20)); // 1–20 hours
                course.setPrice(Math.round((0 + Math.random() * 2000) * 100.0) / 100.0); // 0–2000 INR
                course.setVideoUrl("https://example.com/course_" + i + "_video.mp4");
                course.setImages(List.of(
                        "https://example.com/course_" + i + "_img1.jpg",
                        "https://example.com/course_" + i + "_img2.jpg"
                ));

                courses.add(course);
            }

            repo.saveAll(courses);

            System.out.println("✔ Inserted 50 fake courses!");
        };
    }

}
