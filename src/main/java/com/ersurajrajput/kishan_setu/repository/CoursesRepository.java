package com.ersurajrajput.kishan_setu.repository;

import com.ersurajrajput.kishan_setu.models.CoursesModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CoursesRepository extends MongoRepository<CoursesModel, ObjectId> {
}
