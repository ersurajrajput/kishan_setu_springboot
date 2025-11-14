package com.ersurajrajput.kishan_setu;

import com.ersurajrajput.kishan_setu.models.ProductModel;
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


}
