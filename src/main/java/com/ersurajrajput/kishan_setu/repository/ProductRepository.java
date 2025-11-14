package com.ersurajrajput.kishan_setu.repository;

import com.ersurajrajput.kishan_setu.models.ProductModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductModel, ObjectId> {
}
