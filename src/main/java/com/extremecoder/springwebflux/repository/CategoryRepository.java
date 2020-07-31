package com.extremecoder.springwebflux.repository;

import com.extremecoder.springwebflux.model.Category;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends ReactiveCrudRepository<Category, Integer> {
}